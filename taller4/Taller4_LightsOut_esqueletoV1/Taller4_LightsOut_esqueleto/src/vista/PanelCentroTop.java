package vista;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelCentroTop extends JPanel {

	private JLabel lbl1;
	private JLabel lbl2;
	private JLabel lbl3;
	private JLabel lbl4;
	private JLabel lbl5;
	private JLabel lbl6;
	private JLabel lbl7;
	private JLabel lbl8;
	private JLabel lbl9;
	private JLabel lbl10;
	
	
	public PanelCentroTop() {
		// TODO Auto-generated constructor stub
		
		setLayout(new GridLayout(10,4));
		
		add(new JLabel(" "));
		add(new JLabel("1"));
		lbl1 = new JLabel("AAA");
		add(lbl1);
		add(new JLabel(" "));
		
		add(new JLabel(" "));
		add(new JLabel("2"));
		lbl2 = new JLabel("AAA");
		add(lbl2);
		add(new JLabel(" "));
		
		add(new JLabel(" "));
		add(new JLabel("3"));
		lbl3 = new JLabel("AAA");
		add(lbl3);
		add(new JLabel(" "));
		
		add(new JLabel(" "));
		add(new JLabel("4"));
		lbl4 = new JLabel("AAA");
		add(lbl4);
		add(new JLabel(" "));
		
		add(new JLabel(" "));
		add(new JLabel("5"));
		lbl5 = new JLabel("AAA");
		add(lbl5);
		add(new JLabel(" "));
		
		add(new JLabel(" "));
		add(new JLabel("6"));
		lbl6 = new JLabel("AAA");
		add(lbl6);
		add(new JLabel(" "));
		
		add(new JLabel(" "));
		add(new JLabel("7"));
		lbl7 = new JLabel("AAA");
		add(lbl7);
		add(new JLabel(" "));
		
		add(new JLabel(" "));
		add(new JLabel("8"));
		lbl8 = new JLabel("AAA");
		add(lbl8);
		add(new JLabel(" "));
		
		add(new JLabel(" "));
		add(new JLabel("9"));
		lbl9 = new JLabel("AAA");
		add(lbl9);
		add(new JLabel(" "));
		
		add(new JLabel(" "));
		add(new JLabel("10"));
		lbl10 = new JLabel("AAA");
		add(lbl10);
		add(new JLabel(" "));
	}

}