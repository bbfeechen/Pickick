package avator.pickick.dblayout;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;

public class DatabaseConnector {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "Student";
    private static final String TABLE_NAME = "Score";

    private SQLiteDatabase database;
    private DatabaseOpenHelper databaseOpenHelper;

    public DatabaseConnector(Context context) {
        databaseOpenHelper =
                new DatabaseOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void open() throws SQLException {
        database = databaseOpenHelper.getWritableDatabase();
    }

    public void close() {
        if (database != null)
            database.close();
    }

    public void insertContact(int stud, int q1, int q2,
                              int q3, int q4, int q5) {
        ContentValues newContact = new ContentValues();
        newContact.put("Stud", stud);
        newContact.put("Q1", q1);
        newContact.put("Q2", q2);
        newContact.put("Q3", q3);
        newContact.put("Q4", q4);
        newContact.put("Q5", q5);

        open();
        database.insert(TABLE_NAME, null, newContact);
        close();
    }

    public void updateContact(long id, int stud, int q1, int q2,
                              int q3, int q4, int q5) {
        ContentValues editContact = new ContentValues();
        editContact.put("Stud", stud);
        editContact.put("Q1", q1);
        editContact.put("Q2", q2);
        editContact.put("Q3", q3);
        editContact.put("Q4", q4);
        editContact.put("Q5", q5);

        open();
        database.update(TABLE_NAME, editContact, "_id=" + id, null);
        close();
    }

    public Cursor getAllRecords() {
        String selectQuery = "SELECT  * FROM " + TABLE_NAME;
        return database.rawQuery(selectQuery, null);
    }

    public Cursor getOneRecord(long id) {
        return database.query(
                TABLE_NAME, null, "_id=" + id, null, null, null, null);
    }

    public int getRecordCount() {
        String selectQuery = "SELECT  * FROM " + TABLE_NAME;
        Cursor cursor = database.rawQuery(selectQuery, null);
        cursor.close();
        return cursor.getCount();
    }

    public void deleteRecord(long id) {
        open();
        database.delete(TABLE_NAME, "_id=" + id, null);
        close();
    }

    private class DatabaseOpenHelper extends SQLiteOpenHelper {
        public DatabaseOpenHelper(Context context, String name,
                                  CursorFactory factory, int version) {
            super(context, name, factory, version);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            String createQuery = "CREATE TABLE " + TABLE_NAME +
                    "(_id integer primary key autoincrement," +
                    "Stud INTEGER, Q1 INTEGER, Q2 INTEGER," +
                    "Q3 INTEGER, Q4 INTEGER, Q5 INTEGER)";

            db.execSQL(createQuery);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion,
                              int newVersion) {
        }
    }
}