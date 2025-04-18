import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Mad Libs Game!");

        System.out.print("Enter a noun: ");
        String noun1 = scanner.nextLine();

        System.out.print("Enter another noun: ");
        String noun2 = scanner.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = scanner.nextLine();

        System.out.print("Enter a verb: ");
        String verb = scanner.nextLine();

        System.out.println("\nHere's your Mad Libs story:\n");

        System.out.println("The " + adjective + " " + noun1 + " decided to " + verb + " with a " + noun2 + ".");
        System.out.println("Nobody expected that, but it was the best decision ever!");

        scanner.close();
    }
}
