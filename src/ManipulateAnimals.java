/**
 * Created by emma on 7/10/17.
 */

/**
 * ManipulateAnimals is the driver class.
 */

public class ManipulateAnimals {

    public static void main(String[] args) {

        Interactive animal1 = new Animal();
        Interactive animal2 = new Animal();
        Interactive vehicle1 = new Vehicle();
        Interactive vehicle2 = new Vehicle();

        Interactive[] things = {animal1, animal2, vehicle1, vehicle2};

        for(int i = 0; i < things.length; i++) {
            things[i].drawObject();
            things[i].rotateObject();
            things[i].resizeObject();
            things[i].playSound();
        }

    }

}
