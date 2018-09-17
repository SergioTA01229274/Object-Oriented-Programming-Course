import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class panelSignos extends JPanel implements ActionListener{
	private JButton bSum, bDif, bMult, bDiv, bAC, bEq, bExpon;
	private myCalculator mC2;
	public panelSignos(myCalculator M2) {
		super();
		this.setPreferredSize(new Dimension(100, 150));
		this.mC2 = M2;
		
		bSum = new JButton("+");
		bSum.addActionListener(this);
		bDif = new JButton("-");
		bDif.addActionListener(this);
		bMult = new JButton("X");
		bMult.addActionListener(this);
		bDiv = new JButton("/");
		bDiv.addActionListener(this);
		bAC = new JButton("AC");
		bAC.addActionListener(this);
		bEq = new JButton("=");
		bEq.addActionListener(this);
		bExpon = new JButton("^");
		bExpon.addActionListener(this);
		this.add(bAC);
		this.add(bMult);
		this.add(bDiv);
		this.add(bSum);
		this.add(bDif);
		this.add(bExpon);
		this.add(bEq);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(this.mC2.tfResult.getText().length() != 0) {
			if(e.getSource() == this.bSum) {
				try {
					this.mC2.num1 = Float.parseFloat(this.mC2.tfResult.getText());
					this.mC2.setTfResult(mC2.tfResult.getText() + "+");
				} catch (NumberFormatException e2) {
					this.mC2.tfResult.setText("SYNTAX ERROR");;
				}
			}else if(e.getSource() == this.bDif) {
				try {
					this.mC2.num1 = Float.parseFloat(this.mC2.tfResult.getText());
					this.mC2.setTfResult(mC2.tfResult.getText() + "-");
				} catch (NumberFormatException e2) {
					this.mC2.tfResult.setText("SYNTAX ERROR");;
				}
			}else if(e.getSource() == this.bMult) {
				try {
					this.mC2.num1 = Float.parseFloat(this.mC2.tfResult.getText());
					this.mC2.setTfResult(mC2.tfResult.getText() + "X");
				} catch (NumberFormatException e2) {
					this.mC2.tfResult.setText("SYNTAX ERROR");;
				}
			}else if(e.getSource() == this.bDiv) {
				try {
					this.mC2.num1 = Float.parseFloat(this.mC2.tfResult.getText());
					this.mC2.setTfResult(mC2.tfResult.getText() + "/");
				} catch (NumberFormatException e2) {
					this.mC2.tfResult.setText("SYNTAX ERROR");;
				}
			}else if(e.getSource() == this.bExpon) {
				try {
					this.mC2.num1 = Float.parseFloat(this.mC2.tfResult.getText());
					this.mC2.setTfResult(mC2.tfResult.getText() + "^");
				} catch (NumberFormatException e2) {
					this.mC2.tfResult.setText("SYNTAX ERROR");;
				}
			}else if(e.getSource() == this.bAC) {
				this.mC2.tfResult.setText(null);
			}else if(e.getSource() == this.bEq) {
				if(this.mC2.tfResult.getText().contains("+")) {
					this.mC2.num2 = Float.parseFloat(this.mC2.tfResult.getText().substring(this.mC2.tfResult.getText().indexOf('+')));
					this.mC2.tfResult.setText(null);
					float suma = this.mC2.num1 + this.mC2.num2;
					this.mC2.tfResult.setText(suma + "");
				}else if(this.mC2.tfResult.getText().contains("-")) {
					this.mC2.num2 = Float.parseFloat(this.mC2.tfResult.getText().substring(this.mC2.tfResult.getText().indexOf('-', 1)));
					this.mC2.tfResult.setText(null);
					float resta = this.mC2.num1 + this.mC2.num2;
					this.mC2.tfResult.setText(resta + "");
				}else if(this.mC2.tfResult.getText().contains("X")) {
					this.mC2.num2 = Float.parseFloat(this.mC2.tfResult.getText().substring(this.mC2.tfResult.getText().indexOf('X') +1));
					this.mC2.tfResult.setText(null);
					float multiplicacion = this.mC2.num1 * this.mC2.num2;
					this.mC2.tfResult.setText(multiplicacion + "");
				}else if(this.mC2.tfResult.getText().contains("/")) {
					this.mC2.num2 = Float.parseFloat(this.mC2.tfResult.getText().substring(this.mC2.tfResult.getText().indexOf('/') +1));
					this.mC2.tfResult.setText(null);
					float division = this.mC2.num1 / this.mC2.num2;
					this.mC2.tfResult.setText(division + "");
				}else if(this.mC2.tfResult.getText().contains("^")) {
					this.mC2.num2 = Float.parseFloat(this.mC2.tfResult.getText().substring(this.mC2.tfResult.getText().indexOf('^') +1));
					this.mC2.tfResult.setText(null);
					float expon = this.mC2.num1;
					for(int i = 0; i < this.mC2.num2 - 1; i++) {
						expon *= this.mC2.num1;
					}
					this.mC2.tfResult.setText(expon + "");
				}
			}
		}
	}

}
