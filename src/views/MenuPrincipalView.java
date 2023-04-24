package views;

import java.util.Scanner;

import model.Usuario;
import service.UsuarioService;

public class MenuPrincipalView {
	

	private static Scanner leitor = new Scanner(System.in);
	
	public static void menuPrincipal() {
		int op = 0;
		
		do{
			System.out.println("\nBem Vindo ao Menu de Principal");
			
			System.out.println("+-------------------------------------------+");
			System.out.println("|               Menu Principal              |");
			System.out.println("+-------------------------------------------+");
			System.out.println("| 01 - Usuario                              |");
			System.out.println("| 02 - Ingrediente                          |");
			System.out.println("| 03 - Produto                              |");
			System.out.println("| 04 - Voltar para Tela Login               |");
			System.out.println("+-------------------------------------------+");
		
			System.out.print("Escolha a opcao: ");
			op = leitor.nextInt();
					
			switch(op){
			case 1:
				clearConsole();
				UsuarioView.menuUser();
				break;
			case 2:
				//IngredienteView.menuIngrediente();
				break;
			case 3:
				//ProdutoView.menuProduto();
				break;
			case 4:
				System.out.println("Voltar a Tela de Login");
				//usuarioView.menuInicial(op);
				break;
			default:
                System.out.println("Opção inválida!");
                break;
			}
		}while(op != 4);
	}
	public static void clearConsole() {
	    try {
	        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	    } catch (Exception e) {
	        // tratamento de exceção, se necessário
	    }
	}
	
}
