import java.util.Random;  //libreria para generar numeros aleatorios

public class baraja{

	private naipe[] cartas; //arreglos de objetos naipe
	
	public baraja(){
		this.cartas = new naipe[52];
		int cont = 0;
		for(int i = 0; i < naipe.strPalo.length; i++){
			for(int j = 0; j < naipe.strValor.length; j++){
				this.cartas[cont++] = new naipe(j, i);
			}
		}
	}
	public void mezcla(){
		Random ran = new Random();
		int aleatorio;
		naipe temporal;
		for(int i = 0; i < cartas.length; i++){
			aleatorio = ran.nextInt(52);
			temporal = cartas[i]; //nuestra variable temporal nos 
			//permite revolver los elementos del arreglo de objetos
			cartas[i] = cartas[aleatorio];
			cartas[aleatorio] = temporal;
			
		}
	}
	public String toString(){
		String result = "";
		for(int i = 0; i < cartas.length;i++){
			result += cartas[i] + "\n";
		}
		return result;
	}

}