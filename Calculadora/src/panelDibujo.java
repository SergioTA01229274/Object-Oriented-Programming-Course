import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class panelDibujo extends JPanel{
	
	public panelDibujo(myCalculator mC, PanelCalculadora alpha, panelSignos beta) {
		super();
		this.setPreferredSize(new Dimension(300, 150));
		this.add(new PanelCalculadora(mC, beta), BorderLayout.WEST);
		this.add(new panelSignos(mC), BorderLayout.EAST);
	}
}
