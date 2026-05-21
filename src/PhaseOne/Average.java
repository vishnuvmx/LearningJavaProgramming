package PhaseOne;

import java.util.Scanner;

public class Average {
    public static void main(String[] args){
        System.out.print("Enter three number: ");
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int average = (a+b+c)/3;
        System.out.println("The average is " + average);
    }
}
