package sprint;

/*
 * Por acuerdo con el profesor se elimina el atributo rut
 * porque este ya existe en la clase padre Usuario 
 */

public class Clientes extends Usuario{

	private String nombres;
	private String apellidos;
	private String telefonos;
	private String afp;
	private int sistemaSalud;
	private String direccion;
	private String comuna;
	private byte edad;
	
	// Constructores
	
	public Clientes(String nombreUsuario, String fechaNacimiento, int rut,
			String nombres, String apellidos,String telefonos, String afp,
			int sistemaSalud, String direccion, String comuna, byte edad) {
		
		super(nombreUsuario, fechaNacimiento, rut);
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefonos = telefonos;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}

	public Clientes(String nombres, String apellidos,String telefonos, String afp,
			int sistemaSalud, String direccion, String comuna, byte edad) {
		
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefonos = telefonos;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}

	public Clientes() {}
	
	//Metodos de la clase
	public int obtenerSistemaSalud(int sistemaSalud) {
		return sistemaSalud;
	}
	
	public String obtenerNombre(String nombres, String apellidos) {
		String nombreCompleto = nombres + " "+ apellidos; 
		return nombreCompleto; 
	}
	
	// Metodos getters y setters
	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(String telefonos) {
		this.telefonos = telefonos;
	}

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public int getSistemaSalud() {
		return sistemaSalud;
	}

	public void setSistemaSalud(int sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public byte getEdad() {
		return edad;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}

	
	// Métodos sobreescritos
	@Override
	public String toString() {
		return "Clientes [Nombres=" + nombres + 
				", apellidos=" + apellidos + 
				", telefonos=" + telefonos + 
				", afp=" + afp + 
				", sistemaSalud=" + sistemaSalud + 
				", direccion=" + direccion + 
				", comuna=" + comuna + 
				", edad=" + edad + "]";
	}
	
	@Override
	public void analizarUsuario() {
		
		super.analizarUsuario();

		System.out.println("Nombres: "+this.getNombres());
		System.out.println("Apellidos: "+this.getApellidos());
		System.out.println("Telefonos: "+this.getTelefonos());
		System.out.println("AFP: "+this.getAfp());
		System.out.println("Sistema Salud: "+this.getSistemaSalud());
		System.out.println("Direccion: "+this.getDireccion());
		System.out.println("Comuna: "+this.getComuna());
		System.out.println("Edad: "+this.getEdad());
		System.out.println("**********************************************");
	}

}
