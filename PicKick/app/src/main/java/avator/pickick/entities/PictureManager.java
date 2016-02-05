package avator.pickick.entities;

import java.util.List;

public abstract class PictureManager {
    private List<Picture> pics;

    public List<Picture> getPics() {
        return pics;
    }

    public boolean deletePicSync(String picName) {
        return true;
    }

    public boolean addPicSync(String picName) {
        return true;
    }

    public boolean EditPic(String picName) {
        return true;
    }
}
