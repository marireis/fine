package views;

import java.util.Scanner;

import model.Usuario;
import model.dao.DaoFactory;
import model.dao.UsuarioDao;
import model.dao.impl.UsuarioDaoJDBC;

public class LoginView  {
	
	Scanner sc = new Scanner(System.in);

	Usuario user = new Usuario();
	
	UsuarioDao userDao = DaoFactory.createUsuarioDao();
	
	public void loginInicial(){
		int op = 0;
		
		do{
			System.out.println("\n\n");
			System.out.println("+-------------------------------------------+");
			System.out.println("|               Menu Fine                   |");
			System.out.println("+-------------------------------------------+");
			System.out.println("| 01 - Login                                |");
			System.out.println("| 02 - Cadastrar Usuario                    |");
			System.out.println("| 99 - Sair                                 |");
			System.out.println("+-------------------------------------------+");
		
		
			System.out.print("Escolha a opcao: ");
			op = sc.nextInt();
			
			switch(op){
			
				case 1:
					clearConsole();
					System.out.println("------ TELA DE LOGIN --------");
					
					System.out.println("Login:");
					String nome = sc.next();
					System.out.println("Senha:");
					String senha = sc.next();

					boolean usuarioLogado = userDao.findByNomeSenha(nome, senha);
					
					if (usuarioLogado) {
						
						System.out.println("\nUsuario logado com sucesso!");
						MenuPrincipalView.menuPrincipal();
					}else {
						System.out.println("\nUsuario não cadastrado!");
					}
					
					break;	
				case 2:
					System.out.print("Nome de usuario: ");
					user.setNome(sc.next());
					
					System.out.print("Senha de usuario: ");
					user.setSenha(sc.next());
					
					userDao.insert(user);
					
					break;
				case 99:
					System.out.println("ENCERRADO !");
					sc.close();
					break;
					
				default:
					System.out.println("Opção Inválida");
			}
		}while(op != 99);	
	}
	
	public static void clearConsole() {
	    try {
	        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	    } catch (Exception e) {
	        // tratamento de exceção, se necessário
	    }
	}
}
