import java.util.Scanner;

class Plate {
    int l, w;

    Plate(int len, int wid) {
        l = len;
        w = wid;
        System.out.println("Plate Created");
    }
}

class Box2 extends Plate {
    int h;

    Box2(int len, int wid, int ht) {
        super(len, wid);
        h = ht;
        System.out.println("Box Created");
    }
}

class WoodBox extends Box2 {
    int t;

    WoodBox(int len, int wid, int ht, int th) {
        super(len, wid, ht);
        t = th;
        System.out.println("WoodBox Created");
    }

    void display() {
        System.out.println("Dims: " + l + "x" + w + "x" + h + " thick:" + t);
    }
}

public class prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter l, w, h, t: ");
        int len = sc.nextInt();
        int wid = sc.nextInt();
        int ht = sc.nextInt();
        int th = sc.nextInt();

        WoodBox wb = new WoodBox(len, wid, ht, th);
        wb.display();
    }
}