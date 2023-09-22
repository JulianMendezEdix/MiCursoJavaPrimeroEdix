package modelo.daojdbc;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.CommentClientInfoProvider;

import modelo.javabean.Cliente;
import modelo.javabean.Cuenta;

public class CuentaDaoImplMy8 extends AbstractDaoMy8 implements CuentaDao{
	
	private ClienteDao cdao;
	
	public CuentaDaoImplMy8() {
		cdao = new ClienteDaoImplMy8();
	}

	@Override
	
	public int alta(Cuenta cuenta) {
		Cuenta cuenta = em.find(Cuenta.class, 1005);
		
		sql = "insert into cuentas values(?,?,?,?,?)";
		filas = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, cuenta.getIdCuenta());
			ps.setString(2, cuenta.getTipoCuenta());
			ps.setDouble(3, cuenta.getSaldo());
			ps.setString(4, cuenta.getCliente().getIdCliente());
			ps.setDate(5, cuenta.getFechaAlta());
			
			filas = ps.executeUpdate();
			filas=1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public Cuenta buscarUno(int idCuenta) {
		Cuenta cuenta = em.find(Cuenta.class, 1005);
		
		sql = "select * from cuentas where id_cuenta = ?";
		Cuenta ct = null;
		 
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idCuenta);
			rs = ps.executeQuery();
			if (rs.next()) {
				ct = new Cuenta();
				crearCuenta(ct);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ct;
	}

	@Override
	public List<Cuenta> buscarTodos() {
		sql = "select * from cuentas";
		 
		List<Cuenta> lista = new ArrayList<>();
		 
		try {
			ps = conn.prepareStatement(sql);
			
			rs = ps.executeQuery();
			while (rs.next()) {
				Cuenta ct = new Cuenta();
				crearCuenta(ct);
				lista.add(ct);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public List<Cuenta> buscarPorClientes(String idCliente) {
		sql = "select * from cuentas where id_cliente = ?";
		 
		List<Cuenta> lista = new ArrayList<>();
		 
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, idCliente);
			rs = ps.executeQuery();
			while (rs.next()) {
				Cuenta ct = new Cuenta();
				crearCuenta(ct);
				
				lista.add(ct);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public List<Cuenta> buscarPorClientesPrefijo(String prefijoIdCliente) {
		sql = "select * from cuentas where id_cliente like ?";
		/*
		que comience 'subcadena%'
		que contenga '%subcadena%'
		que termine en  '%subcadena'

		*/
		List<Cuenta> lista = new ArrayList<>();
		 
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, prefijoIdCliente + "%");
			//ps.setString(1, "%" + prefijoIdCliente + "%");
			// ps.setString(1, "%" +prefijoIdCliente");
			rs = ps.executeQuery();
			while (rs.next()) {
				Cuenta ct = new Cuenta();
				crearCuenta(ct);
				
				lista.add(ct);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public double sumaSaldos() {
		sql = "select sum(saldo) as suma from cuentas";
		double suma = 0;
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs.next()) {
				suma = rs.getDouble("suma");
				
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return suma;
	}

	@Override
	public int diasEntreHoyFechaAlta(int idCuenta) {
		sql = "select  datediff(current_date() , fecha_alta) from cuentas where id_cuenta = ?";
		int dias = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idCuenta);
			rs = ps.executeQuery();
			if (rs.next()) {
				dias = rs.getInt(1);
				
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dias;
	}

	@Override
	public int modificarCuenta(Cuenta cuentaAModificar) {
		sql = "update cuentas set tipo_cuenta = ? , saldo = ?, id_cliente = ?, fecha_alta = ? "
				+ " where id_cuenta = ?";
		filas = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, cuentaAModificar.getTipoCuenta());
			ps.setDouble(2, cuentaAModificar.getSaldo());
			ps.setString(3, cuentaAModificar.getCliente().getIdCliente());
			ps.setDate(4, cuentaAModificar.getFechaAlta());
			ps.setInt(5, cuentaAModificar.getIdCuenta());
			filas = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return filas;
	}

	@Override
	public int eliminarCuenta(int idCuenta) {
		sql = "delete from cuentas where id_cuenta = ?";
		filas = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idCuenta);
			filas = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return filas;
	}
	
	private void crearCuenta(Cuenta ct) throws SQLException {
		ct.setIdCuenta(rs.getInt("id_cuenta"));
		ct.setTipoCuenta(rs.getString("tipo_cuenta"));
		ct.setSaldo(rs.getDouble("saldo"));
		ct.setCliente(cdao.buscarUno(rs.getString("id_cliente")));
		ct.setFechaAlta(rs.getDate("fecha_alta"));
	}

}
