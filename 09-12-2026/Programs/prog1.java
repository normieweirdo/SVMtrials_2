import java.util.Scanner;

class Sheet {
    int l, w;

    void cost2D() {
        System.out.println("Cost of Sheet: Rs " + (l * w * 40));
    }
}

class Box extends Sheet {
    int h;

    void cost3D() {
        System.out.println("Cost of Box: Rs " + (l * w * h * 60));
    }
}

public class prog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Box b = new Box();

        System.out.print("Enter length, width and height: ");
        b.l = sc.nextInt();
        b.w = sc.nextInt();
        b.h = sc.nextInt();

        b.cost2D();
        b.cost3D();
    }
}