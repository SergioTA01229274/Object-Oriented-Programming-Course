import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class PagoNomina {
	public static void main(String[] args) throws IOException {
		BufferedReader  bf = new BufferedReader(new FileReader("C:\\Users\\sergio\\Desktop\\horasTrabajadas.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\sergio\\Desktop\\nomina.txt"));
		String linea;
		StringTokenizer st;
		String nombre, apellido;
		int hrs;
		double tabulador;
		bf.readLine();
		while((linea = bf.readLine()) != null) {
			st = new StringTokenizer(linea, " ");
			nombre = st.nextToken();
			apellido = st.nextToken();
			hrs = Integer.parseInt(st.nextToken());
			tabulador = Double.parseDouble(st.nextToken());
			pw.println(apellido + " " + nombre + " " + hrs + tabulador);
		}
		bf.close();
		pw.close();
	}
}
