package PhaseOne;

import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println(name + ", How are you?");
    }
}