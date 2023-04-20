package model.dao;

import java.util.List;

import model.Usuario;

public interface UsuarioDao {

	void insert(Usuario user);
	void update(Usuario obj);
	void deleteById(Integer id);
	Usuario findById(Integer id);
	List<Usuario> findAll();

}
