import java.util.Scanner;

public class Ex1040 {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        String formatacao = "%.1f";
        String dados = input.nextLine();

        float notaA = Float.parseFloat(dados.split(" ")[0]);
        float notaB = Float.parseFloat(dados.split(" ")[1]);
        float notaC = Float.parseFloat(dados.split(" ")[2]);
        float notaD = Float.parseFloat(dados.split(" ")[3]);
        float media = ((notaA * 2) + (notaB * 3) + (notaC * 4) + notaD) / 10;

        if (media >= 7){
            System.out.println("Media: " + String.format(formatacao, media) +
                    "\nAluno aprovado.");
        } else if (media >= 5 && media <= 6.9){
            float notaExame = input.nextFloat();
            System.out.println("Media: " + media +
                    "\nAluno em exame.");
            float mediaFinal = (notaExame + media) / 2;
            System.out.println("Nota do exame: " + String.format(formatacao, notaExame));
            if (mediaFinal >= 5) {
                System.out.println("Aluno aprovado." +
                        "\nMedia final: " + String.format(formatacao, mediaFinal));
            } else {
                System.out.println("Aluno reprovado." +
                        "\nMedia final: " + String.format(formatacao, mediaFinal));
            }
        } else {
            System.out.println("Media: " + String.format(formatacao, media) +
                    "\nAluno reprovado.");
        }
    }

}