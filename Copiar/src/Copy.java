//Sergio Ivan Tostado Nieto
//A01229274
//Programacion Orientada a Objetos



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Copy {
	public static String acomodar(String ruta) {
		String result = "";
		for(int i = 0; i < ruta.length(); i++) {
			if(ruta.charAt(i) == '\\'){
				result += "\\";
				result += "\\";
			}else {
				result += ruta.charAt(i);
			}
			
		}
		return result;
		
	}
	public static void copiar(String originPath, String destinyPath){
		try {
			BufferedReader bf = new BufferedReader(new FileReader(acomodar(originPath)));
			PrintWriter pw = new PrintWriter(acomodar(destinyPath));
			String linea;
			while((linea = bf.readLine()) != null) {
				pw.println(linea);
			}
			bf.close();
			pw.close();
			System.out.println("Se ha copiado y pegado el archivo exitosamente");
		}catch (FileNotFoundException e) {
			System.out.println("No se pudo encontrar el archivo en la ruta especificada");
		}catch (IOException e) {
			System.out.println("Hubo un problema en el copiado y pegado del archivo");
		}
		
	}
	
	public static void main(String[] args) {
		copiar(args[0], args[1]);
	}

}
