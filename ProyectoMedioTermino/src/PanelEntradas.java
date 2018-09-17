import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelEntradas extends JPanel{
	public JTextField tfNombre, tfRFC, tfSueldoMensual, tfAguinaldo, tfPrimaVaca, tfDMedicos, tfDGastos, tfSGMM, tfHipotecarios, 
						tfDonativos, tfRetiro, tfTransEscolar, tfColegiatura;
	
	private JButton btCalcular, btGuardarR;
	
	public JComboBox tfEducativo;
	
	private Deduccion calcular;
	
	private PanelResultados pR1;
	public PanelEntradas(PanelResultados PR) {
		super();
		String[] NivelesEducativos = {"Preescolar", "Primaria", "Secundaria", "Profesional Tecnico     ", "Bachillerato"};
		
		this.calcular = new Deduccion(this);
		this.setBackground(new Color(255, 255, 255));
		
		this.pR1 = PR;
		
		this.setPreferredSize(new Dimension(350,500));
		
		this.tfNombre=new JTextField(14);
		this.tfRFC=new JTextField(14);
		this.tfSueldoMensual=new JTextField("0", 14);
		this.tfAguinaldo=new JTextField("0", 14);
		this.tfPrimaVaca=new JTextField("0", 14);
		this.tfDMedicos=new JTextField("0", 14);
		this.tfDGastos=new JTextField("0", 14);
		this.tfSGMM=new JTextField("0", 14);
		this.tfHipotecarios=new JTextField("0", 14);
		this.tfDonativos=new JTextField("0", 14);
		this.tfRetiro=new JTextField("0", 14);
		this.tfTransEscolar=new JTextField("0", 14);
		this.tfEducativo=new JComboBox(NivelesEducativos);
		this.tfColegiatura=new JTextField("0", 14);
		
		this.tfEducativo.setEnabled(true);
		
		this.btCalcular=new JButton("Calcular");
		this.btGuardarR=new JButton("Guardar Resultados");
		this.btCalcular.setBackground(new Color(0, 153, 255));
		this.btGuardarR.setBackground(new Color(0, 153, 255));
		this.btCalcular.setFont(new Font("Arial", Font.PLAIN, 20));
		this.btGuardarR.setFont(new Font("Arial", Font.PLAIN, 20));
		
		
		this.btGuardarR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File guardarDoc;
				JFileChooser fcGuardarR = new JFileChooser();
				fcGuardarR.showSaveDialog(PanelEntradas.this);
			    guardarDoc = fcGuardarR.getSelectedFile();
			    //System.out.println(guardarDoc);
			    try {
			    	FileWriter fw = new FileWriter(guardarDoc + ".csv");
			    	PrintWriter pw = new PrintWriter(fw);
			    	pw.println(PanelEntradas.this.pR1.strNombre + ", " + PanelEntradas.this.pR1.strRFC + ", " + PanelEntradas.this.pR1.iSueldoMensual + ", " + PanelEntradas.this.pR1.iSueldoAnual + ", " + 
			    			PanelEntradas.this.pR1.iAguinaldo + ", " + PanelEntradas.this.pR1.iAguinaldoExc + ", " + PanelEntradas.this.pR1.iAguinaldoGrav + ", " + PanelEntradas.this.pR1.iPrimaVaca + ", " +
			    			PanelEntradas.this.pR1.iPVExcenta + ", " + PanelEntradas.this.pR1.iPVGravada + ", " + PanelEntradas.this.pR1.iIngresosGrav + ", " + PanelEntradas.this.pR1.iDMedicos
			    			+ ", " + PanelEntradas.this.pR1.iDGastos + ", " + PanelEntradas.this.pR1.iSGMM + ", "  + PanelEntradas.this.pR1.iHipotecarios + ", " + PanelEntradas.this.pR1.iDonativos + ", " +
			    			PanelEntradas.this.pR1.iRetiro + ", " + PanelEntradas.this.pR1.iTransEscolar + ", " + PanelEntradas.this.pR1.strEducacion + ", " + PanelEntradas.this.pR1.iMaxColegiatura + ", " + 
			    			PanelEntradas.this.pR1.iColegiatura + ", " + PanelEntradas.this.pR1.iTotalDeducciones + ", " + PanelEntradas.this.pR1.iDeduccionPerm + ", " + PanelEntradas.this.pR1.iMontoISR + ", " +
			    			PanelEntradas.this.pR1.iCuotaFija + ", " + PanelEntradas.this.pR1.iPorcentajeExc + ", " + PanelEntradas.this.pR1.iPagoExc + ", " + PanelEntradas.this.pR1.iTotal);
			    	pw.close();
				} catch (IOException e2) {
					JOptionPane.showMessageDialog(null, "No se pudo guardar el archivo en la dirreccion seleccionada");
				}
			}
		});
		
		
		this.btCalcular.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				PanelEntradas.this.calcular.setDatos();
				
				PanelEntradas.this.pR1.iAguinaldo = PanelEntradas.this.calcular.aguinaldo;
				PanelEntradas.this.pR1.strNombre = PanelEntradas.this.calcular.nombre;
				PanelEntradas.this.pR1.strRFC = PanelEntradas.this.calcular.RFC;
				PanelEntradas.this.pR1.iSueldoMensual = PanelEntradas.this.calcular.sueldoMensual;
				PanelEntradas.this.pR1.iPrimaVaca = PanelEntradas.this.calcular.primaVacacionalR;
				PanelEntradas.this.pR1.iDMedicos = PanelEntradas.this.calcular.dMedicosHosp;
				PanelEntradas.this.pR1.iDGastos = PanelEntradas.this.calcular.gastosF;
				PanelEntradas.this.pR1.iSGMM = PanelEntradas.this.calcular.SGMM;
				PanelEntradas.this.pR1.iHipotecarios = PanelEntradas.this.calcular.hipotecarios;
				PanelEntradas.this.pR1.iDonativos = PanelEntradas.this.calcular.donativos;
				PanelEntradas.this.pR1.iRetiro = PanelEntradas.this.calcular.aportacionRetiro;
				PanelEntradas.this.pR1.iTransEscolar = PanelEntradas.this.calcular.transporteEscolar;
				PanelEntradas.this.pR1.strEducacion = PanelEntradas.this.calcular.nivelEducativo;
				PanelEntradas.this.pR1.iColegiatura = PanelEntradas.this.calcular.colegiaturaTotal;
				
				PanelEntradas.this.calcular.calcularImpuestos();
				
				if(Float.parseFloat(PanelEntradas.this.tfColegiatura.getText()) < PanelEntradas.this.calcular.colegiaturaTotal) {
					PanelEntradas.this.calcular.colegiaturaTotal = Float.parseFloat(PanelEntradas.this.tfColegiatura.getText());
				}
				
				PanelEntradas.this.pR1.iSueldoAnual = PanelEntradas.this.calcular.sueldoAnual;
				PanelEntradas.this.pR1.iAguinaldoExc = PanelEntradas.this.calcular.aguinaldoExcento;
				PanelEntradas.this.pR1.iAguinaldoGrav = PanelEntradas.this.calcular.aguinaldoGravado;
				PanelEntradas.this.pR1.iPVExcenta = PanelEntradas.this.calcular.primaVacacionalE;
				PanelEntradas.this.pR1.iPVGravada = PanelEntradas.this.calcular.primaVacacionalG;
				PanelEntradas.this.pR1.iIngresosGrav = PanelEntradas.this.calcular.totalIngresosG;
				PanelEntradas.this.pR1.iMaxColegiatura = PanelEntradas.this.calcular.MaxDedCol;
				PanelEntradas.this.pR1.iTotalDeducciones = PanelEntradas.this.calcular.totalDeducciones;
				PanelEntradas.this.pR1.iDeduccionPerm = PanelEntradas.this.calcular.deduccionPermitida;
				
				PanelEntradas.this.pR1.iMontoISR = PanelEntradas.this.calcular.montoISR;
				PanelEntradas.this.pR1.iCuotaFija = PanelEntradas.this.calcular.cuotaFija;
				PanelEntradas.this.pR1.iPorcentajeExc = PanelEntradas.this.calcular.porcentajeExcedente;
				PanelEntradas.this.pR1.iPagoExc = PanelEntradas.this.calcular.pagoExcedente;
				PanelEntradas.this.pR1.iTotal = PanelEntradas.this.calcular.pagoTotal;
				PanelEntradas.this.pR1.repaint();
			}
			
		});
		
		this.add(new JLabel("                                     Nombre:       "));
		this.add(this.tfNombre);
		this.add(new JLabel("                                            RFC:       "));
		this.add(this.tfRFC);
		this.add(new JLabel("                  Sueldo Mensual $:       "));
		this.add(this.tfSueldoMensual);
		this.add(new JLabel("            Aguinaldo Recibido $:        "));
		this.add(this.tfAguinaldo);
		this.add(new JLabel("               Prima Vacacional $:        "));
		this.add(this.tfPrimaVaca);
		this.add(new JLabel("D Medicos y Hospitalarios $:       "));
		this.add(this.tfDMedicos);
		this.add(new JLabel("          D Gastos Funerarios $:       "));
		this.add(this.tfDGastos);
		this.add(new JLabel("                                     SGMM $:       "));
		this.add(this.tfSGMM);
		this.add(new JLabel("                        Hipotecarios $:       "));
		this.add(this.tfHipotecarios);
		this.add(new JLabel("                              Donativos $:       "));
		this.add(this.tfDonativos);
		this.add(new JLabel("                Aportación Retiro $:       "));
		this.add(this.tfRetiro);
		this.add(new JLabel("            Transporte Escolar $:       "));
		this.add(this.tfTransEscolar);
		this.add(new JLabel("                     Nivel Educativo:         "));
		this.add(this.tfEducativo);
		this.add(new JLabel("                Colegiatura Total $:        "));
		this.add(this.tfColegiatura);
		
		
		/// Espacio del botón
		
		this.add(new JLabel("                                                                                                                                                     "));
		
		this.add(btCalcular);
		this.add(btGuardarR);
	}

	public void visible(boolean a) {
		this.setVisible(a);
	}

}
