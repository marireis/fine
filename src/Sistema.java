
import model.dao.DaoFactory;
import model.dao.UsuarioDao;
import views.LoginView;

public class Sistema {

	public static void main(String[] args) {
		
		
		UsuarioDao userDao = DaoFactory.createUsuarioDao();
		
		LoginView login = new LoginView();
		
		login.loginInicial();
		
//		user.setNome("adm");
//		user.setSenha("123");	
		
		
		
		//userView.menuInicial(0);
		
		//CRUD USUARIODAOJDBC
		
//		Scanner sc = new Scanner(System.in);
//		
//		UsuarioDao userDao = DaoFactory.createUsuarioDao();
//		System.out.println("\n=== Usuario Insert====");
//		Usuario user = new Usuario(null, "jr", "@123");
//		userDao.insert(user);
//		System.out.println("Inserido! Novo id: " + user.getId());
//		
//		
//		System.out.println("\n=== Usuario findAll====");
//		List<Usuario> list = userDao.findAll();
//		for (Usuario us : list) {
//			System.out.println(us);
//		}
//		
//	
//		System.out.println("\n=== Usuario Update =======");
//		Usuario user2 = userDao.findById(1);
//		user2.setSenha("jr123");
//		userDao.update(user2);
//
//		System.out.println("Atualização completa");
//		
//
//		
//		System.out.println("\n=== Usuario delete =======");
//		System.out.println("Digite o id a ser deletado");
//		int id = sc.nextInt();
//		userDao.deleteById(id);
//		System.out.println("Usuario Deletado! ");
//		sc.close();
	}
}
		

		
		
		


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

