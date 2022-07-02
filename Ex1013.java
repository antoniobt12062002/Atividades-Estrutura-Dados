import java.util.Scanner;
public class Ex1013 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int maiorab = (a + b + Math.abs(a - b)) / 2;
        int maiorabc = (maiorab + c + Math.abs(maiorab - c)) / 2;

        System.out.println(maiorabc + " maior");
    }
    
}
