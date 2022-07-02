import java.util.Scanner;
public class Ex1017 {
 
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int tempoViagem = input.nextInt();
        int velocidadeMediaViagem = input.nextInt();
        double distanciaViagem = velocidadeMediaViagem * tempoViagem;
        int consumoAutomovel = 12;
        double litros = distanciaViagem/consumoAutomovel;
        System.out.format("%.3f\n" ,litros);
        
 
      
    }
 
}