package PhaseOne;

import java.util.Scanner;

public class PlusMinusOddEven {
    public static String OddOrEven(int number) {
        return (number % 2 == 0) ? "Even" : "Odd";
    }
    public static String PlusMinus(int number) {
        return (number > 0) ? "Positive" : "Negative";
    }
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        System.out.print("The number is " + PlusMinus(num) + " and " + OddOrEven(num) + ".");
    }
}
