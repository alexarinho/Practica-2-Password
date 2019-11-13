import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		int tamañoVector =0;
		System.out.println("Dime el tamaño de todo");
		tamañoVector = leer.nextInt();
		
		Password [] vPasswords = new Password[tamañoVector];
		boolean [] vFuerteDebiil = new boolean[tamañoVector];
		
		for (int i = 0; i < tamañoVector; i++) {
			Password pas = new Password(tamañoVector);
			
		}
		
	}

}
