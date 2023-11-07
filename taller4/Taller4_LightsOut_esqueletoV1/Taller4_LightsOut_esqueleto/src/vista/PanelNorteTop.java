package vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelNorteTop extends JPanel{

	private JLabel lbltitulo;
	
	
	public PanelNorteTop() {
		// TODO Auto-generated constructor stub
		setLayout(new GridLayout(1,3));
		setBackground(Color.BLUE);
		add(new JLabel(" "));
		lbltitulo = new JLabel("#   Nombre");
		lbltitulo.setForeground(Color.WHITE);
		add(lbltitulo);
		add(new JLabel(" "));
	}

}