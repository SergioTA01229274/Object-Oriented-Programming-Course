import java.util.NoSuchElementException;

public class EjemploMetodoGenerico {
	
	//Implementacion no generica de un metodo, solo util con arreglo de enteros
	public static void imprimeArreglo(int[] alpha) {
		for(int i = 0; i < alpha.length; i++) {
			System.out.print(alpha[i] + ", ");
		}
	}
	//Implementacion generica
	public static <E> E imprime(E[] beta) throws NoSuchElementException {
		try {
			for(int i = 0; i < beta.length; i++) {
				System.out.print(beta[i] + ",");
			}
			return beta[0];
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new NoSuchElementException();
		} catch (NullPointerException e) {
			throw new NoSuchElementException();
		}
		
	}
	public static void main(String[] args) {
		try {
			Integer[] e1 = {1, 2, 3, 4, 5};  //Para declarar arreglos de tipo referenciados en vez de primitivos, usamos las clases Integer, Float, Double, etc.
			//imprimeArreglo(e1);
			
			String[] e2 = {};
			imprime(e1);  //los genericos no trabajan con datos primitivos, solo con datos referenciados (clases).
			System.out.println("");
			imprime(e2);
		} catch (NoSuchElementException e) {
			System.out.println("Hay un arreglo esta vacio :(");
		}
		
	}
}
