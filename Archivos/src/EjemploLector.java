import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjemploLector {
	public static void main(String[] args) {
		try {
			String linea;
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\sergio\\Documents\\Universidad\\new\\nuevo.txt"));  //se pasa como parametro al constructor un objeto filereader, se especfica el path donde se encuentra el objeto por leer
			linea = br.readLine();
			System.out.println(linea);
			br.close();
		}
		catch(FileNotFoundException ex) {
			System.out.println("No se encontro el archivo en la ruta especificada");
		}
		catch(IOException e) {
			System.out.println("No se pudo leer el archivo");
		}
	}	
}
