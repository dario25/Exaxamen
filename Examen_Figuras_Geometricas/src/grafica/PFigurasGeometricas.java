package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;

import logica.*;



import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;

public class PFigurasGeometricas extends JFrame {

	private JPanel contentPane;
	private JTextField txtFLargo;
	private JTextField txtFAncho;
	private JTextField txtFRadio;
	private JTextField txtFAltura;
	
	ButtonGroup grupoDeBotones = new ButtonGroup();
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PFigurasGeometricas frame = new PFigurasGeometricas();
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
	public PFigurasGeometricas() {
		setTitle("Figuras geometricas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 481, 384);
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelTipoFigura = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panelTipoFigura.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panelTipoFigura.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tipo de figura", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelTipoFigura.setBounds(47, 25, 122, 108);
		contentPane.add(panelTipoFigura);
		
		JRadioButton rdbtnRectangulo = new JRadioButton("Rectangulo");
		rdbtnRectangulo.setHorizontalAlignment(SwingConstants.LEFT);
		panelTipoFigura.add(rdbtnRectangulo);
		grupoDeBotones.add(rdbtnRectangulo);
		
		JRadioButton rdbtnCircunferencia = new JRadioButton("Circunferencia");
		rdbtnCircunferencia.setHorizontalAlignment(SwingConstants.LEFT);
		panelTipoFigura.add(rdbtnCircunferencia);
		grupoDeBotones.add(rdbtnCircunferencia);
		
		JRadioButton rdbtnTriangulo = new JRadioButton("Triangulo");
		rdbtnTriangulo.setHorizontalAlignment(SwingConstants.LEFT);
		panelTipoFigura.add(rdbtnTriangulo);
		grupoDeBotones.add(rdbtnTriangulo);
		
		JPanel panelDatosFigura = new JPanel();
		panelDatosFigura.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Datos de la Figura", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelDatosFigura.setBounds(10, 144, 187, 145);
		contentPane.add(panelDatosFigura);
		panelDatosFigura.setLayout(null);
		
		JLabel lblLargo = new JLabel("Largo");
		lblLargo.setBounds(32, 24, 48, 14);
		panelDatosFigura.add(lblLargo);
		
		txtFLargo = new JTextField();
		txtFLargo.setBounds(69, 24, 86, 20);
		panelDatosFigura.add(txtFLargo);
		txtFLargo.setColumns(10);
		
		JLabel lblAncho = new JLabel("Ancho");
		lblAncho.setBounds(29, 49, 51, 14);
		panelDatosFigura.add(lblAncho);
		
		txtFAncho = new JTextField();
		txtFAncho.setBounds(69, 49, 86, 20);
		panelDatosFigura.add(txtFAncho);
		txtFAncho.setColumns(10);
		
		JLabel lblRadio = new JLabel("Radio");
		lblRadio.setBounds(32, 74, 48, 14);
		lblRadio.setHorizontalAlignment(SwingConstants.LEFT);
		panelDatosFigura.add(lblRadio);
		
		txtFRadio = new JTextField();
		txtFRadio.setBounds(69, 74, 86, 20);
		panelDatosFigura.add(txtFRadio);
		txtFRadio.setColumns(10);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setBounds(32, 99, 48, 14);
		panelDatosFigura.add(lblAltura);
		
		txtFAltura = new JTextField();
		txtFAltura.setBounds(70, 99, 86, 20);
		panelDatosFigura.add(txtFAltura);
		txtFAltura.setColumns(10);
		
		JButton btnCalcularArea = new JButton("Calcular Area");
		btnCalcularArea.setBounds(222, 49, 112, 72);
		contentPane.add(btnCalcularArea);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(237, 154, 86, 58);
		contentPane.add(btnSalir);
		
		JButton btnLimpiar = new JButton("Ingresarnuevocalculo");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtFLargo.setText(null);
				
				txtFAncho.setText(null);
                  txtFAltura.setText(null);
  				txtFRadio.setText(null);

			}
		});
		btnLimpiar.setBounds(222, 237, 89, 23);
		contentPane.add(btnLimpiar);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//agregar
				System.exit(0);
				
			}
		});
		
		
		/* GRUPO DE SENTENCIAS PARA EVALUAR QUE BOTON SE SELECCIONO
		 * Y HACER EDITABLES O NO LOS CAMPOS DE INGRESO DE NUMEROS. 
		 */

		// RECTANGULO
		
		rdbtnRectangulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtFLargo.setEditable(true);
				txtFAncho.setEditable(true);
				txtFRadio.setEditable(false);
				txtFAltura.setEditable(false);
			}
		});

		// CIRCUNFERENCIA
		
		rdbtnCircunferencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtFLargo.setEditable(false);
				txtFAncho.setEditable(false);
				txtFRadio.setEditable(true);
				txtFAltura.setEditable(false);
			}
		});

		// TRIANGULO
		
		rdbtnTriangulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtFLargo.setEditable(false);
				txtFAncho.setEditable(true);
				txtFRadio.setEditable(false);
				txtFAltura.setEditable(true);
			}
		});
		
		
		// Cuando se hace CLICK en el boton Calcular Area:
		
			btnCalcularArea.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// Antes de calcular, pregunta cual de todos los botones se ha seleccionado.
					
					// Pregunta si esta seleccionado el boton Rectangulo entonces calcula su area.
				
					
				
					
					if (rdbtnRectangulo.isSelected()) {
						
						txtFRadio.setText(null);
						txtFAltura.setText(null);
						
						Rectangulo rec = new Rectangulo();
						
						double largo = Double.parseDouble(txtFLargo.getText());
						double ancho = Double.parseDouble(txtFAncho.getText());
					
							 
						rec.setLargo(largo);
						rec.setAncho(ancho);
						
						JOptionPane.showMessageDialog(null, "El area del rectangulo es: " + rec.CalcularArea());
					}  
					
					// Sino, pregunta si esta seleccionado el boton Circunferencia entonces calcula su area.
					else if (rdbtnCircunferencia.isSelected()) {
						Circunferencia circ = new Circunferencia();
						
						double radio = Double.parseDouble(txtFRadio.getText());
						
						circ.setRadio(radio);
						
						JOptionPane.showMessageDialog(null, "El area de la Circunferencia es: " + circ.CalcularArea());
					}
					
					// Sino, pregunta si esta seleccionado el boton Triangulo entonces calcula su area.
					else if (rdbtnTriangulo.isSelected()) {
						Triangulo tri = new Triangulo();
						
						double altura = Double.parseDouble(txtFAltura.getText());
						double ancho = Double.parseDouble(txtFAncho.getText());
						
						tri.setAltura(altura);
						tri.setAncho(ancho);
						
						JOptionPane.showMessageDialog(null, "El area del Triangulo es: " + tri.CalcularArea());
					}
				}
			});
	}
}