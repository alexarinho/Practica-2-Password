import java.util.Random;

public class Password {
	private String contrase�a;
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
		contrase�a = "";
		int num = 0;
		Random r = new Random();

		for (int i = 0; i < longitud; i++) {
			num = r.nextInt(3);
			switch (num) {
			case 0:
				contrase�a += (char) (r.nextInt(25) + 65);
				break;
			case 1:
				contrase�a += (char) (r.nextInt(9) + 48);
				break;
			case 2:
				contrase�a += (char) (r.nextInt(25) + 97);
				break;
			}
		}

	}
	
	public boolean esFuerte() {
		int numMayusc=0;
		int numNums=0;
		int numMins=0;
		int contra=0;
		
		for (int i = 0; i < contrase�a.length(); i++) {
			contra=contrase�a.codePointAt(i);
			
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

	public String getContrase�a() {
		return contrase�a;
	}

	public String toString() {
		return "Contrase�a: " + contrase�a + ": " + esFuerte();
	}

}
