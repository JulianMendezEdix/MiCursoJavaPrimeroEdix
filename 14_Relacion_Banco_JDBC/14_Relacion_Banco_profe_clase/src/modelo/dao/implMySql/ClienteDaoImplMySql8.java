package modelo.dao.implMySql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.dao.ClienteDao;
import modelo.dao.OficinaDao;
import modelo.javabean.Cliente;
import modelo.javabean.Oficina;

public class ClienteDaoImplMySql8 implements ClienteDao {
	
	private String url, user, pwd;
	private OficinaDao odao = new OficinaDaoImplMySql8();
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;	
	private String sql;
	
	
	public ClienteDaoImplMySql8 () {
		
		url="jdbc:mysql://localhost:3306/banco_programacion?serverTimeZone=UTC";
		user = "julian";
		pwd = "131313";
		try {
			conn = DriverManager.getConnection(url, user, pwd);
			System.out.println("Conexion Establecida");			
		} catch (SQLException e) {
			System.out.println("Conexion no Establecida");
			e.printStackTrace();
		}
		
	}
	


	@Override
	public int alta(Cliente cliente) {
		
		int aux = 0;
		sql = "INSERT INTO clientes VALUES (?,?,?,?,?,?)";
		try {
			ps = conn.prepareStatement(sql);
			
			ps.setString(1,cliente.getIdCliente());
			ps.setString(2,cliente.getNombre());
			ps.setString(3,cliente.getAplellidos());
			ps.setString(4,cliente.getDireccion());
			ps.setString(5,cliente.getEmail());
			ps.setInt(6,cliente.getOficina().getIdOficina());
			
			aux  = ps.executeUpdate();
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return aux;
	}

	@Override
	public Cliente buscar(String id) {
		
		Cliente aux = null;
		
		sql = "SELECT * FROM CLIENTES WHERE id=?";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1,id);
			rs=ps.executeQuery();
			
			if (rs.next()) {
				
				aux = new Cliente(
						rs.getString(1), 
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						odao.buscar(rs.getInt(6)));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return aux;
	}

	@Override
	public List<Cliente> buscarTodos() {
		
		List<Cliente> aux = new ArrayList<>();

		sql="SELECT * FROM clientes";
		
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				
				aux.add(
						new Cliente(
									rs.getString(1),
									rs.getString(2),
									rs.getString(3),
									rs.getString(4),
									rs.getString(5),
									odao.buscar(rs.getInt(6))
									)
						);

			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aux;	
	}

	@Override
	public int modificar(Cliente cliente) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int eliminar(String id) {
		
		
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Cliente> buscarPorOficina(int idOficina) {
		
		List<Cliente> aux = new ArrayList<>();
		sql = "SELECT * FROM CLIENTES where idOficina = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idOficina);
			rs=ps.executeQuery();
			while(rs.next()) {
				aux.add(new Cliente (
									rs.getString(1),
									rs.getString(2),
									rs.getString(3),
									rs.getString(4),
									rs.getString(5),
									odao.buscar(rs.getInt(idOficina))
									)
						);		
			}
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return aux;
	}
	
	
	
	
	
	
	
	
	

}
