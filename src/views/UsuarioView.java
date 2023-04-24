package views;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Usuario;
import model.dao.DaoFactory;
import model.dao.UsuarioDao;
import service.UsuarioService;

public class UsuarioView  {
	
	private static Scanner sc = new Scanner(System.in);
	private static Usuario user = new Usuario();	
	private static UsuarioDao userDao = DaoFactory.createUsuarioDao();
	
	
	public static void menuUser() {
		
		int op = 0;
		
		do{
			System.out.println("\nBem Vindo ao Menu de Usuarios");
	    	
			System.out.println("+-------------------------------------------+");
			System.out.println("|              Menu de Usuarios             |");
			System.out.println("+-------------------------------------------+");
			System.out.println("| 01 - Cadastrar Usuario                    |");
			System.out.println("| 02 - Atualizar Usuario                    |");
			System.out.println("| 03 - Listar Usuarios                      |");
			System.out.println("| 04 - Deletar Usuario                      |");
			System.out.println("| 05 - Voltar para o menu principal         |");
			System.out.println("+-------------------------------------------+");
		
		
		
			System.out.print("Escolha a opcao: ");
			op = sc.nextInt();
					
			switch(op){
			case 1:
				System.out.print("Nome de usuario: ");
				user.setNome(sc.next());
				
				System.out.print("Senha de usuario: ");
				user.setSenha(sc.next());
				
				userDao.insert(user);
				break;
			case 2:
				userDao.update(user);
				break;
			case 3:
				userDao.findAll();
				break;
			case 4:
				userDao.deleteById(op);
				break;
			case 5:
				System.out.println("Voltar a Tela de Login");
				MenuPrincipalView.menuPrincipal();
				break;
			default:
                System.out.println("Opção inválida!");
                break;
			}
		}while(op != 5);

		}
	}

	
	
//	public void cadastrarProduto(){
//		Scanner leitor = new Scanner(System.in);
//		Produto produto = new Produto();
//		
//		System.out.print("Código do produto: ");
//		produto.setCodigoProduto(leitor.nextInt());
//		
//		System.out.print("Marca do produto: ");
//		leitor.nextLine();// limpa o scanner
//		produto.setMarca(leitor.nextLine());
//		
//		System.out.println("Descrição do produto: ");
//		leitor.nextLine();
//		produto.setDescricao(leitor.nextLine());
//		
//		produtos.add(produto);
//	}
//	
//	public void imprimirProdutos() {
//		for(Produto produto : produtos){
//			System.out.println("\nCódigo: " + produto.getCodigoProduto());
//			System.out.println("Marca: " + produto.getMarca());
//			System.out.println("Descrição: " + produto.getDescricao());
//			System.out.println("\n\n");
//		}
//	}
//	
//	public void cadastrarCliente(){
//		Scanner leitor = new Scanner(System.in);
//		Usuario cliente = new Usuario(null, null, null);
//		
//		System.out.print("ID do cliente: ");
//		cliente.setId(leitor.nextInt());
//		
//		System.out.print("Nome do cliente: ");
//		leitor.nextLine();
//		cliente.setNome(leitor.nextLine());
//		
//		usuarios.add(cliente);
//		
//	}
//	
//	public void imprimirCliente(){
//		for(Usuario cliente : usuarios){
//			System.out.println("\nId: " + cliente.getId());
//			System.out.println("Nome: " + cliente.getNome());
//			System.out.println("\n\n");
//		}
//	}
//	

	

