import java.util.Scanner;
public class AssignmentQn2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of toys:");
        int n = sc.nextInt();

        int[] id = new int[n];
        String[] name = new String[n];
        int[] qty = new int[n];
        double[] price = new double[n];

        for(int i = 0; i < n; i++) {
            System.out.println("Enter Toy ID:");
            id[i] = sc.nextInt();

            sc.nextLine();

            System.out.println("Enter Toy Name:");
            name[i] = sc.nextLine();

            System.out.println("Enter Quantity:");
            qty[i] = sc.nextInt();

            System.out.println("Enter Price:");
            price[i] = sc.nextDouble();
        }

        double grandTotal = 0;

        System.out.println("Toy Details:");
        for(int i = 0; i < n; i++) {
            double total = qty[i] * price[i];
            grandTotal = grandTotal + total;
            System.out.println(id[i] + " " + name[i] + " " + qty[i] + " " + price[i]);
        }

        System.out.println("Total Billing Amount: " + grandTotal);
    }
}