package sprint;

/** 
 * @version 1.0.0  Trabajo Sprint M4
 * Clase principal con selector de opciones
 * @author Nicolae Villegas
 * @author Jesus Torres
 * @author Cristian Díaz
 * @author Fabiana Vega
 */

import java.util.ArrayList;
import java.util.List;

public class Listado {
	 List<Usuario> listaUsuarios = new ArrayList<>();
	
	 public void agregarLista(Usuario item) {
		 listaUsuarios.add(item);
	 }
	 
	 public void mostrarLista() {
		 for(Usuario elemento: listaUsuarios) {
			 System.out.println("Lista de Usuarios ");
			 elemento.analizarUsuario();
		 }
	 }
}
