import java.util.Scanner;

public class Area {
    public static double AreaOfCircle(int r){
        return Math.PI * r * r; // Comments
    };

    public static double PerimeterOfCircle(int r){
        return Math.PI * 2 * r;
    };
    public static void main(String[] args){
        System.out.print("Enter the radius: ");
        Scanner input = new Scanner(System.in);

        int radius = input.nextInt();
        System.out.printf("Area of the circle: %.2f%n",  AreaOfCircle(radius));
        System.out.printf("Perimeter of the circle: %.2f%n",  PerimeterOfCircle(radius));
    }
}
