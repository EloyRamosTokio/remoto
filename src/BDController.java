import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.fabric.xmlrpc.base.Array;

public class BDController {
	private Connection conexion;

	public BDController() {
		super();
		try {
			this.conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/opositores", "root", "");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error en la conexión del constructor vacío");
		}
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * @return conexion
	 */
	public Connection getConexion() {
		return conexion;
	}

	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}
	/**
	 * Metodo que devuelve un ArrayList de todos los opositores con sus datos.
	 * @return ArrayList de opositores.
	 */
	public ArrayList<Opositor> todosOpositores(){
		ArrayList<Opositor> opositores = new ArrayList<Opositor>();
		try {
			//DEclaramos un Statement para pode hacer una consulta
			Statement miStatement = this.conexion.createStatement();
			//Declaramos un Resulset para meter los resultados de la cnsulta
			ResultSet rs = miStatement.executeQuery("select * from opositor");
			//Recorremos el resultSet para sacar los datos de la consulta y meterlos en un ArrayList
			while(rs.next()==true) {
				opositores.add(new Opositor(rs.getString("nombre"), rs.getString("dni"), rs.getString("telefono"), rs.getString("ciudad")));
			}
			//Cerramos el Statement
			miStatement.close();
			//Cerramos el resultSet
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error al generar el ArrayList de datosOpositores en BDController");
		}
		return opositores;
	}
	public ArrayList<Opositor> dniNombreOpositores(){
		ArrayList<Opositor> opositores = new ArrayList<Opositor>();
		try {
			
			Statement miStatement = this.conexion.createStatement();
			
			ResultSet rs = miStatement.executeQuery("select * from opositor");
			
			while(rs.next()==true) {
				opositores.add(new Opositor(rs.getString("nombre"), rs.getString("dni")));
			}
			
			miStatement.close();
			
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error al generar el ArrayList de datosOpositores en BDController");
		}
		return opositores;
	}
}
