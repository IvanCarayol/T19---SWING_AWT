package TA_22.TA_22;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import TA_22.TA_22.Interfaz;
import TA_22.TA_22.Vista;
import TA_22.TA_22.Modelo;
import TA_22.TA_22.conneccionBD;

public class Controlador {

	public static void opciones(Connection conn) {

		Interfaz interfaz = new Interfaz();
		InterfazCRUD interfazCRUD = new InterfazCRUD();
		//int opcion = TA_22.TA_22.Vista.menuPrincipal();


		int opcion;
		int opcion2;
		boolean todoCorrect;
		String respuesta;
		do {

			interfaz.setVisible(true);
			opcion = interfaz.opcion();

			switch (opcion) {
			case 1:
				// Borramos la tabla sumintra y la creamos otra vez para que este vacio
				todoCorrect = TA_22.TA_22.Modelo.inicializarTabla(conn);

				interfaz.msg(TA_22.TA_22.Modelo.respuestaInstanciarTabla(todoCorrect));

				break;

			case 2:

				todoCorrect = TA_22.TA_22.Modelo.crearContenido(conn);

				respuesta = TA_22.TA_22.Modelo.comprobarContenido(todoCorrect);

				interfaz.msg(respuesta);

				break;

			case 3:

				todoCorrect = TA_22.TA_22.Modelo.borrarTabla(conn);

				interfaz.msg(TA_22.TA_22.Modelo.respuestaBorrarTabla(todoCorrect));

				break;

			case 4:


				do {
					interfazCRUD.setVisible(true);

					opcion2 = interfazCRUD.opcion2();
					
					System.out.println(opcion2);
					
					switch (opcion2) {
					case 1:
						
						String[] informacion = interfazCRUD.informacion();

						todoCorrect = TA_22.TA_22.Modelo.anyadirContenido(informacion, conn);
						
						String repuesta = TA_22.TA_22.Modelo.respuestaRegAdd(todoCorrect);
						
						interfazCRUD.msg(repuesta);

						break;

					case 2:

						int idPieza = interfazCRUD.idPieza();

						Object[][] selectID = TA_22.TA_22.Modelo.buscarPorID(idPieza, conn);

						interfazCRUD.imprimirArray(selectID);

						break;

					case 3:

						Object[][] selectAll = TA_22.TA_22.Modelo.verTabla(conn);

						interfazCRUD.imprimirArray(selectAll);

						break;

					case 4:

						String[] informacionUpd = interfazCRUD.informacion();

						todoCorrect = TA_22.TA_22.Modelo.UpdateContenido(informacionUpd, conn);

						interfazCRUD.msg(TA_22.TA_22.Modelo.comprorUpdate(todoCorrect));

						break;

					case 5:

						int idPiezaDL = interfazCRUD.idPieza();

						todoCorrect = TA_22.TA_22.Modelo.deletePieza(idPiezaDL, conn);

						interfazCRUD.msg(TA_22.TA_22.Modelo.comprorDelete(todoCorrect));
						

						break;

					}


				} while(opcion2 != 6);
			}
		} while(opcion != 0 && opcion != 4);

	}

	public static Connection abrirBD() {
		Connection conn;
		conn = TA_22.TA_22.conneccionBD.conectar();
		if (conn!=null) {
			System.out.println("Connexión abierta correcta");
		}
		else {
			System.out.println("Connexión incorrecta");
		}

		return conn;
	}

	//	public static void cerrarBD() {
	//        Connection conn;
	//        conn = TA_22.TA_22.conneccionBD.cerrar();
	//        if (conn==null) {
	//            System.out.println("Connexión cerrada correcta");
	//        }
	//        else {
	//            System.out.println("Connexión incorrecta");
	//        }
	//    }


}

