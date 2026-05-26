package PhaseOne;

import java.util.Scanner;

public class MultiplyTwoFloats {
    public static float product(float a, float b){
        return a * b;
    }

    public static void main(String[] args) {
        System.out.print("Enter two numbers: ");
        Scanner input = new Scanner(System.in);

        float a = input.nextFloat();
        float b = input.nextFloat();

        System.out.println("The product of two numbers is: " + product(a,b));
        input.close();
    }
}
