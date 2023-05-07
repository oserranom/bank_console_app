import java.util.ArrayList;
import java.util.List;
public class Cuenta {

	private double saldo;
	private Usuario usuario;
	private List<Gasto> gastos = new ArrayList <Gasto>();
	private List<Ingreso> ingresos = new ArrayList <Ingreso>();
	
	public Cuenta (Usuario usuario){
		saldo = 0;
		this.usuario = usuario;

	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo (double saldo) {
		this.saldo = saldo;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public double addIngresos(String description, double cantidad) {
		Ingreso nuevoIngreso = new Ingreso(cantidad, description);
		ingresos.add(nuevoIngreso);
		saldo += cantidad;
		return saldo;
	}
	
	public double addGastos(String description, double cantidad) throws GastoException {
		
		if (cantidad > saldo) {
	        throw new GastoException();
	    }
		
		Gasto nuevoGasto = new Gasto (cantidad, description);	
		saldo -= cantidad;	
		gastos.add(nuevoGasto);		
		return saldo;
	}
	
	public List<Ingreso> getIngresos(){
		return ingresos;
	}
	
	public List<Gasto> getGastos(){
		return gastos;
	}
	
	public String toString() {
		return "- Saldo restante: " + saldo + " €\n\n";
		
	}
}


