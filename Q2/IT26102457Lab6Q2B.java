import java.util.Scanner;

public class IT26102457Lab6Q2B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Please enter 10 numbers:");

        // while loop to accept 10 numbers from keyboard input
        int i = 0;
        while (i < 10) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            i=i+1;
        }

        // while loop to print the entered numbers
        System.out.println("\nThe numbers you entered are:");
        int j = 0;
        while (j < 10) {
            System.out.print(numbers[j] + " ");
            j=j+1;
        }
        
    }
}