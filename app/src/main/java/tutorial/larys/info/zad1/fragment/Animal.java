package tutorial.larys.info.zad1.fragment;

/**
 * Created by Piotr on 2016-04-10.
 */
public class Animal {
    private int image;
    private String name;
    private String description;

    public Animal(int image, String name, String description) {
        this.image = image;
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
