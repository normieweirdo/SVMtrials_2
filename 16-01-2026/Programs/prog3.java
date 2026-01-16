import java.util.Scanner;

interface Sal {
    void earnings();
    void deductions();
    void bonus();
}

abstract class Manager implements Sal {
    int basic;

    public void earnings() {
        int da = (basic * 80) / 100;
        int hra = (basic * 15) / 100;
        int total = basic + da + hra;
        System.out.println("Earnings - " + total);
    }

    public void deductions() {
        int pf = (basic * 12) / 100;
        System.out.println("Deduction - " + pf);
    }
}

class Substaff extends Manager {
    public void bonus() {
        int b = (basic * 50) / 100;
        System.out.println("Bonus - " + b);
    }
}

class prog3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Substaff s = new Substaff();
        System.out.print("Basic salary - ");
        s.basic = sc.nextInt();
        s.earnings();
        s.deductions();
        s.bonus();
    }
}