/**
 * Created by emma on 7/10/17.
 */

/**
 * Interactive is a combination of the four interfaces. It also has a name.
 */

public abstract class Interactive implements Drawable, Resizable, Rotatable, Sounds {

    private String name;

    public abstract void drawObject();
    public abstract void resizeObject();
    public abstract void rotateObject();
    public abstract void playSound();

}
