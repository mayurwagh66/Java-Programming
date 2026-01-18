import java.util.Scanner;

public class SumofDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");   
        int number = sc.nextInt();
        int sum = 0;

        while (number > 0) {
            sum = sum + number % 10; // Add the last digit to sum
            number /= 10;       // Remove the last digit
        }

        System.out.println("Sum of digits: " + sum);
    }
}
