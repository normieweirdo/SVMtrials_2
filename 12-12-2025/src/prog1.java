import java.util.Scanner;
public class prog1 {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("--- Enter Details ---");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Roll No : ");
        int rollNo = sc.nextInt();

        sc.nextLine();

        System.out.print("Section: ");
        String section = sc.nextLine();

        System.out.print("Branch: ");
        String branch = sc.nextLine();

        System.out.println("\n--- Output ---");
        System.out.println("Name: " +name);
        System.out.println("Roll No: " +rollNo);
        System.out.println("Section: " +section);
        System.out.println("Branch: " +branch);
    }
}