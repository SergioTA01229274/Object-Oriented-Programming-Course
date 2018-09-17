//Sergio Ivan Tostado Nieto A01229274
//Programacion Orientada a Objetos
//13/01/2018
// Comentarios: Tengo algunas dudas sobre la creacion y el uso de los objetos llamados UserIn y generator

import java.util.Scanner;
import java.util.Random;

public class Turno{
	static Scanner UserIn = new Scanner(System.in); 
	static Random generator = new Random();
	public static void piedraPapelTijera(){
		System.out.println("Por favor ingrese su numero: ");
		int userMove = UserIn.nextInt();
		int computerMove = generator.nextInt(3);
		System.out.println("El programa genero el numero: " + computerMove);
		if(userMove >= 0 && userMove <= 2){
			switch (computerMove) {
				case 0:
					if(userMove == 1){
						System.out.println("Ganaste el papel vence a la piedra");
						break;
					}else if(userMove == 2){
						System.out.println("Perdiste la piedra vence a las tijeras");
						break;
					}else{
						System.out.println("Es un empate");
						break;
					}
				case 1:
					if(userMove == 1){
						System.out.println("Es un empate");
						break;
					}else if(userMove == 2){
						System.out.println("Ganaste las tijeras cortan al papel");
						break;
					}else{
						System.out.println("Perdiste el papel vence a la roca");
						break;
					}
				case 2:
					if(userMove == 1){
						System.out.println("Perdiste las tijeras cortan el papel");
						break;
					}else if(userMove == 2){
						System.out.println("Es un empate");
						break;
					}else{
						System.out.println("Ganaste la piedra rompe las tijeras");
						break;
					}
			}
			
		}else{
			System.out.println("Esa no es una eleccion correcta");
		}
	}
	public static void main(String[] args){
		System.out.println("Vamos a jugar Piedra, Papel o Tijera");
		System.out.println("Usted ingresara un numero entre 0 y 2 inclusivos");
		System.out.println("0 es piedra, 1 es papel y 2 es tijera");
		System.out.println("El porgrama generara un numero aleatoriamente y veremos quien gana");
		piedraPapelTijera();
	}
}