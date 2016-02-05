package avator.pickick.entities;

import android.graphics.Bitmap;
import android.net.Uri;

import java.util.Date;

public class Picture {
    private Bitmap content;

    private String picName;
    private Date time;
    private String location;

    public Uri getUri() {
        return null;
    }

    public String getGeoInfo() {
        return null;
    }

    public boolean deleteSync() {
        return true;
    }
}
