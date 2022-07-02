import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ex1051 {

	public static void main(String args[] ) {
		
		Locale.setDefault(Locale.US); 
		Scanner input = new Scanner(System.in);

		DecimalFormat df = new DecimalFormat("0.00");
		double salario = input.nextDouble();
		double imposto = 0;
		if(salario>=0.00 && salario<2000.00){
			System.out.println("Isento");
		}else if(salario> 0.00 && salario<=3000.00) {
			imposto = (salario-2000)*0.08;
			System.out.println("R$ "+df.format(imposto));
		}else if(salario> 0.00 && salario<=4500.00) {
			imposto = (salario-3000)*0.18 + (1000*0.08);
			System.out.println("R$ "+df.format(imposto));
		}else if(salario>4500.00){
			imposto = ((salario-4500.00)*0.28)+(1500.00*0.18)+(1000*0.08);
			System.out.println("R$ "+df.format(imposto));
		}		
		input.close();
	}	
}