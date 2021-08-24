package exercises;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        greet();
    }

    public static void greet () {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is your name?");
        String name = input.next();
        input.close();
        System.out.println("Hello " + name);
    }
}
