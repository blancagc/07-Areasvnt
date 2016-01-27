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
import javax.swing.JTextField;
/**
 * 
 *Clase donde se crean los objetos para usar en la ventana
 *
 */
public class Escaleno extends JFrame implements ActionListener{

	private JTextField txtN1= new JTextField();
	private JTextField txtN2= new JTextField();
	private JTextField txtN3= new JTextField();
	
	private JLabel lbN1= new JLabel("Ingresa el valor del primer lado:");
	private JLabel lbN2= new JLabel("Ingresa el valor del segundo lado:");
	private JLabel lbN3= new JLabel("Ingresa el valor del tercer lado:");
	
	private JLabel lbOperacion= new JLabel("Resultado:");
	
	private JButton btnCalcular= new JButton("Calcular");
	private JButton btnRegresar= new JButton("Regresar");
	
	private Container c= getContentPane();
	
	private Areas op = new Areas();
	
	public Escaleno(){
		super.setTitle("Área del triangulo escaleno");
		super.setSize(320, 380);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cargarControles();
	}

	private void cargarControles() {
		// TODO Auto-generated method stub
		c.setLayout(null);
		lbN1.setBounds(10,10, 280, 30);
		txtN1.setBounds(10, 40, 280, 30);
		
		lbN2.setBounds(10,80, 280, 30);
		txtN2.setBounds(10, 120, 280, 30);
		
		lbN3.setBounds(10, 160, 280, 30);
		txtN3.setBounds(10, 200,280,30);
		
		btnCalcular.setBounds(10, 250, 180, 30);
		
		lbOperacion.setBounds(10,280, 280,30);
		
		btnRegresar.setBounds(200, 290, 90, 30);
		
		c.add(lbN1);
		c.add(txtN1);
		c.add(lbN2);
		c.add(txtN2);
		c.add(lbN3);
		c.add(txtN3);
		c.add(btnCalcular);
		c.add(lbOperacion);
		c.add(btnRegresar);
		btnCalcular.addActionListener(this);
		btnRegresar.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object btn = e.getSource();
		if(btn==btnCalcular){
		float r = op.trianguloEs(Float.parseFloat(txtN1.getText())
				,Float.parseFloat(txtN2.getText())
				,Float.parseFloat(txtN3.getText()));
		lbOperacion.setText(String.format("Área = %f", r));
		}
		if(btn==btnRegresar){
			MenuTriangulos vtn= new MenuTriangulos();
			vtn.setVisible(true);
			this.setVisible(false);
			
			}
	}
	
}
