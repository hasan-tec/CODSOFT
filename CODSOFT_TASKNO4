import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose conversion direction (1: USD to GBP, 2: GBP to USD): ");
        int conversionDirection = scanner.nextInt();

        double exchangeRate;
        if (conversionDirection == 1) {
            exchangeRate = 0.79; // USD to GBP
        } else if (conversionDirection == 2) {
            exchangeRate = 1.27; // GBP to USD
        } else {
            System.out.println("Invalid choice. Exiting program.");
            return;
        }

        System.out.print("Enter the amount to convert: ");
        double amountToConvert = scanner.nextDouble();

        double convertedAmount = amountToConvert * exchangeRate;

        System.out.println("Converted Amount: " + convertedAmount);
    }
}
