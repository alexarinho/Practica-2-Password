import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Dime la longitud de tu contrase�a");
		int tama�o=0;
		tama�o = leer.nextInt();
		Password pas = new Password(tama�o);
		System.out.println(pas);
	}

}
