import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);
	Usuario usuario = new Usuario();
	usuario.setNombre("Juan");
	usuario.setEdad(25);
	usuario.setDNI("12345678A");
	int action;
	String DNI;
	
	System.out.println("Bienvenido a la aplicación M03BCuentas\n" + "Introduzca un nombre: \n");
	usuario.setNombre(sc.nextLine());
	
	System.out.println("Introduzca su edad en años: \n");
	usuario.setEdad(sc.nextInt());
	sc.nextLine();
	
	do {
	System.out.println("Introduzca un DNI válido:  \n");
	DNI = sc.nextLine();
	} while ((usuario.setDNI(DNI)) != true);
	
	
	System.out.println("Usuario creado correctamente \n");
	System.out.println(usuario.toString());
	
	String menu = "   Realiza una nueva acción: \n"
                + " -------------------------------- \n"
                + "  (1) Introduce un nuevo gasto \n"
                + "  (2) Introduce un nuevo ingreso \n"
                + "  (3) Mostrar gastos \n"
                + "  (4) Mostrar ingresos \n"
                + "  (5) Mostrar saldo \n"
                + "  (0) Salir de la app \n";
	
	System.out.println(menu);
	
	action = sc.nextInt();
	sc.nextLine();
	
	Cuenta cuenta = new Cuenta (usuario);
	
	while (action != 0) {
		
	 switch (action) {
	  
	  case 1:		  
		    System.out.println("Introduce la descripción del gasto: \n");
			String descriptionG = sc.nextLine();
			System.out.println("Introduce la cantidad del gasto: \n");
			String gastoStr = sc.nextLine();
			double gasto1 = Double.parseDouble(gastoStr.replace(',', '.'));
			Gasto gasto = new Gasto(gasto1, descriptionG);
			System.out.println(gasto.toString());
			try {				
				cuenta.addGastos(descriptionG, gasto1);
			    } catch (GastoException e) { 
			    	System.out.println("No hay saldo suficiente en la cuenta para este gasto \n");
			    }			
			cuenta.toString();
			System.out.println(menu);
			break;
		  
	   case 2:
		  System.out.println("Introduce la descripción del ingreso: \n");
		  String descriptionI = sc.nextLine();
		  System.out.println("Introduce la cantidad del ingreso: \n");
		  String ingresoStr = sc.nextLine();
		  double ingreso1 = Double.parseDouble(ingresoStr.replace(',','.'));
		  Ingreso ingreso = new Ingreso(ingreso1, descriptionI);
		  System.out.println(ingreso.toString());
		  cuenta.addIngresos(descriptionI, ingreso1);
		  cuenta.toString();
		  System.out.println(menu);
		  break;
		  
	   case 3:	   
		   
		   System.out.println(cuenta.getGastos());
		   System.out.println(menu);
		   break;
		   
	   case 4:
		  
		   System.out.println(cuenta.getIngresos());
		   System.out.println(menu);
		   break;
		   
	   case 5:
		   String saldoFormatted = String.format("%.2f", cuenta.getSaldo()).replace('.', ',');
		   System.out.println("Saldo actual: " + (saldoFormatted) + "\n");
		   System.out.println(menu);
		   break;	  
		   
	   default:
		  System.out.println("operación inválida");
		  
	      }
	 
	 action = sc.nextInt();
	 sc.nextLine();
	  
	}
	
	System.out.println(" Fin del programa.\n Gracias por utilizar la aplicación de M03B en el curso 2s2223.");
		sc.close();
	}
	
}
