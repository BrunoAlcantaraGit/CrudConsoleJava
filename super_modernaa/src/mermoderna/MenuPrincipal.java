package mermoderna;


import java.util.Scanner;

public class MenuPrincipal {

	public static void main(String[] args) throws Throwable {
		// Instanciando Scanner para capturar o que for digitado na tela
		Scanner scn = new Scanner(System.in);

		// Menu de Opcoes
		System.out.println("=================================");
		System.out.println("ESCOLHA UMA OP��O ABAIXO:");
		System.out.println("=================================");
		System.out.println("1 -  Cadastrar Produto");
		System.out.println("2 -  Atualizar Produto");
		System.out.println("3 -  Excluir Produto");
		System.out.println("4 -  Cadastrar Secao");
		System.out.println("5 -  Atualizar Secao");
		System.out.println("6 -  Excluir Secao");
		System.out.println("7 -  Buscar Produto");
		System.out.println("8 -  Buscar Secao");
		System.out.println("---------------------------------");

		int num1 = scn.nextInt();
		scn.nextLine();

		// Garantir que recebera um numero valido
		// Enquanto nao receber ficara solicitando uma opcao valida
		while (num1 > 8) {

			System.out.println("Dado inv�lido, escolha a op��o 1 a 8");
			num1 = scn.nextInt();
			scn.nextLine();
		}

		// inicio das opcoes
		switch (num1) {
		case 1:
			CadastrarProduto.InserirProduto();
			break;
		case 2:
			AtualizarProduto.atualizarProduto();
			break;
		case 3:
			ExcluirProduto.excluirProduto();
			break;
		case 4:
			ManipularDados.inserirSecao();
			break;
		case 5:
			MenuPrincipal.alterarSecao();
			break;
		case 6:
			ManipularDados.deletarSecao();
			break;
		case 7:
			ManipularDados.consultarTbProduto();
			break;
		case 8:
			ManipularDados.consultarTbSecao();
			break;
		default:
			System.out.println("Dado inv�lido, escolha a op��o 1 a 8");

		}

		// fecha o scanner
		scn.close();
	}

}