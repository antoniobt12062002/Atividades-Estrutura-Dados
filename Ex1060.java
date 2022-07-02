import java.util.Locale;
import java.util.Scanner;

public class Ex1060 {

	public static void main(String args[]) {
		Locale.setDefault(Locale.US); 
		Scanner input = new Scanner(System.in);
		
		double[]vect = new double[6];
		int quantidadePositivo = 0;
		for(int i = 0; i<6; i++){
			
			double valor = input.nextDouble();
			vect[i] =  valor;
			
			quantidadePositivo = valoresPositivo(valor,quantidadePositivo);
		}
		System.out.println(quantidadePositivo+" valores positivos");
		input.close();
	}
	
	public static int valoresPositivo(double valor , int quantidadePositivo ){
		if(valor>0){
			quantidadePositivo ++;
				
		}
		return quantidadePositivo;
	}
}