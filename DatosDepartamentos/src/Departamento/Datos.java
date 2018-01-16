package Departamento;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Datos {

	private JFrame frame;
	private JTextField txtNombreDepartamento;
	private JTextField txtCdigoDepartamento;
	private JTextField txtLocalidadDepartamento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Datos window = new Datos();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Datos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Insertar Datos");
		btnNewButton.setBounds(51, 187, 129, 23);
		frame.getContentPane().add(btnNewButton);
		
		txtNombreDepartamento = new JTextField();
		txtNombreDepartamento.setBounds(231, 95, 162, 20);
		frame.getContentPane().add(txtNombreDepartamento);
		txtNombreDepartamento.setColumns(10);
		
		txtCdigoDepartamento = new JTextField();
		txtCdigoDepartamento.setBounds(231, 64, 162, 20);
		frame.getContentPane().add(txtCdigoDepartamento);
		txtCdigoDepartamento.setColumns(10);
		
		txtLocalidadDepartamento = new JTextField();
		txtLocalidadDepartamento.setBounds(231, 126, 162, 20);
		frame.getContentPane().add(txtLocalidadDepartamento);
		txtLocalidadDepartamento.setColumns(10);
		
		JLabel lblCdigoDepartamento = new JLabel("C\u00F3digo Departamento");
		lblCdigoDepartamento.setBounds(51, 66, 129, 17);
		frame.getContentPane().add(lblCdigoDepartamento);
		
		JLabel lblNombreDepartamento = new JLabel("Nombre Departamento");
		lblNombreDepartamento.setBounds(51, 97, 129, 17);
		frame.getContentPane().add(lblNombreDepartamento);
		
		JLabel lblLocalidadDepartamento = new JLabel("Localidad Departamento");
		lblLocalidadDepartamento.setBounds(51, 128, 153, 17);
		frame.getContentPane().add(lblLocalidadDepartamento);
		
		JButton btnNewButton_1 = new JButton("Limpiar Datos");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Ha pulsado el botón de limpiar");
				txtCdigoDepartamento.setText("");
				txtNombreDepartamento.setText("");
				txtLocalidadDepartamento.setText("");
				
			}
		});
		
		btnNewButton_1.setBounds(231, 187, 162, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("DATOS DE DEPARTAMENTOS");
		lblNewLabel.setBounds(139, 11, 153, 14);
		frame.getContentPane().add(lblNewLabel);
	
		
	}

}
