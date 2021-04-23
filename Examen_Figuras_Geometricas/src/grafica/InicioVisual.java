package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InicioVisual extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioVisual frame = new InicioVisual();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InicioVisual() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngresar = new JLabel("Bienvenido al sistema Geometrico");
		lblIngresar.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblIngresar.setBounds(21, 29, 436, 115);
		contentPane.add(lblIngresar);
		
		JButton btnSeleciones = new JButton("Ingresar");
		btnSeleciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			PFigurasGeometricas g     = new PFigurasGeometricas();	
			g.setVisible(true);
			
			
			}
		});
		btnSeleciones.setBounds(149, 155, 89, 65);
		contentPane.add(btnSeleciones);
	}
}
