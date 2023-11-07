package vista;

import java.awt.BorderLayout;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import uniandes.dpoo.taller4.modelo.RegistroTop10;
import uniandes.dpoo.taller4.modelo.Tablero;
import uniandes.dpoo.taller4.modelo.Top10;

public class VentanaPrincipal extends JFrame{

	
	private Tablero tablero;
	private Top10 top10;
	private VentanaTop10 vTop;
	
	private PanelNorte pNorte;
	private PanelSur pSur;
	
	private PanelEste pEste;
	
	private PanelCentro pCentro;
	
	
	
	public VentanaPrincipal()
	{
		
		this.top10=new Top10();
		
		setSize( 800, 720 );
        setTitle( "Lights Out" );
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setLocationRelativeTo( null );
        
        setLayout( new BorderLayout( ) );
        
        pNorte = new PanelNorte( );
        add(pNorte, BorderLayout.NORTH);
        
        //nuevo juego
        this.tablero=new Tablero(5);
        
        
        pSur = new PanelSur();
        add(pSur, BorderLayout.SOUTH);
        
        pEste = new PanelEste(this);
        add(pEste, BorderLayout.EAST);
        
        pCentro = new PanelCentro(tablero);
        add(pCentro,BorderLayout.CENTER);
        
		
		
		
	}
	
	public void iniciarJuego()
	{
		int tamanio = pNorte.darTamanioTablero();
//		System.out.println(pNorte.darTamanioTablero());
		this.tablero=new Tablero(tamanio);
        this.tablero.desordenar(pNorte.darDificultad());
        
        
        this.pCentro.actualizarTablero(this.tablero);
	}
	
	

	public void reiniciarJuego() {
		// TODO Auto-generated method stub
        this.tablero.reiniciar();
        
        
        this.pCentro.actualizarTablero(this.tablero);
	}

	public void darTop10() {
		// TODO Auto-generated method stub
		vTop = new VentanaTop10();
		vTop.setVisible(true);
	}

	public void cambiarJugador() {
		// TODO Auto-generated method stub
		try {
			String nombreJugador = JOptionPane.showInputDialog(this, "Ingrese nombre de jugador");
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(pCentro, "Se canceló el cambio de jugador", "Acción abortada", ERROR);;
		}
	}
	
	public PanelSur getPanelSur() {
		return this.pSur;
	}
	
	public static void main(String[] args) 
	{
		VentanaPrincipal ventana = new VentanaPrincipal();
		ventana.pCentro.setVentanaprincipal(ventana);
		ventana.setResizable( false );
		ventana.setVisible( true );
		
		
	}

	
}