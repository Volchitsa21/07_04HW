package items;

public abstract class MassMedia {
    String name;

    public MassMedia(String name) {
        this.name = name;
    }

    public MassMedia() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
