public class naipe{
	private int valor, //0-> As, 1 -> 2, 2-> 3, ..., 10 -> J, 11 - > Q, 12-> K
		palo;      // 0 -> Espadas, 1 - > Corazones, 2 - > Treboles, 3 - > Diamantes

	public static final String[] strValor = 
{"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "Joto", "Reina", "Rey"};

	//final establece nuestra variable como una constante inmutable. 

	public static final String[] strPalo = {"Espadas", "Corazones", "Treboles", "Diamantes"};

	//static ocaciona que los atributos no sean atributos de instancia (de objetos), sino que se convierten 
	// en atributos de clase. Las instancias solo acceden a esa referencia de la clase, los atributos de 
	// clase no pueden acceder a atributos de instancia. 

	public naipe(int valor, int palo){
		this.valor = valor;
		this.palo = palo;
	}

//metodo toString nos imprime el objeto, no la direccion de memoria, no es necesario referenciarlo.
	public String toString(){ 
		return naipe.strValor[this.valor] + " de " + strPalo[this.palo];
	}

	public static void main(String[] args){
		naipe cuatroDeCorazones = new naipe(3, 1);
		baraja nva = new baraja();
		System.out.println(cuatroDeCorazones);
		System.out.print(nva);
		nva.mezcla();
		System.out.println("--------------------------");
		System.out.print(nva);
	}
	
	

}