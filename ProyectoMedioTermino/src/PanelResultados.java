import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelResultados extends JPanel{
	public String strNombre, strRFC, strEducacion;
	public float iSueldoMensual, iSueldoAnual, iAguinaldo, iAguinaldoExc, iAguinaldoGrav, 
	iPrimaVaca, iPVExcenta, iPVGravada, iIngresosGrav, iDMedicos, iDGastos, iSGMM, iHipotecarios, iDonativos, iRetiro, 
	iTransEscolar, iColegiatura, iMaxColegiatura, iTotalDeducciones, iDeduccionPerm, iMontoISR,
	iCuotaFija, iPorcentajeExc, iPagoExc, iTotal; 
	
	public PanelResultados() {
		super();
		this.strNombre = this.strRFC = this.strEducacion= "None";
		this.iSueldoMensual = this.iSueldoAnual = this.iAguinaldo = this.iAguinaldoExc = 
				this.iAguinaldoGrav = this.iPrimaVaca = this.iPVExcenta = this.iPVGravada = 
				this.iIngresosGrav = this.iDMedicos = this.iDGastos = this.iSGMM = 
				this.iHipotecarios = this.iDonativos = this.iRetiro = this.iTransEscolar = 
				this.iColegiatura = this.iMaxColegiatura = this.iTotalDeducciones = 
				this.iDeduccionPerm = this.iMontoISR = this.iCuotaFija = this.iPorcentajeExc = 
				this.iPagoExc = this.iTotal = 0;
		this.setPreferredSize(new Dimension(800, 500));
		this.setBackground(new Color(255, 255, 255));
	}
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Font f = new Font("Arial", Font.PLAIN, 18);
		g.setColor(new Color(255, 255, 255));
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		g.setColor(Color.BLACK);
		g.drawRect(30, 70, 150, 30);
		g.drawRect(225, 70, 180, 30);
		g.drawRect(420, 70, 150, 30);
		g.drawRect(615, 70, 150, 30);
		
		g.drawRect(30, 130, 150, 30);
		g.drawRect(225, 130, 150, 30);
		g.drawRect(420, 130, 150, 30);
		g.drawRect(615, 130, 150, 30);
		
		g.drawRect(30, 190, 150, 30);
		g.drawRect(225, 190, 150, 30);
		g.drawRect(420, 190, 150, 30);
		g.drawRect(615, 190, 150, 30);
		
		g.drawRect(30, 250, 150, 30);
		g.drawRect(225, 250, 150, 30);
		g.drawRect(420, 250, 150, 30);
		g.drawRect(615, 250, 150, 30);
		
		g.drawRect(30, 310, 150, 30);
		g.drawRect(225, 310, 150, 30);
		g.drawRect(420, 310, 150, 30);
		g.drawRect(615, 310, 150, 30);
		
		g.drawRect(30, 370, 150, 30);
		g.drawRect(225, 370, 150, 30);
		g.drawRect(420, 370, 150, 30);
		g.drawRect(615, 370, 150, 30);
		
		g.drawRect(30, 430, 150, 30);
		g.drawRect(225, 430, 150, 30);
		g.drawRect(420, 430, 150, 30);
		g.drawRect(615, 430, 150, 30);
		
		g.setFont(f);
		g.drawString("Nombre", 70, 50);
		g.drawString("RFC", 280, 50);
		g.drawString("Sueldo mensual", 430, 50);
		g.drawString("Sueldo anual", 630, 50);
		g.drawString("Aguinaldo", 70, 122);
		g.drawString("Aguinaldo excento", 230, 122);
		g.drawString("Aguinaldo gravado", 420, 122);
		g.drawString("Prima vacacional", 620, 122);
		g.drawString("P. V. Excenta", 50, 185);
		g.drawString("P. V. gravada", 250, 185);
		g.drawString("Ingresos gravados", 420, 185);
		g.drawString("D. Med. y Hosp.", 620, 185);
		g.drawString("Gastos funerarios", 40, 245);
		g.drawString("SGMM", 270, 245);
		g.drawString("Hipotecarios", 450, 245);
		g.drawString("Donativos", 650, 245);
		g.drawString("Aportacion retiro", 45, 305);
		g.drawString("Transporte escolar", 225, 305);
		g.drawString("Nivel educativo", 435, 305);
		g.drawString("Colegiatura total", 620, 305);
		g.drawString("Max. a deducir colegitura", 8, 365);
		g.drawString("Total deducciones", 230, 365);
		g.drawString("Deduccion permitida", 415, 365);
		g.drawString("Monto ISR", 650, 365);
		g.drawString("Cuota fija", 70, 425);
		g.drawString("Procentaje excedente", 215, 425);
		g.drawString("Pago excedente", 430, 425);
		g.setColor(Color.RED);
		g.drawString("Total a pagar", 635, 425);
		
		g.setColor(Color.BLACK);
		g.drawString(this.strNombre, 35, 92);
		g.drawString(this.strRFC, 230, 92);
		g.drawString("$ "+this.iSueldoMensual, 425, 92);
		g.drawString("$ "+this.iSueldoAnual, 620, 92);
		g.drawString("$ "+this.iAguinaldo, 35, 152);
		g.drawString("$ "+this.iAguinaldoExc, 230, 152);
		g.drawString("$ "+this.iAguinaldoGrav, 425, 152);
		g.drawString("$ "+this.iPrimaVaca, 620, 152);
		g.drawString("$ "+this.iPVExcenta, 35, 213);
		g.drawString("$ "+this.iPVGravada, 230, 213);
		g.drawString("$ "+this.iIngresosGrav, 425, 213);
		g.drawString("$ "+this.iDMedicos, 620, 213);
		g.drawString("$ "+this.iDGastos, 35, 272);
		g.drawString("$ "+this.iSGMM, 230, 272);
		g.drawString("$ "+this.iHipotecarios, 425, 272);
		g.drawString("$ "+this.iDonativos, 620, 272);
		g.drawString("$ "+this.iRetiro, 35, 332);
		g.drawString("$ "+this.iTransEscolar, 230, 332);
		g.drawString(this.strEducacion, 425, 332);
		g.drawString("$"+this.iColegiatura, 620, 332);
		g.drawString("$"+this.iMaxColegiatura, 35, 392);
		g.drawString("$"+this.iTotalDeducciones, 230, 392);
		g.drawString("$"+this.iDeduccionPerm, 425, 392);
		g.drawString("$"+this.iMontoISR, 620, 392);
		g.drawString("$"+this.iCuotaFija, 35, 453);
		g.drawString(this.iPorcentajeExc+"%", 230, 453);
		g.drawString("$"+this.iPagoExc, 425, 453);
		g.setColor(Color.RED);
		g.drawString("$"+this.iTotal, 620, 453);
		

	}
	
}
