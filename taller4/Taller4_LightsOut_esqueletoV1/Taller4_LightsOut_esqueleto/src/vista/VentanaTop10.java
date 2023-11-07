package vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class VentanaTop10 extends JFrame {

	private PanelNorteTop pNorteTop;
	private PanelCentroTop pCentroTop;
	
	public VentanaTop10() {
		// TODO Auto-generated constructor stub
		setSize( 300, 500 );
        setTitle( "Top 10" );
        setDefaultCloseOperation( DISPOSE_ON_CLOSE );
        setLocationRelativeTo( null );
        
        setLayout( new BorderLayout( ) );
        
        pNorteTop = new PanelNorteTop();
        pCentroTop = new PanelCentroTop();
        add(pCentroTop, BorderLayout.CENTER);
        add(pNorteTop, BorderLayout.NORTH);
        
	}

}