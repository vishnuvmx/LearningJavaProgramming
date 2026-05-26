package PhaseOne;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        System.out.print("Enter two numbers: ");
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        int temp = a;
        a = b; b = temp;

        System.out.printf("The numbers are: %d %d%n", a, b);
    }
}
