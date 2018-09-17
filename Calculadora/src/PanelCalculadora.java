import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelCalculadora extends JPanel implements ActionListener{
	
	private JButton b0, b1, b2, b3, b4, b5,
					b6, b7, b8, b9, bPoint;
	
	private myCalculator mC1;
	private panelSignos pS2;
	
	public PanelCalculadora(myCalculator M, panelSignos P) {
		super();
		this.setPreferredSize(new Dimension(170, 150));
		
		this.mC1 = M;
		this.pS2 = P;
		
		b0 = new JButton("0");
		b0.addActionListener(this);
		
		b1 = new JButton("1");
		b1.addActionListener(this);
		b2 = new JButton("2");
		b2.addActionListener(this);
		b3 = new JButton("3");
		b3.addActionListener(this);
		b4 = new JButton("4");
		b4.addActionListener(this);
		b5 = new JButton("5");
		b5.addActionListener(this);
		b6 = new JButton("6");
		b6.addActionListener(this);
		b7 = new JButton("7");
		b7.addActionListener(this);
		b8 = new JButton("8");
		b8.addActionListener(this);
		b9 = new JButton("9");
		b9.addActionListener(this);
		bPoint = new JButton(".");
		bPoint.addActionListener(this);
		this.add(b7);
		this.add(b8);
		this.add(b9);
		this.add(b4);
		this.add(b5);
		this.add(b6);
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b0);
		this.add(bPoint);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(this.mC1.tfResult.getText().length() == 0) {
			if(e.getSource() == this.b0) {
				mC1.setTfResult("0");
			}else if(e.getSource() == this.b1) {
				mC1.setTfResult("1");
			}else if(e.getSource() == this.b2) {
				mC1.setTfResult("2");
			}else if(e.getSource() == this.b3) {
				mC1.setTfResult("3");
			}else if(e.getSource() == this.b4) {
				mC1.setTfResult("4");
			}else if(e.getSource() == this.b5) {
				mC1.setTfResult("5");
			}else if(e.getSource() == this.b6) {
				mC1.setTfResult("6");
			}else if(e.getSource() == this.b7) {
				mC1.setTfResult("7");
			}else if(e.getSource() == this.b8) {
				mC1.setTfResult("8");
			}else if(e.getSource() == this.b9) {
				mC1.setTfResult("9");
			}else if(e.getSource() == this.bPoint) {
				mC1.setTfResult(".");
			}
		}else {
			if(e.getSource() == this.b0) {
				mC1.setTfResult(mC1.tfResult.getText() + "0");
			}else if(e.getSource() == this.b1) {
				mC1.setTfResult(mC1.tfResult.getText() + "1");
			}else if(e.getSource() == this.b2) {
				mC1.setTfResult(mC1.tfResult.getText() + "2");
			}else if(e.getSource() == this.b3) {
				mC1.setTfResult(mC1.tfResult.getText() + "3");
			}else if(e.getSource() == this.b4) {
				mC1.setTfResult(mC1.tfResult.getText() + "4");
			}else if(e.getSource() == this.b5) {
				mC1.setTfResult(mC1.tfResult.getText() + "5");
			}else if(e.getSource() == this.b6) {
				mC1.setTfResult(mC1.tfResult.getText() + "6");
			}else if(e.getSource() == this.b7) {
				mC1.setTfResult(mC1.tfResult.getText() + "7");
			}else if(e.getSource() == this.b8) {
				mC1.setTfResult(mC1.tfResult.getText() + "8");
			}else if(e.getSource() == this.b9) {
				mC1.setTfResult(mC1.tfResult.getText() + "9");
			}else if(e.getSource() == this.bPoint) {
				mC1.setTfResult(mC1.tfResult.getText() + ".");
			}
		}
	}
	
}
