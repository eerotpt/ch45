/**
 * Created by opilane on 21.10.2016.
 */
import java.util.Random;

public class ch4harjutused {
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println(number);
        double root = Math.sqrt(17.0);
        double angle = 1.5;
        double height = Math.sin(angle);
        System.out.println(root);
        System.out.println(height);

        double degrees = 90;
        double angle1 = degrees / 180.0 * Math.PI;


    }
}
