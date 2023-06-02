package sprint;

public class ValidaFecha {
	public static boolean validaFecha(String fecha) {
		
		
		if (fecha.length()!=10) {
			System.out.println("Fecha inválida");
			return false;
		}
		
		int anio=Integer.parseInt(fecha.substring(6,10));
		int mes=Integer.parseInt(fecha.substring(3,5));
		int dia=Integer.parseInt(fecha.substring(0,2));
		
		if (dia<0 || dia>31) {
			System.out.println("Dia inválido");
			return false;			
		}

		if (mes<0 || mes>12) {
			System.out.println("Mes inválido");
			return false;			
		}

		if (anio<1 || anio>9999) {
			System.out.println("Año inválido");
			return false;			
		}

		return true;
	}
}
