package TA_22.TA_22;

import java.awt.EventQueue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import TA_22.TA_22.Interfaz;

public class InterfazCRUD extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazCRUD frame = new InterfazCRUD();
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
	int opcion = 0;
	String[] informacion = new String[3];
	int idPieza;
	public InterfazCRUD() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("Añadir registro");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				informacion[0] = JOptionPane.showInputDialog("Inserte CodigoPieza. Ej: 4");

				informacion[1] = JOptionPane.showInputDialog("Inserte idProveedor. Ej: 0011");

				informacion[2] = JOptionPane.showInputDialog("Inserte Precio. Ej: 1");

				opcion = 1;
			}
		});
		btnNewButton.setBounds(151, 22, 163, 34);
		contentPane.add(btnNewButton);

		JButton btnInsertarPaqueteDatos = new JButton("Consultar por ID");
		btnInsertarPaqueteDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				idPieza = Integer.parseInt(JOptionPane.showInputDialog("Inserte CodigoPieza."));

				opcion = 2;

			}
		});
		btnInsertarPaqueteDatos.setBounds(151, 67, 163, 34);
		contentPane.add(btnInsertarPaqueteDatos);

		JButton btnBorrarTabla = new JButton("Listar registros");
		btnBorrarTabla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opcion = 3;
			}
		});
		btnBorrarTabla.setBounds(151, 112, 163, 34);
		contentPane.add(btnBorrarTabla);

		JButton btnCrud = new JButton("Modificar registro");
		btnCrud.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				informacion[0] = JOptionPane.showInputDialog("Inserte CodigoPieza que quieras editar.");

				informacion[1] = JOptionPane.showInputDialog("Inserte nuevo idProveedor. Ej: 0011");

				informacion[2] = JOptionPane.showInputDialog("Inserte nuevo Precio. Ej: 1");

				opcion = 4;
			}
		});
		btnCrud.setBounds(151, 157, 163, 34);
		contentPane.add(btnCrud);

		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});
		btnSalir.setBounds(294, 321, 163, 34);
		contentPane.add(btnSalir);

		JButton btnCrud_1 = new JButton("Borrar registro");
		btnCrud_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				idPieza = Integer.parseInt(JOptionPane.showInputDialog("Inserte CodigoPieza."));

				opcion = 5;
			}
		});
		btnCrud_1.setBounds(151, 202, 163, 34);
		contentPane.add(btnCrud_1);
	}

	public String[] informacion() {

		return informacion;

	}

	public int idPieza() {

		return idPieza;

	}

	public int opcion2() {

		return opcion;

	}

	public void imprimirArray(Object[][] informacion) {

		String respuesta = "idPieza  idProveedor  Precio";

		for (int i = 0; i < informacion.length; i++) {

			respuesta += "--------------------\n";

			for (int j = 0; j < informacion[i].length; j++) {
				respuesta +=informacion[i][j] +"                    ";
			}
			respuesta +="\n";
		}

		JOptionPane.showMessageDialog(null, respuesta);

		opcion = 0;

	}

	public void msg(String msg) {

		JOptionPane.showMessageDialog(null, msg);

		opcion = 0;

	}
}
