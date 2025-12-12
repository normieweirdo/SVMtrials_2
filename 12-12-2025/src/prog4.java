import java.util.Scanner;

public class prog4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Palindrome Checker ---");
        System.out.print("Enter a number to check: ");

        int originalNumber = sc.nextInt();
        int num = originalNumber;
        int reversedNumber = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            num = num / 10;
        }

        if (originalNumber == reversedNumber) {
            System.out.println("Result: The number is a PALINDROME.");
        } else {
            System.out.println("Result: The number is NOT a palindrome.");
        }
    }
}