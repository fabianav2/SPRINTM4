package sprint;

import java.util.ArrayList;

/** 
 * @version 1.0.0  Trabajo Sprint M4
 * @author Nicolae Villegas
 * @author Jesus Torres
 * @author Cristian Díaz
 * @author Fabiana Vega
 */

/**
 * Clase Contendor: Contiene los metodos de ejecución
 * de las acciones del selector pricipal.
 */
public class Contenedor {

	ArrayList<IAsesoria> listaIAsesoria = new ArrayList<>();
	ArrayList<Capacitacion> listaCapacitacion = new ArrayList<>();
	
	public void almacenarCliente(Cliente itemCliente) {
		listaIAsesoria.add(itemCliente);
	 }
	
	public void almacenarProfesional(Profesional itemProfesional) {
		listaIAsesoria.add(itemProfesional);
	 }

	public void almacenarAdministrativo(Administrativo itemAdministrativo) {
		listaIAsesoria.add(itemAdministrativo);
	 }
	
	public void almacenarCapacitacion(Capacitacion itemCapacitacion) {
		listaCapacitacion.add(itemCapacitacion);
	 }
	
	public void eliminarUsuario(int runUsuario) {
		listaIAsesoria.removeIf(iasesoria -> (iasesoria.obtieneRunUsuario()==runUsuario));
		System.out.println("Usuario eliminado.");
		System.out.println("******************");
	}
	
	public void listarUsuarios() {
		for (IAsesoria iasesoria: listaIAsesoria) {
			System.out.println("Usuario: "+iasesoria.toString());
		}
	}
	
	public void listarUsuarios(String tipoUsuario) {
		for (IAsesoria iasesoria: listaIAsesoria) {
			if(tipoUsuario.equals(iasesoria.getClass().getSimpleName())) {
				System.out.println(iasesoria);
			}
		}
	}
	
	public void listarCapacitaciones() {
		for (Capacitacion capacitacion: listaCapacitacion) {
			System.out.println("Capacitacion: "+capacitacion.toString());
		}
	}
}
