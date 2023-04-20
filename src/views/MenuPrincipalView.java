package views;

import java.util.Scanner;

import model.Usuario;
import service.UsuarioService;

public class MenuPrincipalView {
	
//	static int op=60;
	Scanner leitor = new Scanner(System.in);
	UsuarioView usuarioView;
	
	public void menuPrincipal(int op) {
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
				usuarioView.menuUser(op);
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
	
}
