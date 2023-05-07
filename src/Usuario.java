
public class Usuario {
	
	private String nombre;
	private int edad;
	private String DNI;
	
	public Usuario () {
		
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getDNI() {
		return DNI;
	}
	
	public boolean setDNI (String DNI) {
		
		   if (DNI.matches("\\d{8}(-[A-Z])|\\d{8}[A-Z]")) {
		      System.out.println("Código válido");
		      this.DNI = DNI;
		      return true;
		   } else {
		      System.out.println("El código no es válido, inténtelo de nuevo");
		      return false;
		   }
	}
	
	public String toString() {
		return "# Mostrando datos del Usuario: \n"
				+ "_____________________________________________\n"
				+ "- Nombre: " + nombre + "\n" 
	            + "- Edad: "+ edad + "\n"
				+ "- DNI: " + DNI + "\n"
				+ "_____________________________________________\n";
		
		
	}

}
