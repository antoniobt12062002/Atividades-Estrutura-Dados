import java.util.Locale;
import java.util.Scanner;

public class Ex1009 {
    public static void main(String args[]){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        String nomefun = input.next();
        double salariofixo = input.nextDouble();
        double vendasefetuadas = input.nextDouble();
        double comissao = vendasefetuadas * 0.15;
        double salariofinal = salariofixo + comissao;

        System.out.printf("Total = %.2f%n", salariofinal);
    }
    
}
