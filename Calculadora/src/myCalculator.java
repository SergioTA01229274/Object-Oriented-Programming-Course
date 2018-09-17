import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class myCalculator extends JFrame {
	
	public JTextField tfResult;
	public float num1, num2;
	
	public myCalculator() {
		super("Calculadora Binaria");
		num1 = 0;
		num2 = 0;
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tfResult = new JTextField(10);
		tfResult.setHorizontalAlignment(JTextField.RIGHT);
		tfResult.setEditable(false);
		this.add(tfResult);
		
		panelSignos Beta = new panelSignos(this);
		PanelCalculadora Alpha = new PanelCalculadora(this, Beta);
		
		this.add( new panelDibujo(this, Alpha, Beta), BorderLayout.SOUTH);
		this.pack();
		this.setResizable(false);
		this.setVisible(true);
		
	}
	public void setTfResult(String alpha) {
		this.tfResult.setText(alpha);
	}
	public static void main(String[] args) {
		myCalculator calculadora1 = new myCalculator();
	}
}
