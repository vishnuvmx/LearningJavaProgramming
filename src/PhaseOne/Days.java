package PhaseOne;
import java.util.Scanner;


public class Days {
    public static void main(String[] args) {
        enum day{Sunday, Monday, Tuesday, Wedesday, Thursday, Friday, Saturday};
        System.out.print("Enter the Day (1-7): ");

        Scanner input = new Scanner(System.in);
        int dayNum = input.nextInt();

        System.out.println("The day is " + day.values()[dayNum - 1]);
    }
}
