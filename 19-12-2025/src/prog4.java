import java.util.Scanner;

class Rectangle {
    double l, b, area, peri;
    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and breadth: ");
        l = sc.nextDouble();
        b = sc.nextDouble();
    }
    void calculate() {
        area = l * b;
        peri = 2 * (l + b);
    }
    void display() {
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + peri);
    }
}

public class prog4 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.read();
        r.calculate();
        r.display();
    }
}