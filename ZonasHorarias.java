public class ZonasHorarias{

	private Clock[] horasCds;

	public ZonasHorarias(){
		this.horasCds = new Clock[10];
	}
	public void ponerHora(int pos, int hr, int min, int sec, String cd){
		if(this.horasCds[pos] == null){
			this.horasCds[pos] = new Clock(hr, min, sec, cd);
		}else{
			this.horasCds[pos].setTime(hr, min, sec);
			this.horasCds[pos].setCiudad(cd);
		}
	}
	public String toString(){
		String result = "";
		for(int i = 0; i < this.horasCds.length; i++){
			if(this.horasCds[i] != null){
				result += this.horasCds[i] + "\n";
			}
		}
		return result;
	}
	public void cambiarHorarioInvierno(){
		for(int i = 0; i < this.horasCds.length; i++){
			if(this.horasCds[i] != null){
				this.horasCds[i].incrementHours();
			}
		}
	}
	public static void main(String[] args){
		ZonasHorarias zh = new ZonasHorarias();
		zh.ponerHora(0, 9, 12, 30, "Guadalajara");
		zh.ponerHora(1, 10, 12, 30, "NY");
		zh.ponerHora(2, 11, 12, 30, "Toronto");
		zh.ponerHora(3, 16, 12, 30, "Egipto");
		System.out.println(zh);
		zh.ponerHora(2, 16, 12, 30, "Toronto");
		zh.cambiarHorarioInvierno();
		System.out.println(zh);
	}


}