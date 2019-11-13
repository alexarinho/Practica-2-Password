import java.util.Random;

public class Password {
	private String contraseña;
	private int longitud;

	public Password() {
		longitud = 8;
		generarPassword(longitud);
	}

	public Password(int longitud) {
		this.longitud = longitud;
		generarPassword(longitud);
	}

	public void generarPassword(int longitud) {
		contraseña = "";
		int num = 0;
		Random r = new Random();

		for (int i = 0; i < longitud; i++) {
			num = r.nextInt(3);
			switch (num) {
			case 0:
				contraseña += (char) (r.nextInt(25) + 65);
				break;
			case 1:
				contraseña += (char) (r.nextInt(9) + 48);
				break;
			case 2:
				contraseña += (char) (r.nextInt(25) + 97);
				break;
			}
		}

	}
	
	public boolean esFuerte() {
		int numMayusc=0;
		int numNums=0;
		int numMins=0;
		int contra=0;
		
		for (int i = 0; i < contraseña.length(); i++) {
			contra=contraseña.codePointAt(i);
			
			if(contra<58) {
				numNums++;
			}else if(contra<91){
				numMayusc++;
			}else if(contra<123){
				numMins++;
			}
		}
			
		if(numMayusc>2 && numMins>1 && numNums>5) {
			System.out.println("Es fuerte");
			return true;
		}else {
			System.out.println("Es debil");
			return false;
		}

	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

	public String toString() {
		return "Contraseña: " + contraseña + ": " + esFuerte();
	}

}
