package PhaseOne;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        System.out.print("Enter three numbers: ");
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a > b && a > c){
            System.out.println("The largest number is " + a);
        }
        else if (b > a && b > c){
            System.out.println("The largest number is " + b);
        }
        else if (c > a && c > b){
            System.out.println("The largest number is " + c);
        }
    }
}
