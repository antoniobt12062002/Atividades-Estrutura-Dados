import java.util.Scanner;
public class Ex1016 {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int distanciafornecida = input.nextInt();
        int qtdminutos = (60 * distanciafornecida) / 30;

        System.out.println(qtdminutos + "minutos");
    }
    
}
