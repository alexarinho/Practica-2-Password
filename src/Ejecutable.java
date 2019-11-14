import java.util.Scanner;

public class Ejecutable {
	private String nombre;
	private Password[] vContraseñas;
	
	public Ejecutable() {
		nombre = "";
		vContraseñas = new Password[50];	
	}
	public Ejecutable(String nombre, int numPassword) {
		this.nombre = nombre;
		vContraseñas = new Password[numPassword];
	}
	public Ejecutable(String nombre) {
		this.nombre = nombre;
		vContraseñas = new Password[50];
	}
	
	public void añadirContraseñas() {
		Scanner leer = new Scanner(System.in);
		int tam;
		
		System.out.println("Dime el tamaño de la contraseña");
		tam = leer.nextInt();
		
		for (int i = 0; i < vContraseñas.length; i++) {
			if (vContraseñas[i]==null) {
				vContraseñas[i] = new Password(tam);
				break;
			}
		}
	}
}
