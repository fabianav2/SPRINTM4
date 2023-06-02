package sprint;

/** 
 * @version 1.0.0  Trabajo Sprint M4
 * @author Nicolae Villegas
 * @author Jesus Torres
 * @author Cristian Díaz
 * @author Fabiana Vega
 */

/** Clase Administrativo extiende de clase Usuario
* Atributos:
* area
* aniosExperiencia
*/
public class Administrativo extends Usuario {

	private String area;
	private String aniosExperiencia;
	
	// Constructores
	
	public Administrativo() {}
	
	public Administrativo(String nombreUsuario, String fechaNacimiento, int rut,
			String area, String aniosExperiencia) {
		super(nombreUsuario,fechaNacimiento,rut);
		
		this.setAniosExperiencia(aniosExperiencia);
		this.setArea(area);
		
		this.area = this.getArea();
		this.aniosExperiencia = this.getAniosExperiencia();
	}
	
	// Métodos getters y setters
	
	/**
	 * @return Retorna cadena area
	 */
	public String getArea() {
		return area;
	}
	
	/**
	 * @param area Recibe y valida cadena area
	 * obligatorio, mínimo 5 caracteres, máximo 20
	 */
	public void setArea(String area) {
		if (Validaciones.validaLargoCadena(area, 5, 20)) {
		this.area = area;
		}
	}
	
	/**
	 * @return retorna cadena años de experiencia 
	 */
	public String getAniosExperiencia() {
		return aniosExperiencia;
	}
	
	/**
	 * @param aniosExperiencia Recibe y valida cadena aniosExperiencia
	 * máximo 100 caracteres
	 */
	public void setAniosExperiencia(String aniosExperiencia) {
		if (Validaciones.validaLargoCadena(aniosExperiencia, 0, 100)) {
			this.aniosExperiencia = aniosExperiencia;
		}
	}
	
	// Métodos sobreescritos
	
	@Override
	public String toString() {
		return "Administrativo [area=" + area + 
				", aniosExperiencia=" + aniosExperiencia + 
				", toString()="	+ super.toString() + "]";
	}

	@Override
	public void analizarUsuario() {
		
		super.analizarUsuario();
		
		System.out.println("Area: "+this.getArea());
		System.out.println("Años experiencia: "+this.getAniosExperiencia());
		System.out.println("**********************************************");
	}	
}