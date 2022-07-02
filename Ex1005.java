import java.util.Locale;
import java.util.Scanner;
import java.util.function.IntPredicate;

public class Ex1005{
    public static void main(String args[]){
        Locale.setDefault(Locale.ENGLISH);

        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();

        double media = (a*3.5 + b*7.5) / (3.5 + 7.5);

        System.out.printf("Media %.5f\n", media);
    }
}