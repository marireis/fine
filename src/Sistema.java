
import model.dao.DaoFactory;
import model.dao.UsuarioDao;
import views.LoginView;

public class Sistema {

	public static void main(String[] args) {
		
		
		UsuarioDao userDao = DaoFactory.createUsuarioDao();
		
		LoginView login = new LoginView();
		
		login.loginInicial();
		
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
		

		
	
