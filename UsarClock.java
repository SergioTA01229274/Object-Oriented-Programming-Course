public class UsarClock{
	public static void main(String[] args){
		Clock gdl = new Clock(9, 6, 40, "GDL");
		Clock tij = new Clock(22, 59, 59, "MTY");
		Clock ny = new Clock(10, 6, 20, "CCM");
		Clock lon = new Clock(22, 59, 59, "TON");
		lon.printTime();
		gdl.printTime();
		tij.printTime();
		ny.printTime();
		
		if(ny.equals(lon)){  // El metodo equals nos regresa un valor booleano
			System.out.println("La hora en NY y Lon es la misma");
		}else{
			System.out.println("La hora en NY y Lon no es la misma");
		}
		Clock cdmx = gdl.getCopy();  // nos genera un objeto diferente con los mismos atributos del objeto host
		/*Clock cdmx = gda; nos genera dos identificadores o variables para un mismo 
		objeto, comparten la misma direccion de memoria
		Como son el mismo objeto, si modificamos los atributos de cdmx tambien se cambian los de gdl*/
	}
}