public class Termometro{
	private int temp;
	public Termometro(){ // Contructor sin parametros que inicializa los atributos con un valor por default.
		temp = 23;
	}
	public Termometro(int t){ // Constructor con parametros inicializa el atributo con posibilidad variable 
		temp = t; 
	}
	public void setTemp(int t){   //setter (cambia el valor del atributo), IMPORTANTE: esto es un metodo, no constructor.
		temp = t;
	}
	public int getTemp(){      //getter (consulta/ regresa el valor del atributo)
		return temp;
	}

}