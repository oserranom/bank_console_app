
public class Ingreso extends Dinero {
	
//La clase Ingreso se crea de la misma forma que la clase Gasto.
	
public Ingreso (double ingreso, String description) {
		
		this.dinero = ingreso;
		this.description = description;
				
	}
	

	public String toString() {
		return this.description + " " + this.dinero + " € \n"; 
	}

}
