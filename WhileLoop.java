import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);
        String userResponse = "";
        displayWelcomeMessage();

        while (!isExitCommand(userResponse)) {
            System.out.print("Please enter your word: ");
            userResponse = userInputScanner.nextLine();

            processUserInput(userResponse);
        }
        System.out.println("Program terminated. Have a great day!");
        userInputScanner.close();
    }
    private static boolean isExitCommand(String input) {
        return input.equalsIgnoreCase("exit");
    }
    private static void displayWelcomeMessage() {
        System.out.println("Welcome to Word Echo Program!");
        System.out.println("Enter words to see them repeated. Type 'exit' to end program.");
    }
    private static void processUserInput(String input) {
        if (!isExitCommand(input)) {
            System.out.println("Echo: " + input);
        }
    }
}
