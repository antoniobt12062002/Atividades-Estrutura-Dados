import java.util.Locale;
import java.util.Scanner;

import javax.xml.bind.SchemaOutputResolver;
public class Ex1014 {
    public static void main(String args[]){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int distanciapercorrida = input.nextInt();
        double qtdcombus = input.nextDouble();
        double mediacombus = distanciapercorrida / qtdcombus;

        System.out.printf("%.3f km/1%n", mediacombus);
    }
    
}
