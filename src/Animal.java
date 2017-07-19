/**
 * Created by emma on 7/10/17.
 */

/**
 * Animal has a name and is a subclass of Interactive.
 */

public class Animal extends Interactive {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void drawObject() {
        System.out.println("Drawing an Animal");
    }

    public void rotateObject() {
        System.out.println("Rotating an Animal");
    }

    public void playSound() {
        System.out.println("Animal Sound");
    }

    public void resizeObject() {
        System.out.println("Resizing an Animal");
    }

}
