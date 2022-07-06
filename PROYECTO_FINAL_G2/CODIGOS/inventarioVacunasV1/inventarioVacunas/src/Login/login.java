package Login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login {

	private JFrame frmRevac;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
		frmRevac.setVisible(true);
		frmRevac.setLocationRelativeTo(null);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRevac = new JFrame();
		frmRevac.setResizable(false);
		frmRevac.setTitle("REVAC");
		frmRevac.setBounds(100, 100, 587, 412);
		frmRevac.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRevac.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(0, 0, 569, 365);
		frmRevac.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblRevac = new JLabel("REVAC");
		lblRevac.setForeground(new Color(0, 0, 255));
		lblRevac.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 44));
		lblRevac.setBounds(211, 13, 158, 82);
		panel.add(lblRevac);
		
		JLabel lblRegistroDeVacunas = new JLabel("Registro de vacunas contra COVID-19 en el Ecuador");
		lblRegistroDeVacunas.setForeground(new Color(240, 248, 255));
		lblRegistroDeVacunas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRegistroDeVacunas.setBounds(47, 96, 470, 25);
		panel.add(lblRegistroDeVacunas);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUsuario.setBounds(111, 165, 67, 25);
		panel.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblContrasea.setBounds(111, 214, 85, 20);
		panel.add(lblContrasea);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usuario = textField.getText();
		        String paswd = passwordField.getText();
		        if(usuario.isEmpty() || paswd.isEmpty()){
		        	JOptionPane.showMessageDialog(null, "Ingrese usuario y contraseña");
		        }else{
		            if(usuario.equals("admin") && paswd.equals("12345")){
		                JOptionPane.showMessageDialog(null, "Bienvenido");
		                Consultas pc = new Consultas();
		                pc.setVisible(true);
		        		frmRevac.setVisible(false);
		            }else{
		                JOptionPane.showMessageDialog(null, "Usuario o contraseña invalido");
		            }
		        }
			}
		});
		textField.setBounds(211, 167, 260, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					String usuario = textField.getText();
			        String paswd = passwordField.getText();
			        if(usuario.isEmpty() || paswd.isEmpty()){
			        	JOptionPane.showMessageDialog(null, "Ingrese usuario y contraseña");
			        }else{
			            if(usuario.equals("admin") && paswd.equals("12345")){
			                JOptionPane.showMessageDialog(null, "Bienvenido");
			                Consultas pc = new Consultas();
			                pc.setVisible(true);
			                pc.setLocationRelativeTo(null);
			        		frmRevac.setVisible(false);
			            }else{
			                JOptionPane.showMessageDialog(null, "Usuario o contraseña invalido");
			            }
			        }
			}
		});
		passwordField.setBounds(208, 214, 263, 22);
		panel.add(passwordField);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usuario = textField.getText();
		        String paswd = passwordField.getText();
		        
		        if(usuario.isEmpty() || paswd.isEmpty()){
		        	JOptionPane.showMessageDialog(null, "Ingrese usuario y contraseña");
		        }else{
		            if(usuario.equals("admin") && paswd.equals("12345")){
		                JOptionPane.showMessageDialog(null, "Bienvenido");
		                Consultas pc = new Consultas();
		                pc.setVisible(true);
		                pc.setLocationRelativeTo(null);
		            }else{
		                JOptionPane.showMessageDialog(null, "Usuario o contraseña invalido");
		            }
		        }
			}
		});
		btnIngresar.setBounds(141, 281, 97, 25);
		panel.add(btnIngresar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(334, 281, 97, 25);
		panel.add(btnSalir);
		
		JLabel lblEspe = new JLabel("ESPE 2022");
		lblEspe.setBounds(249, 336, 76, 16);
		panel.add(lblEspe);
	}
}
