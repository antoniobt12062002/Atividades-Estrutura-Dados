import java.util.Scanner;

public class Ex1004{

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int PROD = A * B;

        System.out.println("Produto = " + PROD);

        input.close();
    }
}