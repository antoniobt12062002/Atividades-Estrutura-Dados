import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Ex1042 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner input = new Scanner(System.in);
		
		int []vect = new int[3];
		int []ordenado = new int[3];
		
		for(int i = 0; i < 3; i++){
			int valor = input.nextInt();
			vect[i] = valor;
			ordenado[i] = valor;
		}
		
		Arrays.sort(ordenado);
		
		for(int i = 0; i < 3; i++){
			System.out.println(ordenado[i]);
		}
		
		System.out.println();
		
		for(int i = 0; i < 3; i++){
			System.out.println(vect[i]);
		}
		
		input.close();
		
	}

}
