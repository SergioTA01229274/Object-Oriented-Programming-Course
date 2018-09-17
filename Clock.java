public class Clock{
	private int hr, 
		    min,
		    sec; 
	private String cd;



	public Clock(){
		this(13, 56, 42, "Guadalajara"); // El segundo uso de this es referirce a otro constructor de la misma clase.
		//Debe ser el primer comando del metodo 
	}
	public Clock(int hr, int min, int sec, String cd){
		this.setTime(hr, min, sec);  //En java no importa cuando se declara un metodo y cuando se usa
		this.cd = cd;
	}
	public void setTime(int hr, int min, int sec){ // Usamos setTime como validacion de datos para todos los metodos
		if(hr >= 0 && hr < 24){
			this.hr = hr;
		}else{
			this.hr = 13;
		}
		if(min >= 0 && min < 60){
			this.min = min;
		}else{
			this.min = 56;
		}
		if(sec >= 0 && sec < 60){
			this.sec = sec;
		}else{
			this.sec = 20;
		}

	}
	public void setCiudad(String cd){
		this.cd = cd;
	}
	public String getCiudad(){
		return this.cd;
	}
	public int getHours(){
		return this.hr;
	}
	public int getMinutes(){
		return this.min;
	}
	public int getSeconds(){
		return this.sec;
	}
	public void printTime(){
		System.out.print("Son las: ");
		if(this.hr < 10){
			System.out.print("0" + this.hr + ":");
		}else{
			System.out.print(this.hr + ":");
		}
		if(this.min < 10){
			System.out.print("0" + this.min + ":");
		}else{
			System.out.print(this.min + ":");
		}
		if(this.sec < 10){
			System.out.print("0" + this.min + ":");
		}else{
			System.out.print(this.sec + ":");
		}
	}
	public void incrementHours(){
		this.hr = ++this.hr % 24;
	}
	public void incrementMinutes(){
		this.min = ++this.min % 60;
		if(this.min == 0){
			this.incrementHours();
		}
	}
	public void incrementSeconds(){
		this.sec = ++this.sec % 60;
		if(this.sec == 0){
			this.incrementMinutes();
		}
	}
	public String toString(){
		String result = this.cd + " ";
		if(this.hr < 10){
			result += "0" + this.hr + ":";
		}else{
			result += this.hr + ":";
		}
		if(this.min < 10){
			result += "0" + this.min + ":";
		}else{
			result += this.min + ":";
		}
		if(this.sec < 10){
			result += "0" + this.min + ":";
		}else{
			result += this.sec + ":";
		}
		return result;
	}
	public boolean equals(Clock alf){  // puede mejeorar este metodo. se puede usar object.equals(object2)
		if(alf.hr == this.hr){
			if(alf.min == this.min){
				if(alf.sec == this.sec){
					return true;
				}else{
					return false;
				}
			}else{
				return false;
			}
			
		}else{
			return false;
		}
	}
	public void makeCopy(Clock alf){
		this.setTime(alf.hr, alf.min, alf.sec);  //nuestro objeto host se modifica por los atributos del objeto parametro
	}
	public Clock getCopy(){
		Clock copy = new Clock(this.hr, this.min, this.sec, this.cd);
		return copy;
		// return new Clock(this.hr, this.min, this.sec); seria una opcion de simplificacion
	}
}