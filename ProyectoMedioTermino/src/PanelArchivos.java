import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelArchivos extends JPanel {

	private JButton btAbrir;
	private Deduccion calculo;
	
	public PanelArchivos() {
		super();
		this.setBackground(new Color(255, 255, 255));
		this.setPreferredSize(new Dimension(250,500));
		
		this.btAbrir=new JButton("Abir documento");
		this.calculo = new Deduccion();

		this.btAbrir.setFont(new Font("Arial", Font.PLAIN, 15));
		this.btAbrir.setBackground(new Color(0, 153, 255));
		this.btAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File guardarDoc;
				JFileChooser fcGuardarR = new JFileChooser();
				fcGuardarR.showSaveDialog(PanelArchivos.this);
			    guardarDoc = fcGuardarR.getSelectedFile();
			    
			    //System.out.println(guardarDoc.getPath());
			    try {
			    	FileReader fr = new FileReader(guardarDoc);
			    	BufferedReader bf = new BufferedReader(fr);
			    	
			    	String Path = guardarDoc.getPath();
			    	String newPath = Path.substring(0, Path.lastIndexOf('\\'));
			    	FileWriter fw = new FileWriter(newPath + "\\Resultados2.csv");
			    	PrintWriter pw = new PrintWriter(fw);
			    	String linea;
			    	String[] dat;
			    	
					while((linea = bf.readLine()) != null) {
						dat = linea.split(",");
						String result = "";
						String[] beta = PanelArchivos.this.calculo.calcularImpuestos(dat);
						for(int i = 0;  i < beta.length; i++) {
							result += beta[i] + ", ";
						}
						pw.println(result);
					}
					JOptionPane.showMessageDialog(null, "Se ha calculado el ISR de todos los empleados exitosamente.");
			    	bf.close();
			    	pw.close();
				}catch (FileNotFoundException e2) {
					JOptionPane.showMessageDialog(null, "No se pudo encontrar el archivo en la dirreccion seleccionada");
				}catch (IOException e2) {
					JOptionPane.showMessageDialog(null, "No se pudo leer el archivo en la dirreccion seleccionada");
				} catch(NullPointerException e2) {
					JOptionPane.showMessageDialog(null, "No se selecciono ningun archivo. Intentelo de nuevo.");
				}
			}
		});
		
		this.add(new JLabel("                                                                                                                                                     "));
		
		this.add(btAbrir);
	}
	public void visible(boolean a) {
		this.setVisible(a);
	}
}
