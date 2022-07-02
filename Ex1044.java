import java.util.Locale;
import java.util.Scanner;

public class Ex1044 {

	public static void main(String args[]) {
		
		Locale.setDefault(Locale.US); 
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		if(a%b==0 || b%a==0){
			System.out.println("Sao Multiplos");
		}else{
			System.out.println("Nao sao Multiplos");
		}
		
		input.close();
	}

}