import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		int tama�oVector =0;
		System.out.println("Dime el tama�o de todo");
		tama�oVector = leer.nextInt();
		
		Password [] vPasswords = new Password[tama�oVector];
		boolean [] vFuerteDebiil = new boolean[tama�oVector];
		
		for (int i = 0; i < tama�oVector; i++) {
			vPasswords[i] = new Password(tama�oVector);
			vFuerteDebiil[i] = vPasswords[i].esFuerte();
			System.out.println(vPasswords[i].getContrase�a() + " - " + vFuerteDebiil[i]);
		}
		
	}

}
