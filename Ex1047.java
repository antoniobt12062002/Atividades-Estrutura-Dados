import java.util.Scanner;

public class Ex1047 {

	public static void main(String args[]) {
		
	
		Scanner input = new Scanner(System.in);
		
		String valor = input.nextLine();
		
		String valores[] = valor.split(" ");
		
		calculaHoras( Integer.parseInt(valores[0])  , Integer.parseInt(valores[1])   , Integer.parseInt(valores[2]) ,  Integer.parseInt(valores[3])    );
		
	}
	
	public static void calculaHoras(  int horaInicio,  int minutoInicio, int horaFim,  int minutoFim) {
		
		int tempoMinuto=0, tempoHora=0;
		
		while(true) {
			
			minutoInicio = minutoInicio +1;
			tempoMinuto = tempoMinuto + 1;
			if(minutoInicio > 59) {
				minutoInicio=0;
				horaInicio = horaInicio +1;
				
				if(horaInicio > 23) {
					horaInicio=0;
				}	
			}
			
			if(tempoMinuto>59) {
				tempoHora = tempoHora +1;
				tempoMinuto=0;
			}
			
			if((minutoInicio==minutoFim) && (horaInicio ==horaFim)) {
				System.out.println("O JOGO DUROU "+tempoHora+" HORA(S) E "+tempoMinuto+" MINUTO(S)");
				break;
			}
			
		}
		
	}
	
	
	
	
	

}