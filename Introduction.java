//Sergio Ivan Tostado Nieto A01229274
//Programacion Orientada a Objetos
//13/01/2018

import java.util.Scanner;

public class Introduction{
	static Scanner UserIn = new Scanner(System.in);
	public static void CalculateGrade(){
		System.out.println("Ingrese la calificacion del alumno");
		int grade = UserIn.nextInt();
		if(grade > 70){
			System.out.println("Aprobado");
		}else{
			System.out.println("Reprobado");
		}
	}
	public static void Numbers(){
		for(int i = 0; i < 100; i++){
			System.out.println(i + 1);
		}
	}
	public static void Serie(int num){
		for(int i = 0; i < 50; i++){
			System.out.println(num*(i*i));
		}
	}
	public static int HowMuchCalories(){
		System.out.println("Inserte el numero de comidas que consumio hoy: ");
		int numberOfMeals = UserIn.nextInt();
		int numberOfCalories = 0;
		int totalCalories = 0;
		for(int i = 0; i < numberOfMeals; i ++){
			System.out.println("Inserte el numero de calorias de la comida " + (i + 1) + ":");
			numberOfCalories = UserIn.nextInt();
			totalCalories += numberOfCalories;
		}
		return totalCalories;
	}
	public static void main(String[] args){
		CalculateGrade();
		Numbers();
		Serie(2);
		System.out.println("Su consumo total de calorias es: " + HowMuchCalories());
	}
}