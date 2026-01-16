import java.util.Scanner;

class Employee {
    int eid;
    Scanner sc = new Scanner(System.in);

    void getDetails() {
        System.out.print("Enter employee id - ");
        eid = sc.nextInt();
    }
}

class Department extends Employee {
    int did;

    void getDeptDetails() {
        System.out.print("Enter department id - ");
        did = sc.nextInt();
    }

    void display() {
        System.out.println("Employee id - " + eid);
        System.out.println("Department id - " + did);
    }
}

class prog4 {
    public static void main(String[] args) {
        Department d = new Department();
        d.getDetails();
        d.getDeptDetails();
        d.display();
    }
}