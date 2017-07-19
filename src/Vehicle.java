/**
 * Created by emma on 7/10/17.
 */
public class Vehicle extends Interactive {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void drawObject() {
        System.out.println("Drawing a Vehicle");
    }

    public void rotateObject() {
        System.out.println("Rotating a Vehicle");
    }

    public void playSound() {
        System.out.println("Vehicle Sound");
    }

    public void resizeObject() {
        System.out.println("Resizing a Vehicle");
    }

}
