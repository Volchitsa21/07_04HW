package items;

public class NewsPortal extends MassMedia{
    String url;

    public NewsPortal(String name, String url) {
        super(name);
        this.url = url;
    }

    public NewsPortal() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
