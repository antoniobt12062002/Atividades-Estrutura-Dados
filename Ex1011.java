import java.util.Locale;
import java.util.Scanner;

public class Ex1011 {
    public static void main(String args[]){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double pi = 3.14159;
        double raio = input.nextDouble();
        double volumeesfera = (4/3.0) * pi * Math.pow(raio, 3);

        System.out.printf("Volume = %.3f%n", volumeesfera);
    }
    
}
