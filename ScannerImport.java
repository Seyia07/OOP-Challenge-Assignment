import java.util.Scanner;

public class ScannerImport{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a message: ");
        String message = scanner.nextLine();

        System.out.println("You entered: " + message);

        scanner.close();
    }
}