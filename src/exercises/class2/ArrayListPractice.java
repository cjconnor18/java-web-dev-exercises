package exercises.class2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(7);
        nums.add(5);
        nums.add(7);
        nums.add(5);
        nums.add(7);
        nums.add(5);
        nums.add(7);
        nums.add(5);
        nums.add(7);
        nums.add(5);
        nums.add(7);
        Integer total = sum(nums);
        System.out.println(total);

        ArrayList<String> currentList = new ArrayList<>();
        currentList.add("Hello");
        currentList.add("Student");
        currentList.add("Cat");
        currentList.add("Dog");
        currentList.add("Study");

        Scanner input = new Scanner(System.in);


        printWord(currentList, input);

        String longString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String newString = longString.replace("//.", "");
        newString = newString.replace("//,", "");
        ArrayList<String> previousList = new ArrayList<>(Arrays.asList(newString.split(" ")));
        printWord(previousList, input);

        input.close();
    }
    public static Integer sum(ArrayList<Integer> arrList) {
        Integer total = 0;
        for (Integer num : arrList) {
            total += num;
        }
        return total;
    }

    public static void printWord(ArrayList<String> words, Scanner input) {
        System.out.println("What length of word do you want to search for? ");


        int selectedLength = input.nextInt();

        for ( String word : words) {
            if(word.length() == selectedLength) {
                System.out.println(word);
            }
        }
    }
}
