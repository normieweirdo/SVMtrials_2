import java.util.Scanner;

public class prog6 {
    static void subtract(int a, int b) {
        System.out.println("Int Result: " + (a - b));
    }
    static void subtract(double a, double b) {
        System.out.println("Double Result: " + (a - b));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        subtract(sc.nextInt(), sc.nextInt());
        System.out.print("Enter two doubles: ");
        subtract(sc.nextDouble(), sc.nextDouble());
    }
}