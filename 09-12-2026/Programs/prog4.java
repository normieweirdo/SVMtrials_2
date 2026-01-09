import java.util.Scanner;

class Account {
    int acc;
    double bal;
    Scanner sc = new Scanner(System.in);

    void input() {
        System.out.print("Enter Acc No: ");
        acc = sc.nextInt();
        System.out.print("Enter Balance: ");
        bal = sc.nextDouble();
    }

    void display() {
        System.out.println("Acc No: " + acc);
        System.out.println("Balance: " + bal);
    }
}

class Person extends Account {
    String nm;
    String aadhar;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        nm = sc.next();
        System.out.print("Enter Aadhar: ");
        aadhar = sc.next();
        super.input();
    }

    void display() {
        System.out.println("--- Details ---");
        System.out.println("Name: " + nm);
        System.out.println("Aadhar: " + aadhar);
        super.display();
    }
}

public class prog4 {
    public static void main(String[] args) {
        Person p[] = new Person[3];

        for(int i=0; i<3; i++) {
            System.out.println("Person " + (i+1));
            p[i] = new Person();
            p[i].input();
        }

        for(int i=0; i<3; i++) {
            p[i].display();
        }
    }
}