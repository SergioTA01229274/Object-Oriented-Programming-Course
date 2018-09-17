import java.util.ArrayList;

public class EjemploWildCard {
	
	public static double suma(ArrayList<? extends Number> numeros) { //Asi se declara un comodin que hereda de una clase padre
		double result = 0;
		for(int i = 0; i < numeros.size(); i++) {
			result += numeros.get(i).doubleValue();
		}
		return result;
	}
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(10);
		numbers.add(18);
		numbers.add(17);
		numbers.add(16);
		numbers.add(15);
		numbers.add(14);
		numbers.add(13);
		numbers.add(12);
		numbers.add(11);
		
		System.out.println(EjemploWildCard.suma(numbers));
	}
}
