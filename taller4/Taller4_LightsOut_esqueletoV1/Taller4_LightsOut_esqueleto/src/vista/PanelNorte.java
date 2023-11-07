package vista;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PanelNorte extends JPanel implements ItemListener {

	
	private JLabel lblTamanio;
	private JComboBox<String> cBoxTamanios;
	private JLabel lblDificultad;
	
	private ButtonGroup grupoDificultad;
	
	private int tamanioTablero =5;
	private int dificultad = 3;
	
	
	
	public PanelNorte()
	{
		
		setLayout(new GridLayout( 1, 8,30,0 ));
		
		add(new JLabel(" "));
		
		lblTamanio= new JLabel( "Tama�o:" );
		lblTamanio.setForeground(Color.WHITE);
        add(lblTamanio);
        
        
        cBoxTamanios = new JComboBox<String>();
        cBoxTamanios.addItem("5x5");
        cBoxTamanios.addItem("7x7");
        cBoxTamanios.addItem("9x9");
        
        cBoxTamanios.addItemListener(this);
        add(cBoxTamanios);
        
        
        JRadioButton rbtnFacil;
    	JRadioButton rbtnMedio;
    	JRadioButton rbtnDificil;
        
        lblDificultad = new JLabel ("Dificultad:");
        lblDificultad.setForeground(Color.WHITE);
        add(lblDificultad);
        
        rbtnFacil = new JRadioButton("F�cil");
        rbtnFacil.setBackground(new Color(48,140,228));
        rbtnFacil.setForeground(Color.WHITE);
        rbtnFacil.setSelected(true);
        
        rbtnMedio = new JRadioButton("Medio");
        rbtnMedio.setBackground(new Color(48,140,228));
        rbtnMedio.setForeground(Color.WHITE);
        
        rbtnDificil = new JRadioButton("Dif�cil");
        rbtnDificil.setBackground(new Color(48,140,228));
        rbtnDificil.setForeground(Color.WHITE);
        
        
        
        grupoDificultad=new ButtonGroup();
        grupoDificultad.add(rbtnFacil);
        grupoDificultad.add(rbtnMedio);
        grupoDificultad.add(rbtnDificil);
        
        add(rbtnFacil);
        add(rbtnMedio);
        add(rbtnDificil);
        
        add(new JLabel(" "));
        
        ItemListener itemListener = new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (rbtnFacil.isSelected()) {
                    dificultad = 3;
                } else if (rbtnMedio.isSelected()) {
                    dificultad = 9;
                } else if (rbtnDificil.isSelected()) {
                    dificultad = 27;
                }
            }
        };
        rbtnFacil.addItemListener(itemListener);
        rbtnMedio.addItemListener(itemListener);
        rbtnDificil.addItemListener(itemListener);
        
        setBackground(new Color(48,140,228));
               	
		
	}
	
	public int darTamanioTablero()
	{
		return tamanioTablero;
	}
	public int darDificultad()
	{
		return dificultad;
	}



	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==cBoxTamanios) {
            String seleccionado=(String)cBoxTamanios.getSelectedItem();
            //seleccionado es el tama o del tablero 5x5, 7x7
            if (seleccionado == "5x5")
            {
            	this.tamanioTablero =5;
            }
            else if (seleccionado == "7x7")
            {
            	this.tamanioTablero =7;
            }
            else if (seleccionado == "9x9")
            {
            	this.tamanioTablero = 9;
            }
        }
	
		
	}
	
	

}