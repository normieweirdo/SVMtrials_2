import java.util.Scanner;

public class prog1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even = 0;
        int odd = 0;

        System.out.println("Input 10 numbers:");

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();

            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Number of even numbers are: " + even);
        System.out.println("Number of odd numbers are: " + odd);

    }
}