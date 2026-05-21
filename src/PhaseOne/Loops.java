package PhaseOne;

public class Loops {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        int j = 1;
        while(j <= 5){
            System.out.print(j + 1 + " ");
            j++;
        }
        System.out.println();
        int k = 1;
        do{
            System.out.print(k * k + " ");
            k++;
        }while(k <= 5);
    }
}
