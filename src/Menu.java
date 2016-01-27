/**
 * 
 * @author Blanca
 *
 */
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Menu extends JFrame implements ActionListener{
	private JLabel lbN1= new JLabel("Elige el la figura que quieras calcular:");
	
	private JButton btnCuadrado= new JButton("Cuadrado");
	private JButton btnRectangulo= new JButton("Rectangulo");
	private JButton btnTriangulo= new JButton("Triangulo");
	private JButton btnCirculo= new JButton("Circulo");
	
	private Container c= getContentPane();
	//se crea la ventana
	public Menu(){
		super.setTitle("Áreas");
		super.setSize(300, 350);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cargarControles();
	}
	/**
	 * Se dimencionan y posicionan los objetos y se agregan a panel
	 */
	private void cargarControles() {
		// TODO Auto-generated method stub
		c.setLayout(null);
		lbN1.setBounds(40,30, 280, 30);
		btnCuadrado.setBounds(10, 100, 250, 30);
		btnRectangulo.setBounds(10, 150, 250, 30);
		btnTriangulo.setBounds(10, 200, 250, 30);
		btnCirculo.setBounds(10,250,250,30);
		
		c.add(lbN1);
		c.add(btnCuadrado);
		c.add(btnRectangulo);
		c.add(btnTriangulo);
		c.add(btnCirculo);
		btnCuadrado.addActionListener(this);
		btnRectangulo.addActionListener(this);
		btnTriangulo.addActionListener(this);
		btnCirculo.addActionListener(this);

	}
	
	@Override
	//metodo del usado para las acciones de los botones
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object btn = e.getSource();
		if(btn==btnCuadrado){
			Cuadrado vtn= new Cuadrado();
			vtn.setVisible(true);
			this.setVisible(false);
		}
		if(btn==btnRectangulo){
			Rectangulo vtn= new Rectangulo();
			vtn.setVisible(true);
			this.setVisible(false);
		}
		if(btn==btnTriangulo){
			MenuTriangulos vtn= new MenuTriangulos();
			vtn.setVisible(true);
			this.setVisible(false);
		}
		if(btn==btnCirculo){
			Circulo vtn= new Circulo();
			vtn.setVisible(true);
			this.setVisible(false);
		}
		
	}
}
