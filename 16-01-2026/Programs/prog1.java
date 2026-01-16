import java.util.Scanner;

abstract class Student {
    int rno;
    int regno;

    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rollno - ");
        rno = sc.nextInt();
        System.out.print("Registration no - ");
        regno = sc.nextInt();
    }

    abstract void course();
}

class Kiitian extends Student {
    void course() {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }
}

class prog1 {
    public static void main(String[] args) {
        Kiitian k = new Kiitian();
        k.getInput();
        System.out.println("Rollno - " + k.rno);
        System.out.println("Registration no - " + k.regno);
        k.course();
    }
}