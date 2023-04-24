package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import db.DB;
import db.DbException;
import model.Usuario;
import model.dao.UsuarioDao;

public class UsuarioDaoJDBC implements UsuarioDao {
	
	private Connection conn;
	PreparedStatement st = null;
	
	public UsuarioDaoJDBC(Connection conn) {
		
		this.conn = conn;
	}

	@Override
	public void insert(Usuario user) {
		
		try {
			st = conn.prepareStatement(
					" INSERT INTO usuario "
					+ "(nome,senha) "
					+ "VALUES "
					+ "(?,?) ",
					Statement.RETURN_GENERATED_KEYS);
			
			st.setString(1, user.getNome());
			st.setString(2,user.getSenha());
			
			int linhasAfetadas = st.executeUpdate();
			
			if(linhasAfetadas > 0) {
				ResultSet rs = st.getGeneratedKeys();
				
				if(rs.next()) {
					int id = rs.getInt(1);
					user.setId(id);
				}
				DB.closeResultSet(rs);
			}else {
				throw new DbException("Erro inesperado, nenhuma linha afetada");
			}
		}
		catch(SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatment(st);
		}
		
	}

	@Override
	public void update(Usuario user) {
		
		try {
			st = conn.prepareStatement(
					" UPDATE usuario "
					+ "SET nome = ? ,senha = ? "
					+ "WHERE id = ?");
			
			st.setString(1, user.getNome());
			st.setString(2, user.getSenha());
			st.setInt(3, user.getId());
			
			st.executeUpdate();

		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally{
			DB.closeStatment(st);
		}
		
	}

	@Override
	public void deleteById(Integer id) {
		
		try {
			st = conn.prepareStatement("DELETE FROM usuario "
					+ "WHERE id = ? ");
			
			st.setInt(1, id);
			
			int roows = st.executeUpdate();
			if(roows == 0) {
				throw new DbException("Id não encontrado");
			}
		}
		catch(SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatment(st);
		}
		
	}

	

	@Override
	public List<Usuario> findAll() {
		
		ResultSet rs = null;
		
		try {
			st = conn.prepareStatement(
				"SELECT * FROM usuario ORDER BY nome" );
			
			rs = st.executeQuery();
			
			List<Usuario> listaUsuarios = new ArrayList<>();
			
			while(rs.next()) {
				Usuario user = new Usuario();
				user.setId(rs.getInt("id"));
				user.setNome(rs.getString("nome"));
				
				listaUsuarios.add(user);
				
			}
			System.out.println(listaUsuarios);
			return listaUsuarios;
			
		}
		catch(SQLException e){
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatment(st);
			DB.closeResultSet(rs);
		}
	}

	@Override
	public Usuario findById(Integer id) {
		
		ResultSet rs = null;
		
		try {
			st = conn.prepareStatement(
					"SELECT * FROM usuario WHERE id = ?");
			
			st.setInt(1, id);
			
			rs = st.executeQuery();
			
			if(rs.next()) {
				
				Usuario user = new Usuario();
				user.setId(rs.getInt("id"));
				user.setNome(rs.getString("nome"));
				
				return user;
			}
			return null;
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatment(st);
			DB.closeResultSet(rs);
		}
		
	}
	
	public boolean findByNomeSenha(String nome, String senha) {
		
		ResultSet rs = null;
		
		try {
			st = conn.prepareStatement(
					"SELECT * FROM usuario WHERE nome = ? and senha=?");
			
			st.setString(1, nome);
			st.setString(2, senha);
			
			rs = st.executeQuery();
			
			if(rs.next()) {				
				Usuario user = new Usuario();
				user.setId(rs.getInt("id"));
				return true;
			}
			return false;
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatment(st);
			DB.closeResultSet(rs);
		}
		
	}
	

	
	
	
	

}
