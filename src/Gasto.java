
public class Gasto extends Dinero {
	
//Constructor de gasto, recibe double gasto y String description.
//Hay que indicar que gasto es = a dinero de la clase madre.
	
	public Gasto (double gasto, String description) {
		
		this.dinero = gasto;
		this.description = description;
				
	}
	
//Función toString para devolver el nombre del gasto y su cuantía.
	
	public String toString() {
		return this.description + " " + this.dinero + " € \n"; 
	}
		
}
