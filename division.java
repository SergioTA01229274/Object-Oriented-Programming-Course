//Sergio Ivan Tostado Nieto
//Programacion Orientada a Objetos
//25/02/2018

import javax.swing.JOptionPane;

public class division{
	public static int Division(int num, int den) {
		return num/den;
	}
	public static void main(String[] args) {
			int num = 0;
			int den = 0;
			do{
				while(true){
					try {
						String strNum = JOptionPane.showInputDialog("Introduce el numerador: ");
						num = Integer.parseInt(strNum);
						break;	
					}catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "El dato introducido debe ser un numero entero entre -2147483548 y 2147483547");
						JOptionPane.showMessageDialog(null, "Ingrese nuevamente el dato.");
					}
				}
				while(true){
					try {
						String strDen = JOptionPane.showInputDialog("Introduce el denominador: ");
						den = Integer.parseInt(strDen);	
						break;
					}catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "El dato introducido debe ser numeros enteros entre -2147483548 y 2147483547");
						JOptionPane.showMessageDialog(null, "Ingrese nuevamente el dato.");
					}
				}
				try {
					JOptionPane.showMessageDialog(null, "El resultado de la division entera: " + num + " / " + den  + " es " + Division(num, den));
					break;
				}catch (ArithmeticException e) {
					JOptionPane.showMessageDialog(null, "No es posible realizar una division cuyo denominador es 0");
					JOptionPane.showMessageDialog(null, "Ingrese nuevamente ambos datos.");
				}
			}while(true);
		}

}
