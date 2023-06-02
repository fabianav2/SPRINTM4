package sprint;

/** 
 * @version 1.0.0  Trabajo Sprint M4
 * Clase Usuario
 * @author Nicolae Villegas
 * @author Jesus Torres
 * @author Cristian Díaz
 * @author Fabiana Vega
 */

/**
 * Clase accidente
 * identificador - Identificador de usuario
 * rutCliente - Rut del cliente
 * fecha - Ingreso de fecha
 * hora - Ingreso de hora
 * lugar - Ingreso de lugar del accidente
 * origen - Ingreso de origen del accidente
 * consecuencias - ingreso consecuencias de accidente
 */
public class Accidente {
			
	private int identificador;
	private int rutCliente;
	private String fecha;
	private String hora;
	private String lugar;
	private String origen;
	private String consecuencias;
	
	// Constructores
	public Accidente() {}

	public Accidente(int identificador, int rutCliente, String fecha, String hora, String lugar, String origen,
			String consecuencias) {
		this.setIdentificador(identificador);
		this.setRutCliente(rutCliente);
		this.setFecha(fecha);
		this.setHora(hora);
		this.setLugar(lugar);
		this.setOrigen(origen);
		this.setConsecuencias(consecuencias);
		
		this.identificador = this.getIdentificador();
		this.rutCliente = this.getRutCliente();
		this.fecha = this.getFecha();
		this.hora = this.getHora();
		this.lugar = this.getLugar();
		this.origen = this.getOrigen();
		this.consecuencias = this.getConsecuencias();
	}
	
	// Metodos getters y setters
	
	/**
	 * @return Este dato es obligatorio
	*/	
	public int getIdentificador() {
		return identificador;
	}
		
	/**
	 * @param identificador recibe y valida entero identificador
	 * Obligatorio, número interno manejado por la compañía.
	 */
		public void setIdentificador(int identificador) {
		if (identificador==0) {
			System.out.println("Este dato es obligatorio");
		}else {
			this.identificador = identificador;
		}
	}

	/**
	 * @return RutCliente retorna entero rut cliente
	*/	
	public int getRutCliente() {
		return rutCliente;
	}
	
	/**
	 * @param rutCliente recibe y valida entero rut cliente
	 * Obligatorio
	 */
	public void setRutCliente(int rutCliente) {
		if (Validaciones.validaRut(rutCliente)){
			this.rutCliente = rutCliente;
		}
	}

	/**
	 * @return retorna cadena fecha
	*/	
	public String getFecha() {
		return fecha;
	}
	
	/**
	 * @param fecha Recibe y valida cadena fecha
	 * fecha del accidente,  
	 * debe ser desplegado con el formato DD/MM/AAAA
	 */
	public void setFecha(String fecha) {
		if (Validaciones.validaFecha(fecha)) {
			this.fecha = fecha;
		}
	}
	
	/**
	 * @return Retorna Hora en formato HH:MM
	*/	
	public String getHora() {
		return hora;
	}
	
	/**
	 * @param hora Recibe y valida cadena hora
	 * debe ser una hora válida del día, 
	 * en formato HH:MM (hora desde 0 a 23, minutos entre 0 y 59)
	 */
	public void setHora(String hora) {
		if (Validaciones.validaHora(hora)) {
			this.hora = hora;
		}
	}
	
	/**
	 * @return Retorna cadena lugar
	*/	
	public String getLugar() {
		return lugar;
	}
	
	/**
	 * @param lugar Recibe y valida cadena lugar
	 * obligatorio, mínimo 10 caracteres, máximo 50
	 */
	public void setLugar(String lugar) {
		if (Validaciones.validaLargoCadena(lugar, 10, 50)) {
			this.lugar = lugar;
		}
	}

	/**
	  * @return Origen Retorna cadena origen
	*/	
	public String getOrigen() {
		return origen;
	}
	
	/**
	 * @param origen Recibe y valida cadena origen
	 * máximo 100 caracteres
	 */
	public void setOrigen(String origen) {
		if (Validaciones.validaLargoCadena(origen, 0, 100)) {
			this.origen = origen;
		}
	}
	
	/**
	  * @return Consecuencias Retorna cadena consecuencias
	*/	
	public String getConsecuencias() {
		return consecuencias;
	}
	
	/**
	 * @param consecuencias Recibe y valida cadena consecuencias
	 * máximo 100 caracteres
	 */
	public void setConsecuencias(String consecuencias) {
		if (Validaciones.validaLargoCadena(consecuencias, 0, 100)) {
			this.consecuencias = consecuencias;
		}
	}

	@Override
	public String toString() {
		return "Accidente [identificador=" + identificador + ", rutCliente=" + rutCliente + ", fecha=" + fecha
				+ ", hora=" + hora + ", lugar=" + lugar + ", origen=" + origen + ", consecuencias=" + consecuencias
				+ "]";
	}
}
