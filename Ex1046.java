import java.io.IOException;
import java.util.Scanner;

public class Ex1046 {

    public static void main(String args[]) throws IOException{

        Scanner input = new Scanner(System.in);

        int horaInicial = input.nextInt();
        int horaFinal = input.nextInt();

        input.close();

        int tempoDuracao = 0;

        if(horaInicial == horaFinal){
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } else if(horaInicial > horaFinal){
            tempoDuracao = (24 - horaInicial) + horaFinal;
            System.out.println("O JOGO DUROU " + tempoDuracao + " HORA(S)");
        } else if (horaInicial < horaFinal) {
            tempoDuracao = (horaFinal - horaInicial);
            System.out.println("O JOGO DUROU " + tempoDuracao + " HORA(S)");
        }
    }
}
