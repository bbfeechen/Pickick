package avator.pickick.entities;

public class PicView extends PictureManager implements PicHandler {
    public boolean deletePicSync(String picName) {
        return super.deletePicSync(picName);
    }

    public boolean addPicSync(String picName) {
        return super.addPicSync(picName);
    }

    public boolean EditPic(String picName) {
        return super.EditPic(picName);
    }
}
