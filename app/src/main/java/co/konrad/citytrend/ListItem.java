package co.konrad.citytrend;

public class ListItem {
    private String head;
    private String desc;
    private String imageURL;

    public ListItem(String head, String desc, String imageURL) {
        this.head = head;
        this.desc = desc;
        this.imageURL = imageURL;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
