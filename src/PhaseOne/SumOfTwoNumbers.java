package PhaseOne;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        int a; int b;
        System.out.print("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Sum of the numbers = " + (a + b));
    }
}
