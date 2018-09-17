public class UsoTermometro{
	public static void main(String[] args){
		Termometro gda = new Termometro(11);
		Termometro mty = new Termometro(12);
		Termometro chi = new Termometro();
		
		System.out.println(gda.getTemp());
		System.out.println(mty.getTemp());
		System.out.println(chi.getTemp());
	}

}