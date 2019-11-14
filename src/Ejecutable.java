import java.util.Scanner;

public class Ejecutable {
	private String nombre;
	private Password[] vContrase�as;
	
	public Ejecutable() {
		nombre = "";
		vContrase�as = new Password[50];	
	}
	public Ejecutable(String nombre, int numPassword) {
		this.nombre = nombre;
		vContrase�as = new Password[numPassword];
	}
	public Ejecutable(String nombre) {
		this.nombre = nombre;
		vContrase�as = new Password[50];
	}
	
	public void a�adirContrase�as() {
		Scanner leer = new Scanner(System.in);
		int tam;
		
		System.out.println("Dime el tama�o de la contrase�a");
		tam = leer.nextInt();
		
		for (int i = 0; i < vContrase�as.length; i++) {
			if (vContrase�as[i]==null) {
				vContrase�as[i] = new Password(tam);
				break;
			}
		}
	}
}
