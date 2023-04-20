package views;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Usuario;
import service.UsuarioService;

public class UsuarioView  {
	
	Scanner leitor = new Scanner(System.in);

	UsuarioService usuarioService;
	MenuPrincipalView menu;
	
	public void menuInicial(int op){
		
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
			op = leitor.nextInt();
			
//			switch(op){
//				case 1:
//					boolean usuarioLogado = usuarioService.loginUsuario();
//					System.out.println("\nUsuario logado com sucesso!");
//					if(usuarioLogado) {
//						op = 4;
//						menu.menuPrincipal(op);
//					}
//					break;	
//				case 2:
//					usuarioService.cadastrarUsuario(null);
//					//System.out.println("\nFaça seu login! ");
//					//UsuarioService.loginUsuario();
//					break;
//				case 99:
//					System.out.println("ENCERRADO !");
//					leitor.close();
//					break;
//					
//				default:
//					System.out.println("Opção Inválida");
//			}
		}while(op != 99);
		
	}
	
	public void menuUser(int op) {
		
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
			op = leitor.nextInt();
					
			switch(op){
			case 1:
				usuarioService.cadastrarUsuario(null);
				break;
			case 2:
				usuarioService.atualizar(null);
				break;
			case 3:
				usuarioService.listarTodos();
				break;
			case 4:
				usuarioService.excluir(op);;
				break;
			case 5:
				System.out.println("Voltar a Tela de Login");
				menuInicial(op);
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

	

