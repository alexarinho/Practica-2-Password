import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Dime la longitud de tu contraseña");
		int tamaño=0;
		tamaño = leer.nextInt();
		Password pas = new Password(tamaño);
		System.out.println(pas);
	}

}
