package exercises.class2;

import java.util.Arrays;

public class ArrayExercise {
    public static void main(String[] args) {
        int[] someArr= {1,1,2,3,5,8};
        print(someArr, "all");
        print(someArr, "odds");

        String longString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] arrOfString = longString.split("\\.");
        System.out.println(Arrays.toString(arrOfString));

    }

    public static void print(int[] anArr, String category) {
        if(category.toLowerCase().equals("all")) {
            for ( int num : anArr) {
                System.out.println(num);
            }
        } else if (category.toLowerCase().equals("odds")) {
            for (int num : anArr) {
                if(num % 2 == 1) {
                    System.out.println(num);
                }
            }
        }
    }

}
