import java.util.Locale;
import java.util.Scanner;

public class Ex1008 {
    public static void main(String args[]){
        Locale.setDefault(Locale.ENGLISH);

        Scanner input = new Scanner(System.in);

        int numerof = input.nextInt();
        int qtdhoras = input.nextInt();
        double valorhora = input.nextDouble();
        double salario = qtdhoras * valorhora;

        System.out.println("Numero de funcionario = " + numerof);
        System.out.printf("Salario =  %.2f%n", salario);


        input.close();
    }


}
