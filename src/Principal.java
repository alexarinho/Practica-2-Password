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
			vPasswords[i] = new Password(tamañoVector);
			vFuerteDebiil[i] = vPasswords[i].esFuerte();
			System.out.println(vPasswords[i].getContraseña() + " - " + vFuerteDebiil[i]);
		}
		
	}

}
