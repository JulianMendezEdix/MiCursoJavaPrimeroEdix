package modelo.dao.implMySql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.dao.OficinaDao;
import modelo.javabean.Oficina;

public class OficinaDaoImplMySql8 implements OficinaDao{
	
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	private String sql;
	private String url, user, pwd;
	
	/*Constructor esoecial que establece la conexion con la BBDD*/
	
	public OficinaDaoImplMySql8() {
		url = "jdbc:mysql://localhost:3306/banco_programacion?serverTimezone=UTC";
		user="julian";
		pwd="131313";
		try {
			conn = DriverManager.getConnection(url, user, pwd);
			System.out.println("Conexion establecida");
		} catch (SQLException e) {
			System.out.println("Conexion NOOO establecida");
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}
	
	@Override
	public int alta (Oficina oficina) {
		
		int aux=0;
		
		sql="INSERT INTO OFICINAS VALUES (?,?,?,?,?)";
		
		try {
			ps=conn.prepareStatement(sql);
			
			ps.setInt(1,oficina.getIdOficina());
			ps.setString(2,oficina.getNombre());
			ps.setString(3,oficina.getDireccion());
			ps.setString(4,oficina.getTelefono());
			ps.setString(5, oficina.getCiudad());
			
			aux = ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return aux;
		
	}
	
	@Override
	public Oficina buscar (int idOficina) { 
		
		Oficina aux=null;
		sql="select * from oficinas where idOficina=?";

		
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1, idOficina);
			rs=ps.executeQuery(); 
			while (rs.next()) {   //rs.next=¿Hay fila?
				aux = new Oficina(
						rs.getInt("idoficina"), 
						rs.getString("nombre"), 
						rs.getString("direccion"), 
						rs.getNString("telefono"),
						rs.getNString("ciudad"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aux;
	}
	
	@Override
	public List <Oficina> buscarTodos () {
		
		List<Oficina> aux = new ArrayList<>();
		sql="select * from oficinas";
		try {
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				aux.add(new Oficina(
						rs.getInt(1), 
						rs.getString(2), 
						rs.getString(3), 
						rs.getString(4), 
						rs.getString(5)));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return aux;
	
	}
	
	
	public int modificar (Oficina oficina) {
		
		int aux = 0;
		sql = "UPDATE OFICINAS SET nombre=?, direccion=?, telefono=?, ciudad=? WHERE idoficina=?";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, oficina.getNombre());
			ps.setString(2, oficina.getDireccion());
			ps.setString(3, oficina.getTelefono());
			ps.setString(4, oficina.getCiudad());
			ps.setInt(5, oficina.getIdOficina());
			
			aux = ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return aux;
		
	}
	@Override
	public int eliminar (Oficina oficina) {
		
		int aux = 0;
		sql = "DELETE FROM OFICINAS WHERE idoficina=? ";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, oficina.getIdOficina());
			aux=ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aux;
	}
	@Override
	public List <Oficina> buscarPorPrefijo (String prefijo) {return null;}
	
	
	@Override
	public List <Oficina> buscarPorCiudad (String ciudad) {
		
		List<Oficina> aux = new ArrayList<>();
		sql="SELECT * FROM OFICINAS WHERE ciudad=?";
			
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, ciudad);
			rs=ps.executeQuery();
			while(rs.next()){
				aux.add(new Oficina(rs.getInt(1),
									rs.getString(2),
									rs.getString(3), 
									rs.getString(4),
									rs.getString(5)));	
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return aux;
	}

	

}
