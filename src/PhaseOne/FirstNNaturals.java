package PhaseOne;

import java.util.Scanner;

public class FirstNNaturals {
    public static void main(String[] args) {
        System.out.print("Enter the limit: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.print(i + " ");
        }
    }
}
