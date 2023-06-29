package app.uni.lar.models;

public class Category {
    private String title;
    private int imageID;

    public Category(String title, int imageID) {
        this.title = title;
        this.imageID = imageID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }
}
