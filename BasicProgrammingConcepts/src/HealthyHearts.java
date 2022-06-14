import java.sql.SQLOutput;
import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {
        calcHeartRate();
    }

    public static void calcHeartRate(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your age");
        int age =scan.nextInt();
        int maxHR = 220-age;
        double lowRange = 0.5*maxHR;
        double highRange = 0.85*maxHR;

        System.out.println("Your maximum heart rate should be "+maxHR+ " beats per minute");
        System.out.println("Your target HR Zone is "+lowRange+" - "+highRange +" beats per minute");
    }
}
