import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelSalidas extends JPanel implements ActionListener{
	private PanelEntradas pe;
	private PanelArchivos pa;
	private JButton btManual, btArchivo;
	
	public PanelSalidas(PanelEntradas pe, PanelArchivos pa) {
		super();
		this.pa=pa;
		this.pe=pe;
		this.setBackground(new Color(255, 255, 255));
		this.setPreferredSize(new Dimension(600,70));
		this.btArchivo=new JButton("Archivo");
		this.btArchivo.setBackground(new Color(0, 153, 255));
		this.btArchivo.setFont(new Font("Arial", Font.PLAIN, 40));
		this.btArchivo.addActionListener(this);
		this.btManual=new JButton("Manual");
		this.btManual.setBackground(new Color(0, 153, 255));
		this.btManual.setFont(new Font("Arial", Font.PLAIN, 40));
		this.btManual.addActionListener(this);
		
		this.add(btManual);
		this.add(btArchivo);
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==this.btArchivo) {
			this.pe.visible(false);
			this.pa.visible(true);
		} else if(e.getSource()==this.btManual) {
			this.pe.visible(true);
			this.pa.visible(false);
		}
		
	}


}