package sprint;

/** 
 * @version 1.0.0  Trabajo Sprint M4
 * Clase principal con selector de opciones
 * @author Nicolae Villegas
 * @author Jesus Torres
 * @author Cristian Díaz
 * @author Fabiana Vega
 */

/** Clase revision 
 * Atributos 
 * idRevision 
 * idVisita 
 * nombreRevision 
 * detalle 
 * estado 
 */

public class Revision {
	
	private int idRevision;
	private int idVisita;
	private String nombreRevision;
	private String detalle;
	private int estado;
	
	// Constructores
	public Revision() {}

	public Revision(int idRevision, 
			int idVisita, 
			String nombreRevision, 
			String detalle, 
			int estado) {
		
		this.setIdRevision(idRevision);
		this.setIdVisita(idVisita);
		this.setNombreRevision(nombreRevision);
		this.setDetalle(detalle);
		this.setEstado(estado);
		
		this.idRevision = this.getIdRevision();
		this.idVisita = this.getIdVisita();
		this.nombreRevision = this.getNombreRevision();
		this.detalle = this.getDetalle();
		this.estado = this.getEstado();
	}
	
	// Metodos getters y setters
	
	/**
	 * @return  Retorna un entero idRevision
	 */
	public int getIdRevision() {
		return idRevision;
	}
	
	/**
	 * @param idRevision Recibe y valida entero idRevision
	 * obligatorio, número interno manejado por la compañía.
	 */
	public void setIdRevision(int idRevision) {
		if (idRevision==0) {
			System.out.println("Este dato es obligatorio");
		}else {
			this.idRevision = idRevision;
		}
	}

	/**
	 * @return Retorna un entero idVisita 
	 * 
	 */
	public int getIdVisita() {
		return idVisita;
	}
	
	/**
	 * @param idVisita Recibe y valida entero idVisita
	 * obligatorio, número de la vista a la que se asóciala revisión.
	 */
	public void setIdVisita(int idVisita) {
			if (idVisita==0) {
				System.out.println("Este dato es obligatorio");
			}else {
				this.idVisita = idVisita;
			}
	}

	/**
	 * @return Retorna una cadena nombreRevision
	 */
	public String getNombreRevision() {
		return nombreRevision;
	}
	
	/**
	 * @param nombreRevision Recibe y valida cadena nombreRevision
	 * obligatorio, mínimo 10 caracteres, máximo 50
	 */
	public void setNombreRevision(String nombreRevision) {
		if (Validaciones.validaLargoCadena(nombreRevision, 10, 50)) {
			this.nombreRevision = nombreRevision;
		}
	}
	
	/**
	 * @return Retorna una cadena detalle
	 */
	public String getDetalle() {
		return detalle;
	}
	
	/**
	 * @param detalle Recibe y valida cadena detalle
	 * máximo 100 caracteres
	 */
	public void setDetalle(String detalle) {
		if (Validaciones.validaLargoCadena(detalle, 0, 100)) {
			this.detalle = detalle;
		}
	}
	
	/**
	 * @return Retorna un entero estado
	 */
	public int getEstado() {
		return estado;
	}
	
	/**
	 * @param estado Recibe y valida entero estado
	 * 1 sin problemas
	 * 2 con observaciones
	 * 3 no aprueba
	 */
	public void setEstado(int estado) {
		if (estado<1 || estado>3) {
			System.out.println("El estado puede ser 1, 2, 3");
		}else {
			this.estado = estado;
		}
	}

	// Metodos sobreescritos
	
	@Override
	public String toString() {
		return "Revision [idRevision=" + idRevision + ", idVisita=" + idVisita + ", nombreRevision=" + nombreRevision
				+ ", detalle=" + detalle + ", estado=" + estado + "]";
	}
}
