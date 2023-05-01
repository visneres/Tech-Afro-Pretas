package projeto_conta;

	import java.util.Scanner;

public class Banco {
	
	static Scanner leia = new Scanner (System.in);
	
	public static void main(String[] args) {
		coletaDados();
		opcao();
	}
		static String nome1;
		static String cpf1;
		static int numeroConta;
		static double saldoBanco;

		
		public static void coletaDados() {
			
			introduzir();
			System.out.println("\nBem vindo ao Java Bank!");
			System.out.println("Nos informe o seu nome: ");
			nome1 = leia.nextLine();
			
			System.out.println("Qual é o número do seu CPF? (Digite somente números): ");
			cpf1= leia.nextLine();
			if (cpf1.length() != 11) {
				System.out.println("CPF inválido!");
				coletaDados();
			} 
			
			System.out.println("Informe número da sua conta: ");
			numeroConta = leia.nextInt();
		
			System.out.println("Informe o valor do crédito inicial: R$");
			saldoBanco = leia.nextDouble();
			if (saldoBanco < 0) {
				System.out.println("Valor de crédito inválido!");
				coletaDados();
			}
	}
		
		
		public static void opcao() {
		
		introduzir();
		
		
		System.out.println("\n1 - CONTA POUPANÇA \n2 - CONTA CORRENTE \n3 - CONTA ESPECIAL \n4 - CONTA EMPRESA \n5 - CONTA ESTUDANTIL \n6 - SAIR");
		System.out.println("\nDIGITE O CÓDIGO DA OPÇÃO SELECIONADA: ");
		int opcao = leia.nextInt();
		
		
		switch (opcao) {
			default:
			System.out.println("\nOperação inválida. \nTente novamente!");
			opcao();
			break;
				
		case 1:
				introduzir();
				System.out.println("\nCONTA POUPANÇA");
				ContaPoupanca cp1 = new ContaPoupanca (numeroConta, cpf1, saldoBanco, true, nome1, 0, 0, opcao);
				cp1.setNome(nome1);
				cp1.setCpf(cpf1);
				cp1.setSaldo(saldoBanco);
				cp1.setNumero(numeroConta);
				cp1.mostrarSaldo();
				System.out.println("Bem vindo(a) "+ cp1.getNome());
				System.out.println("CPF: " + cp1.getCpf());
				System.out.println("Numero da conta: " + cp1.getNumero());
				cp1.statusConta();
				cp1.corrigir();
				System.out.println("Seu saldo atual é: R$" + cp1.getSaldo());
				System.out.println("Você será direcionado para a página inicial da sua conta!");
				System.out.println("\t\t\t\t******************CARREGANDO!******************\n");
				introduzir();
				System.out.println("\nCONTA POUPANÇA");
				System.out.println("\nSaldo atual: R$" + cp1.getSaldo());
				cp1.movimentar();
				break;
				
			case 2:
				introduzir();
				System.out.println("\nCONTA CORRENTE");
				ContaCorrente cc1 = new ContaCorrente(numeroConta, cpf1, saldoBanco, true, nome1, 0, 0);
				cc1.setNome(nome1);
				cc1.setCpf(cpf1);
				cc1.setSaldo(saldoBanco);
				cc1.setNumero(numeroConta);
				System.out.println(cc1.contadorTransacao);
				System.out.println("Bem vindo(a) "+ cc1.getNome());
				System.out.println("CPF: " + cc1.getCpf());
				System.out.println("Numero da conta: " + cc1.getNumero());
				cc1.statusConta();
				System.out.println("Você será direcionado para a página inicial da sua conta!");
				System.out.println("\t\t\t\t******************CARREGANDO!******************\n");
				introduzir();
				System.out.println("\nCONTA CORRENTE");
				System.out.println("\nSaldo atual: R$" + cc1.getSaldo());
				cc1.movimentar();
				cc1.pedirTalao();
				break;
				
			case 3:
				introduzir();
				System.out.println("\nCONTA ESPECIAL");
				ContaEspecial ce1 = new ContaEspecial (numeroConta, cpf1, saldoBanco, true, nome1, 0, 0);
				ce1.setNome(nome1);
				ce1.setCpf(cpf1);
				ce1.setNumero(numeroConta);
				ce1.setSaldo(saldoBanco);		
				System.out.println("Bem vindo(a) "+ ce1.getNome());
				System.out.println("CPF: " + ce1.getCpf());
				System.out.println("Numero da conta: " + ce1.getNumero());
				ce1.statusConta();
				System.out.println("Seu saldo atual é: R$" + ce1.getSaldo());
				System.out.println("Você será direcionado para a página inicial da sua conta!");
				System.out.println("\t\t\t\t******************CARREGANDO!******************\n");
				introduzir();
				System.out.println("\nCONTA ESPECIAL");
				System.out.println("\nSaldo atual: R$" + ce1.getSaldo());
				ce1.movimentar();
				break;
				
			case 4:
				introduzir();
				ContaEmpresa cem1 = new ContaEmpresa(numeroConta, cpf1, saldoBanco, true, nome1, 0, 0); 
				cem1.setNome(nome1);
				cem1.setCpf(cpf1);
				cem1.setNumero(numeroConta);
				cem1.setSaldo(saldoBanco);		
				System.out.println("Bem vindo(a) "+ cem1.getNome());
				System.out.println("CPF: " + cem1.getCpf());
				System.out.println("Numero da conta: " + cem1.getNumero());
				cem1.statusConta();
				System.out.println("Seu saldo atual é: R$" + cem1.getSaldo());
				System.out.println("Você será direcionado para a página inicial da sua conta!");
				System.out.println("\t\t\t\t******************CARREGANDO!******************\n");
				introduzir();
				System.out.println("\nCONTA EMPRESA");
				System.out.println("\nSaldo atual: R$" + cem1.getSaldo());
				cem1.movimentar();
				break;
				
			case 5:
				introduzir();
				ContaEstudantil ces1 = new ContaEstudantil(numeroConta, cpf1, saldoBanco, true, nome1, 0, 0);
				ces1.setNome(nome1);
				ces1.setCpf(cpf1);
				ces1.setNumero(numeroConta);
				ces1.setSaldo(saldoBanco);		
				System.out.println("Bem vindo(a) "+ ces1.getNome());
				System.out.println("CPF: " + ces1.getCpf());
				System.out.println("Numero da conta: " + ces1.getNumero());
				ces1.statusConta();
				System.out.println("Seu saldo atual é: R$" + ces1.getSaldo());
				System.out.println("Você será direcionado para a página inicial da sua conta!");
				System.out.println("\t\t\t\t******************CARREGANDO!******************\n");
				introduzir();
				System.out.println("\nCONTA ESTUDANTIL");
				System.out.println("\nSaldo atual: R$" + ces1.getSaldo());
				ces1.movimentar();
				break;
			
			case 6:
				introduzir();
				System.out.println("\t\t\tObrigado por utilizar os nossos serviços!");
				System.exit(0);
				break;
			}
	
			}
		//Metodo para trazer o nome do banco e slogan
		public static void introduzir() {
			System.out.println("\t\t\t\t\tJAVA BANK - G696");
			System.out.println("\t\tO BANCO FEITO PARA O DESENVOLVIMENTO DOS SEUS INVESTIMENTOS!");
		}
		
		//Metodo para coletar os dados do cliente
		public static void coletaDados(int coletaDados) {
			introduzir ();
			
			System.out.println("\n1 - CONTA POUPANÇA \n2 - CONTA CORRENTE \n3 - CONTA ESPECIAL \n4 - CONTA EMPRESA \n5 - CONTA ESTUDANTIL \n6 - SAIR");
			System.out.println("\nDIGITE O CODIGO DA OPÇÃO SELECIONADA: ");
			

		}	
}
