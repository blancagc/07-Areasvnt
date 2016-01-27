/**
 * 
 * @author Blanca
 *
 */
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 * 
 * Clase en la cual se crean cada uno de los objetos que estaran en la ventana
 *
 */
public class Cuadrado extends JFrame implements ActionListener{
	private JTextField txtN1= new JTextField();
		
	private JLabel lbN1= new JLabel("Ingresa el tamaño:");
	
	private JLabel lbOperacion= new JLabel("Resultado:");
	
	private JButton btnCalcular= new JButton("Calcular");
	private JButton btnRegresar= new JButton("Regresar");
	
	private Container c= getContentPane();
	
	private Areas op = new Areas();
	/**
	 * se crea la ventana
	 */
	public Cuadrado(){
		super.setTitle("Área del cuadrado");
		super.setSize(320, 280);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cargarControles();
	}
	/**
	 * Se le asigna una posicion y tamaña a los objetos
	 */
	private void cargarControles() {
		c.setLayout(null);
		lbN1.setBounds(10,10, 280, 30);
		txtN1.setBounds(10, 40, 280, 30);
		
		btnCalcular.setBounds(10, 100, 180, 30);
		
		lbOperacion.setBounds(10,150, 280,30);
		
		btnRegresar.setBounds(200, 190, 90, 30);
		
		c.add(lbN1);
		c.add(txtN1);
		c.add(btnCalcular);
		c.add(lbOperacion);
		c.add(btnRegresar);
		btnCalcular.addActionListener(this);
		btnRegresar.addActionListener(this);
		

	}

	@Override
	/**
	 * Es utilizado para las acciones de los botones
	 */
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object btn = e.getSource();
		if(btn==btnCalcular){
		int r = op.cuadrado(Integer.parseInt(txtN1.getText()));
		lbOperacion.setText(String.format("Área = %d", r));	
		}
		if(btn==btnRegresar){
			Menu vtn= new Menu();
			vtn.setVisible(true);
			this.setVisible(false);
			
			}
	}
	
	
}
