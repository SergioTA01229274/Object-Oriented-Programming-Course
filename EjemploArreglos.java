public class EjemploArreglos{
	public int suma(int[] arreglo){
		int result = 0;
		for(int i = 0; i < arreglo.length; i++){
			result += arreglo[i];
		}
		return result;
	}
	public int maximo(int[] arreglo){
		int max = arreglo[0];
		for(int i = 0; i < arreglo.length; i++){
			if(arreglo[i] > max){
				max = arreglo[i];
			}
		}
		return max;
	}
	public int minimo(int[] arreglo){
		int min = arreglo[0];
		for(int i = 0; i < arreglo.length; i++){
			if(arreglo[i] < min){
				min = arreglo[i];
			}
		}
		return min;
	}
	public void imprime(String[][] palabras){
		for(int i = 0; i < palabras.length; i++){
			for(int j = 0; j < palabras[i].length; j++){
				System.out.print(palabras[i][j] + "\t");
			}
			System.out.println();
		}
	}
	public double promedio(int[] arreglo){
		double result = 0;
		for(int i = 0; i < arreglo.length; i++){
			result += arreglo[i];
		}
		return result/arreglo.length;
	}
	public static void main(String[] args){
		EjemploArreglos ea = new EjemploArreglos();  // Para poder llamar a nuestros metodos de la clase es 
		//necesario crear un objeto de la clase, ya que nuestro metodos no son estaticos, a diferencia del main.
		
		int[] numeros = {7, 23, 43, 23, 1, 8, 3};
		String[][] words = {{"hola", "que", "tal"}, {"no", "pos", "aqui", "andamos"}, {"good", "good"}};
		
		System.out.println(ea.suma(numeros));
		System.out.println(ea.maximo(numeros));
		System.out.println(ea.minimo(numeros));
		ea.imprime(words);
		System.out.println(ea.promedio(numeros));
		
		//Tarea de impresion de matriz con argumentos de args.
		String[] chars = new String[args.length - 2];
		
		int cont = 0;
		for(int i = 2; i < args.length; i++){
			chars[cont] = args[i];
			cont++;
		}
		int argsRow = Integer.parseInt(args[0]);
		int argsCol = Integer.parseInt(args[1]);
		String[][] chars2 = new String[argsRow][argsCol];
		
		cont = 0;
		int cont2 = 0;
		
		for(int i = 0; i < chars2.length; i++){
			do{
				chars2[i][cont2] = chars[cont];
				cont2++;
				cont++;
			}while(cont2 % argsCol != 0);
			cont2 = 0;
		}
		ea.imprime(chars2);
	}
}