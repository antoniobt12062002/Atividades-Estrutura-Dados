import java.util.Locale;
import java.util.Scanner;

import javax.xml.bind.SchemaOutputResolver;

public class Ex1012 {
    public static void main(String args[]){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double pi = 3.14159;
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double areatrireta = (a * c) / 2.0;
        double areacircu = pi * Math.pow(c, 2);
        double areatrap = ((a + b) * c) / 2.0;
        double areaquad = b * b;
        double arearetan = a * b;

        System.out.printf("triangulo = %.3f%n", arearetan);
        System.out.printf("circulo = %.3f%n", areacircu);
        System.out.printf("trapezio = %.3f%n", areatrap);
        System.out.printf("quadrado = %.3f%n", areaquad);
        System.out.printf("retangulo = %.3f%n", arearetan);

    }
    
}
