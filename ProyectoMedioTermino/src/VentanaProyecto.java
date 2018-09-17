import java.awt.BorderLayout;
import javax.swing.JFrame;


public class VentanaProyecto extends JFrame{
	private PanelEntradas pe;
	private PanelArchivos pa;
	private PanelResultados pr;
	
	public VentanaProyecto(){
		super("Proyecto MT");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pa = new PanelArchivos();
		this.pr = new PanelResultados();
		this.pe = new PanelEntradas(pr);
		this.add(pe,BorderLayout.WEST);
		this.add(pa,BorderLayout.EAST);
		this.pa.setVisible(false);
		this.add(pr, BorderLayout.CENTER);
		this.add(new PanelSalidas(pe,pa),BorderLayout.NORTH);
		this.pack();
		this.setResizable(false);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		VentanaProyecto ventana1=new VentanaProyecto();
	}

}
