package PhaseOne;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        System.out.print("Enter the temperature in Celsius: ");
        Scanner input = new Scanner(System.in);

        double temperature = input.nextDouble();
        double fahrenheit = (temperature * 9 / 5) + 32;
        System.out.printf("The temperature in Fahrenheit is: %.2f", fahrenheit);

    }
}
