import java.util.List;
import java.util.Scanner;

import model.Usuario;
import model.dao.DaoFactory;
import model.dao.UsuarioDao;

public class Sistema {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		UsuarioDao userDao = DaoFactory.createUsuarioDao();
		System.out.println("\n=== Usuario Insert====");
		Usuario user = new Usuario(null, "jr", "@123");
		userDao.insert(user);
		System.out.println("Inserido! Novo id: " + user.getId());
		
		
		System.out.println("\n=== Usuario findAll====");
		List<Usuario> list = userDao.findAll();
		for (Usuario us : list) {
			System.out.println(us);
		}
		
	
		System.out.println("\n=== Usuario Update =======");
		Usuario user2 = userDao.findById(1);
		user2.setSenha("jr123");
		userDao.update(user2);

		System.out.println("Atualização completa");
		

		
		System.out.println("\n=== Usuario delete =======");
		System.out.println("Digite o id a ser deletado");
		int id = sc.nextInt();
		userDao.deleteById(id);
		System.out.println("Usuario Deletado! ");
		sc.close();
	}
	
	
	
}
		
//		Usuario usuario = new Usuario(1, null,null);
//		UsuarioService userService = new UsuarioService();
//		UsuarioView userView = new UsuarioView();
//		
//		usuario.setNome("adm");
//		usuario.setSenha("123");	
//		userService.adicionarUsuario(usuario);
//		
//		
//		userView.menuInicial(0);
		
		
		


//		
//		usuarioServiceImpl.adicionar(usuario);
//		usuarioServiceImpl.adicionar(usuario2);
//		
//		Usuario usuarioEncontrado = usuarioServiceImpl.buscarPorId(2);
//		System.out.println(usuarioEncontrado.getLogin());
//		
//		List<Usuario> usuariosPorNome = usuarioServiceImpl.buscarPorNome("Joao");
//	    for (Usuario usr : usuariosPorNome) {
//	        System.out.println(usr.getLogin());
//	    }
//	    
//
//	    List<Usuario> todosUsuarios = usuarioServiceImpl.listarTodos();
//	    for (Usuario usr : todosUsuarios) {
//	        System.out.println(usr.getLogin());
//	    }
//	    usuario.setLogin("Maria");
//	    usuarioServiceImpl.atualizar(usuario);
//	   
//	   
//	    usuarioServiceImpl.excluir(2);

