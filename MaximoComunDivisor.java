//Sergio Ivan Tostado Nieto A01229274
//Programacion Orientada a Objetos
//13/01/2018

public class MaximoComunDivisor{
	public static int mcd(int a, int b){
		int i = 1;
		int result = 0;
		while(i <= a && i <= b){
			if(a % i == 0){
				if(b % i == 0){
					result = i;
				}
			}
			i += 1;
		}
		return result;
	}
	public static void main(String[] args){
		System.out.println(mcd(30, 30));
		System.out.println(mcd(62, 90));
		System.out.println(mcd(115, 95));
	}
}