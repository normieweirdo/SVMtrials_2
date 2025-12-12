import java.util.Scanner;

public class prog3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Week Day Finder ---");
        System.out.print("Enter the day number of the month (1-31): ");

        int dayNo = sc.nextInt();

        int dayOfWeek = (dayNo - 1) % 7 + 1;

        System.out.print("Day " + dayNo + " is: ");

        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}