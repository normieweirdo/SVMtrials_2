import java.util.Scanner;

class Box {
    double l, w, h;
    double volume() {
        return l * w * h;
    }
}

public class prog3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Box b = new Box();
        System.out.print("Enter length: ");
        b.l = sc.nextDouble();
        System.out.print("Enter width: ");
        b.w = sc.nextDouble();
        System.out.print("Enter height: ");
        b.h = sc.nextDouble();
        System.out.println("Volume: " + b.volume());
    }
}