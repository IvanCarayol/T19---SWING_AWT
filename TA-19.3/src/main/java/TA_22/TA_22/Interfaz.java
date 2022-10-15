package TA_22.TA_22;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interfaz extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
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
	int opcion = 8;
	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 483, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Instanciar tabla");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// pedimos confirmacion
				int showMessageDialog = JOptionPane.showConfirmDialog(null, "Quieres borrar la tabla y crearla de nuevo?", "Aviso", JOptionPane.YES_NO_OPTION); 
                if (showMessageDialog == 0) { 
                	opcion = 1;
                } else {
                }
			}
		});
		btnNewButton.setBounds(151, 40, 163, 34);
		contentPane.add(btnNewButton);
		
		JButton btnInsertarPaqueteDatos = new JButton("Insertar paquete datos");
		btnInsertarPaqueteDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opcion = 2;
			}
		});
		btnInsertarPaqueteDatos.setBounds(151, 94, 163, 34);
		contentPane.add(btnInsertarPaqueteDatos);
		
		JButton btnBorrarTabla = new JButton("Borrar tabla");
		btnBorrarTabla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opcion = 3;
			}
		});
		btnBorrarTabla.setBounds(151, 157, 163, 34);
		contentPane.add(btnBorrarTabla);
		
		JButton btnCrud = new JButton("CRUD");
		btnCrud.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opcion = 4;
			}
		});
		btnCrud.setBounds(151, 220, 163, 34);
		contentPane.add(btnCrud);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(294, 321, 163, 34);
		contentPane.add(btnSalir);
		
	}
	
	public int opcion() {

		return opcion;

	}
	
	public void msg(String msg) {
		JOptionPane.showMessageDialog(null, msg);
		opcion = 8;
	}

	
}
