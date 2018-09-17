//Sergio Ivan Tostado Nieto A01229274
//Programacion Orientada a Objetos 
//24/01/2018


public class Complejo{
	private double real;
	private double imaginaria;
	
	public Complejo(){
		this.real = 0;
		this.imaginaria = 0;
	}
	public Complejo(double real, double imag){
		this.establecer(real, imag);
	}
	public void establecer(double real, double imaginaria){
		this.real = real;
		this.imaginaria = imaginaria;
	}
	public void agregar(double real, double imaginaria){
		this.real += real;
		this.imaginaria += imaginaria;
	}
	public void agregar(Complejo delt){
		this.real += delt.real;
		this.imaginaria += delt.imaginaria;
	}
	public void imprimir(){
		if(this.real > 0 && this.imaginaria > 0){
			System.out.println(this.real + " + " + this.imaginaria + "i");
		}else if(this.real > 0 && this.imaginaria < 0){
			System.out.println(this.real + " " + this.imaginaria + "i");
		}else if(this.real < 0 && this.imaginaria > 0){
			System.out.println(this.real + " + " + this.imaginaria + "i");
		}else{
			System.out.println(this.real + " " + this.imaginaria + "i");
		}
		
	}
	public Complejo suma(Complejo alf){
		Complejo result = new Complejo();
		double imaginariaAlf;
		double realAlf;
		realAlf = this.real + alf.real;
		imaginariaAlf = this.imaginaria + alf.imaginaria;
		result.establecer(realAlf, imaginariaAlf);
		return result;
	}
	public Complejo resta(Complejo alf){
		Complejo result = new Complejo();
		double imaginariaAlf;
		double realAlf;
		realAlf = this.real - alf.real;
		imaginariaAlf = this.imaginaria - alf.imaginaria;
		result.establecer(realAlf, imaginariaAlf);
		return result;
	}
	public Complejo conjugado(){
		Complejo result = new Complejo();
		result.establecer(this.real, -this.imaginaria);
		return result;
	}
	public Complejo multiplicacion(Complejo alf){
		Complejo result = new Complejo();
		double imaginariaAlf;
		double realAlf;
		realAlf = (this.real*alf.real - this.imaginaria*alf.imaginaria);
		imaginariaAlf = (this.real*alf.imaginaria + this.imaginaria*alf.real);
		result.establecer(realAlf, imaginariaAlf);
		return result;
	}
	public Complejo multiplicacion(double x){
		Complejo result = new Complejo();
		double imaginariaAlf;
		double realAlf;
		realAlf = this.real*x;
		imaginariaAlf = this.imaginaria*x;
		result.establecer(realAlf, imaginariaAlf);
		return result;
	}
	public static void main(String[] args){
		Complejo ej1 = new Complejo(1, -3);
		Complejo ej2 = new Complejo(-2, 5);
		Complejo ej3 = new Complejo(-1, -2);
		Complejo ej4 = new Complejo(5, 6);
		Complejo ej5 = ej2.suma(ej4);
		ej1.imprimir();
		ej2.imprimir();
		ej3.imprimir();
		ej4.imprimir();
		ej5.imprimir();
	}
}