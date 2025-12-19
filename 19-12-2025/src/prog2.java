import java.util.Scanner;

class Counter {
    static int z = 0;
    Counter() {
        z++;
    }
}

public class prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many objects to create: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            new Counter();
        }
        System.out.println("no of objects z=" + Counter.z);
    }
}