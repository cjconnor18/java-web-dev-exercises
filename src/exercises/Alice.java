package exercises;
import java.util.Locale;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String wonderland = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        System.out.println("Please enter a search term: ");
        String searchTerm = input.next();

        Boolean hasSearchTerm = wonderland.toLowerCase().contains(searchTerm.toLowerCase());
        int index = wonderland.toLowerCase().indexOf(searchTerm.toLowerCase());
        int length = searchTerm.length();
        String newWonderland = wonderland.substring(0,index).concat(wonderland.substring(index+length, wonderland.length()));


        System.out.println("Is the search term included: " + hasSearchTerm);
        System.out.println(newWonderland);
        input.close();
    }
}
