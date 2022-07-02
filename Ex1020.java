import java.util.Scanner;

public class Ex1020 {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int dias = input.nextInt();

        int anos = 0, meses = 0, days = 0;

        while (dias > 0) {
            if (dias >= 365) {
                dias -= 365;
                anos += 1;
            } else if (dias >= 30) {
                dias -= 30;
                meses += 1;
            } else {
                days = dias;
                dias = 0;
            }
        }

        System.out.println(anos + " ano(s)\n" +
                meses + " mes(es)\n" +
                days+ " dia(s)");
    }
}