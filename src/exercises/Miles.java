package exercises;
import java.util.Scanner;

public class Miles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        Double milesDriven = input.nextDouble();

        System.out.println("How many gallons of gas did you use?");
        Double gasConsumed = input.nextDouble();

        Double milesPerGallon = milesDriven / gasConsumed;

        System.out.println("Miles Per Gallon: " + milesPerGallon);

        input.close();
    }
}
