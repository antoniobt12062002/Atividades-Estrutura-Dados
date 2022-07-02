import java.util.Locale;
import java.util.Scanner;

public class Ex1041 {

	public static void main(String args[]) {
		
		Locale.setDefault(Locale.US); 
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();
		double y = input.nextDouble();
		input.close();
		if(x>0 && y>0){
			System.out.println("Q1");	
		}
		if(x<0 && y<0){
			System.out.println("Q3");
		}
		if(y>0 && x<0){
			System.out.println("Q2");
		}
		if(x>0 && y<0){
			System.out.println("Q4");
		}
		if(x==0 && y==0){
			System.out.println("Origem");
		}
		if(y==0 && (x>0 ||  x<0)) {
			System.out.println("Eixo X");
		}
		if(x==0 && (y>0 ||  y<0)){
			System.out.println("Eixo Y");
		}
		
		
	}

}