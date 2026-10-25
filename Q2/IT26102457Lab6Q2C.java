import java.util.Scanner;

public class IT26102457Lab6Q2C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        double sum = 0;

        System.out.println("Please enter 10 numbers:");

        // loop counters MUST be int
        int i = 0;
        while (i < 10) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble(); // Changed to nextDouble() to match double array
            sum = sum + numbers[i];
            i = i + 1;
        }

        // Calculate average
        double average = sum / 10;

        // Print the entered numbers
        System.out.println("\nThe numbers you entered are:");
        int j = 0;
        while (j < 10) {
            System.out.print(numbers[j] + " ");
            j++;
        }
        System.out.println();

        // Print Sum and Average
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        scanner.close();
    }
}