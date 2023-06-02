package sprint;

/** 
 * @version 1.0.0  Trabajo Sprint M4
 * @author Nicolae Villegas
 * @author Jesus Torres
 * @author Cristian Díaz
 * @author Fabiana Vega
 */

/** Clase revision 
 * Atributos 
 * identificador 
 * rutCliente 
 * dia 
 * hora 
 * lugar
 * comentario 
 */

public class VisitaTerreno {
	// variables de la clase (Atributos)
	private int identificador;
	private int rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private String comentarios;
	
	// Constructores

	public VisitaTerreno() {}

	public VisitaTerreno(int identificador, 
			int rutCliente, 
			String dia, 
			String hora, 
			String lugar, 
			String comentarios) {
		
		this.setIdentificador(identificador);
		this.setRutCliente(rutCliente);
		this.setDia(dia);
		this.setHora(hora);
		this.setLugar(lugar);
		this.setComentarios(comentarios);
		
		this.identificador = this.getIdentificador();
		this.rutCliente = this.getRutCliente();
		this.dia = this.getDia();
		this.hora = this.getHora();
		this.lugar = this.getLugar();
		this.comentarios = this.getComentarios();
	}
	
	// Metodos getters y setters
	
	/**
	 * @return Metodo identificador retorna un entero
	 */
	public int getIdentificador() {
		return identificador;
	}
	
	/**
	 * @param identificador
	 * Identificador de la visita en terreno: obligatorio, número interno manejado por la compañía.
	 */
	public void setIdentificador(int identificador) {
		if (identificador==0) {
			System.out.println("Este dato es obligatorio");
		}else {
			this.identificador = identificador;
		}
	}

	/**
	 * @return Metodo rut clientes retorna un entero
	 */
	public int getRutCliente() {
		return rutCliente;
	}
	
	/**
	 * @param rutCliente Recibe y valida entero rutCliente
	 * obligatorio
	 */
	public void setRutCliente(int rutCliente) {
		if (Validaciones.validaRut(rutCliente)){
			this.rutCliente = rutCliente;
		}
	}
	
	/**
	 * @return Metodo dia retorna una cadena de caracteres
	 */
	public String getDia() {
		return dia;
	}
	
	/**
	 * @param dia Recibe y valida cadena dia
	 * fecha del accidente, 
	 * independiente si lo declara como una fecha o un String,
	 * debe ser desplegado con el formato DD/MM/AAAA
	 */
	public void setDia(String dia) {
		if (Validaciones.validaDia(dia)) {
			this.dia = dia;
		}
	}
	
	/**
	 * @return Metodo hora retorna una cadena de caracteres
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
	 * @return Metodo lugar retorna una cadena de caracteres
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
	 * @return Metodo comentarios retorna una cadena de caracteres
	 * 
	 */
	public String getComentarios() {
		return comentarios;
	}
	
	/**
	 * @param comentarios Recibe y valida cadena comentarios
	 * máximo 100 caracteres
	 */
	public void setComentarios(String comentarios) {
		if (Validaciones.validaLargoCadena(comentarios, 0, 100)) {
			this.comentarios = comentarios;
		}
	}
	
	// Metodos sobreescritos
	
	@Override
	public String toString() {
		return "Accidente [identificador=" + identificador + ", rutCliente=" + rutCliente + ", dia=" + dia
				+ ", hora=" + hora + ", lugar=" + lugar + ", comentarios=" + comentarios + "]";
	}
}
