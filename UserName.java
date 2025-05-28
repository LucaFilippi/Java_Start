import java.util.Scanner;

public class UserName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creates a Scanner object to read user input

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Reads the name entered by the user and stores it in the 'name' variable

        System.out.println("Hello, " + name + "!"); // Just to confirm that the name was saved

        scanner.close(); // Closes the scanner
    }
}
