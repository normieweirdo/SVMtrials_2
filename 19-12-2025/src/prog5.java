import java.util.Scanner;

class Student5 {
    int roll;
    String name;
    double cgpa;
}

public class prog5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Student5[] s = new Student5[n];
        for (int i = 0; i < n; i++) {
            s[i] = new Student5();
            System.out.print("Enter Roll, Name, CGPA: ");
            s[i].roll = sc.nextInt();
            s[i].name = sc.next();
            s[i].cgpa = sc.nextDouble();
        }
        int low = 0;
        for (int i = 1; i < n; i++) {
            if (s[i].cgpa < s[low].cgpa) low = i;
        }
        System.out.println("Student with lowest cgpa: " + s[low].name);
    }
}