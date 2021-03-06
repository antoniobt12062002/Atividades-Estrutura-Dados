import java.util.Scanner;

public class Ex1043 {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        String lados = input.nextLine();

        float ladoA = Float.parseFloat(lados.split(" ")[0]);
        float ladoB = Float.parseFloat(lados.split(" ")[1]);
        float ladoC = Float.parseFloat(lados.split(" ")[2]);

        if (ladoA >= ladoB + ladoC || ladoB >= ladoC + ladoA || ladoC >= ladoA + ladoB) {
            System.out.println("Area = " + String.format("%.1f", ((ladoA + ladoB) * ladoC) / 2));
        } else {
            System.out.println("Perimetro = " + String.format("%.1f", ladoA + ladoB + ladoC));
        }
    }
}