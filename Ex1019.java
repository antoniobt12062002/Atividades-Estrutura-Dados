import java.util.Scanner;
public class Ex1019 {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int convercaoHoras = n/3600;
        n = n%3600;
        int conversaoMinutos = n/60;
        int segundos = n%60;
        System.out.println(convercaoHoras + ":" + conversaoMinutos +":" + segundos);

    }

}