public class Mayor{
	public static int evaluation(int a, int b, int c){
		if(a > b && a > c){
			return a;
		}else if(b > a && b > c){
			return b;
		}else{
			return c;
		}
	}
	public static void main(String[] args){
		System.out.println(evaluation(5, 10, 2));
		System.out.println(evaluation(13, 10, 2));
		System.out.println(evaluation(5, 10, 20));
	}
}