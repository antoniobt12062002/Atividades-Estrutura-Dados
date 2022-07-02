import java.io.IOException;
import java.util.Scanner;

public class Ex1006{
    public static void main(String args[]) throws IOException{
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double pesoa = 2, pesob =3, pesoc= 5;
        double pesototal = pesoa + pesob + pesoc;

        a *= pesoa;
        b *= pesob;
        c *= pesoc;

        double media = (a+b+c) / pesototal;

        System.out.printf("Media = %.1f\n", media);
    }
}