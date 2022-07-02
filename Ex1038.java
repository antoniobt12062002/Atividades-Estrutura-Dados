import java.util.Scanner;

public class Ex1038 {

    public static void main(String args[]){

        double[] lista = new double[6];
        String formatacao = "%.2f";
        Scanner input = new Scanner(System.in);

        String opcaoEQuant = input.nextLine();
        int opcao = Integer.parseInt(opcaoEQuant.split(" ")[0]);
        int quant = Integer.parseInt(opcaoEQuant.split(" ")[1]);

        lista[1] = 4.0;
        lista[2] = 4.5;
        lista[3] = 5;
        lista[4] = 2;
        lista[5] = 1.5;

        System.out.println("Total: R$ " + String.format(formatacao, lista[opcao] * quant));

    }
}