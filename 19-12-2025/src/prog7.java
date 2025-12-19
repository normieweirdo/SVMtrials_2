import java.util.Scanner;

class Rect7 {
    double l, b;
    Rect7() {
        l = 0;
        b = 0;
    }
    Rect7(double len, double bre) {
        l = len;
        b = bre;
    }
    void area() {
        System.out.println("Area: " + (l * b));
    }
}

public class prog7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length and breadth for User Input: ");
        double inputL = sc.nextDouble();
        double inputB = sc.nextDouble();

        Rect7 r1 = new Rect7();
        System.out.print("Using Default Constructor -> ");
        r1.area();

        Rect7 r2 = new Rect7(inputL, inputB);
        System.out.print("Using Parameterized Constructor -> ");
        r2.area();
    }
}