package sprint;

import java.util.Calendar;

/** 
 * @version 1.0.0  Trabajo Sprint M4
 * @author Nicolae Villegas
 * @author Jesus Torres
 * @author Cristian Díaz
 * @author Fabiana Vega
 */

/**
 * Clase Usuario implementa interfaz IAsesoria
 * Atributos:
 * runUsuario
 * nombreUsuario
 * fechaNacimientoUsuario
 */
public class Usuario implements IAsesoria {
	
	private String nombreUsuario; 
	private String fechaNacimientoUsuario;
	private int runUsuario;
	
	// Constructores
	
	public Usuario() {	}
	
	public Usuario(String nombreUsuario, String fechaNacimiento, int run) {
		this.setNombreUsuario(nombreUsuario);
		this.setFechaNacimientoUsuario(fechaNacimientoUsuario);
		this.setRunUsuario(run);
		
		this.nombreUsuario = this.getNombreUsuario();
		this.fechaNacimientoUsuario = this.getFechaNacimientoUsuario();
		this.runUsuario = this.getRunUsuario();
	}

	/**
	 * @param fechaNacimientoUsuario Recibe un string con la fechaNacimientoUsuario
	 * @return edad Retorna mensaje que indica la edad del usuario
	 */
	public String mostrarEdad(String fechaNacimientoUsuario) {
		Calendar hoy = Calendar.getInstance();
		int anoActual=hoy.get(Calendar.YEAR);	 
		int anoNacimiento = Integer.parseInt(fechaNacimientoUsuario.substring(6));
		String edad = "El usuario tiene: " + (anoActual - anoNacimiento)+ " años";
		return edad; 
	} 
		
	//Metodos setters y getters
	
	/**
	 * @return Retorna el nombre del usuario
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	/**
	 * @param nombreUsuario Recibe un String con el Nombre del usuario
	 * obligatorio, mínimo 10 caracteres, máximo 50
	 */
	public void setNombreUsuario(String nombreUsuario) {
		if (Validaciones.validaLargoCadena(nombreUsuario, 10, 50)) {
			this.nombreUsuario = nombreUsuario;
		}
	}

	/**
	 * @return Retorna la fecha de nacimiento del usuario
	 */
	public String getFechaNacimientoUsuario() {
		return fechaNacimientoUsuario;
	}

	/**
	 * @param fechaNacimientoUsuario Recibe fecha de nacimiento del usuario
	 * obligatorio, independiente si lo declara como una fecha o string,
	 * debe ser desplegado con el formato DD/MM/AAAA
	 */
	public void setFechaNacimientoUsuario(String fechaNacimientoUsuario) {
		if (Validaciones.validaFecha(fechaNacimientoUsuario)) {
			this.fechaNacimientoUsuario = fechaNacimientoUsuario;
		}
	}

	/**
	 * @return Retorna run del usuario
	 */
	public int getRunUsuario() {
		return runUsuario;
	}

	/**
	 * @param runUsuario Run del usuario
	 * corresponde a un número menor a 99.999.999
	 */
	public void setRunUsuario(int runUsuario) {
		if (Validaciones.validaRut(runUsuario)) {
			this.runUsuario=runUsuario;
		}
	}
	
	// Métodos sobreescritos
	
	@Override
	public String toString() {
		return "Usuario [nombreUsuario=" +	nombreUsuario + 
				", fechaNacimientoUsuario=" + fechaNacimientoUsuario + 
				", runUsuario=" + runUsuario + "]";
	}
	
	@Override
	public void analizarUsuario() {
		System.out.println("El nombre del usuario es: "+this.nombreUsuario);
		System.out.println("La fecha de nacimiento es: "+this.fechaNacimientoUsuario);
		System.out.println("El rut es: "+this.runUsuario);
		System.out.println("**********************************************");
	}

	@Override
	public int obtieneRunUsuario() {
		return this.getRunUsuario();
	}
}
