import java.util.*;

public class time_zone {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Month: ");
        int month = sc.nextInt();
        System.out.println("Enter the day: ");
        int day = sc.nextInt();
        System.out.println("ENter the Hour: ");
        int hour = sc.nextInt();
        System.out.println("ENeter the Minute: ");
        int minute = sc.nextInt();
        System.out.println("ENter the Second: ");
        int second = sc.nextInt();

        hour += 5;
        minute += 30;

        if (day >= 30) {
            month += 1;
            day -= 30;
        }

        if (hour >= 24) {
            day += 1;
            hour -= 24;
        }

        if (minute >= 60) {
            hour += 1;
            minute -= 60;
        }

        if (second >= 60) {
            hour += 1;
            second -= 60;
        }

        System.out.println("Month: " + month + " Day: " + day + " Hour: " + hour + " Minute: " + minute + " Second: " + second);

    }
}