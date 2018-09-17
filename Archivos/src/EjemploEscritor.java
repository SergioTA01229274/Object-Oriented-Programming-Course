import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EjemploEscritor {
		public static void main(String[] args) {
			try {
				FileWriter fw = new FileWriter("C:\\Users\\sergio\\Documents\\Universidad\\new\\nuevo.txt");  // FileWriter crea el archivo de texto
				PrintWriter pw = new PrintWriter(fw); //PrintWriter escribe en el archivo creado, se pasa el archivo creado como parametro al constructor.
				pw.println("Este es un archivo de texto.");
				for (int i = 0; i < 10; i++) {
					pw.println(i + 1 + ")");
					
				}
				pw.close();
			} catch (IOException e) {
				System.out.println("No se pudo escribir el archivo");
			}
		}

}
