

package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Usuario;
import views.MenuPrincipalView;

public class UsuarioService{
	
	Scanner entrada = new Scanner(System.in);
	
	List<Usuario> usuarios = new ArrayList<>();
	
	
	public void adicionarUsuario(Usuario usuario) {

		usuarios.add(usuario);
		System.out.println("\nUsuario " + usuario.getNome() + " de ID: " + + usuario.getId() + " cadastrado com sucesso!" );	
	}

	public void listarTodos() {
		 for(int i=0; i<usuarios.size(); i++) {
			 System.out.println(usuarios.get(i));
		 }
	}


	public void atualizar(Usuario usuario) {
	    for (int i = 0; i < usuarios.size(); i++) {
	        if ((usuarios.get(i)).equals(usuario.getId())){
	            usuarios.set(i, usuario);
	            break;
	        }
	    }
	}
	
	public void excluir(int id) {
		
		System.out.println("Digite o ID do usuario a ser deletado");
	    id = entrada.nextInt();
	    
	    for (Usuario usuario : usuarios) {
	        if (usuario.getId() == id) {
	            usuarios.remove(usuario);
	            System.out.println("Usuario deletado!");
	            break;
	        }
	    }
	}
	
	public void cadastrarUsuario(Usuario usuario) {
		
		System.out.print("Id do usuario: ");
		usuario.setId(entrada.nextInt());
		
		System.out.print("Nome de usuario: ");
		usuario.setNome(entrada.next());
		
		System.out.print("Senha de usuario: ");
		usuario.setSenha(entrada.next());
		
		adicionarUsuario(usuario);
		
		
		
	}
//	
//	
//	public boolean autenticar(Usuario usuario){
//		
//		if (this.(usuario).equals(usuario) && this.senha.equals(senha)) {
//            return true;
//        } else {
//            return false;
//        }
//	}
//	
//	
//	public boolean loginUsuario(Usuario usuario) {
//		
//		String login;
//		String senha;
//		int op = 3;
//		
//		do {
//        	
//        	System.out.print("Digite seu login:");
//        	usuario.setNome(entrada.next());
//        	
//        	System.out.print("Digite sua senha: ");
//        	usuario.setSenha(entrada.next());
//        	
//
//        	if(usuario.setNome()
////        	if(comparaLogin(login, senha)) {
////        		return true;        	
////        	}else {
////        		System.out.println("Login/Senha incorreto. Voce possui " + op + " tentativas");
////        	}
//        	op--;
//
//        }while(op>0); 
//		
//		return false;
//	}


//	public static boolean verificarUsuarioExistente(Usuario usuario) {
//		for(Usuario user: usuarios) {
//			if(user.getNome().equals(usuario)) {
//				usuarios.add(usuario);
//				return true;
//			}
//		}
//		return false;
//	}

}
