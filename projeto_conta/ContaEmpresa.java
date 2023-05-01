package projeto_conta;

	import java.util.Scanner;

public class ContaEmpresa extends ContaCorrente{

	Scanner leia = new Scanner (System.in);
	
	//Atributos
	double emprestimoEmpresa = 10000;
	double valorEmprestimo;
	char solicitaEmprestimo;
	
	//Construtor
	public ContaEmpresa (int numero, String cpf, double saldo, boolean ativo, String nome, int contadorTransacao, double valorTransacao) {
		super(numero, cpf, saldo, ativo, nome, contadorTransacao, valorTransacao);
		this.emprestimoEmpresa = emprestimoEmpresa;
		this.valorEmprestimo = valorEmprestimo;
	}

	//Getters e Setters
	public double getEmprestimoEmpresa() {
		return emprestimoEmpresa;
	}

	
	public double getValorEmprestimo() {
		return valorEmprestimo;
	}


	//Metodos
	public void pedirEmprestimo () {
		System.out.println("\t\t\t\t******************CARREGANDO!******************\n");
		System.out.println("O emprestimo está limitado para valor máximo de: R$" + emprestimoEmpresa + "!");
		System.out.println("Informe o valor que deseja: R$ ");
		valorEmprestimo = leia.nextDouble();
		System.out.println("Confirmar empréstimo: S para SIM ou N para NÃO");
		solicitaEmprestimo = leia.next().charAt(0);
		if (solicitaEmprestimo == 'S') {
			if (valorEmprestimo > emprestimoEmpresa) {
				System.out.println("Não foi possível realizar a operação!");
				System.out.println("Valor disponível para empréstimo: R$" + emprestimoEmpresa);
			}else if (valorEmprestimo > 0 && valorEmprestimo <= 10000) {
				if (emprestimoEmpresa >= valorEmprestimo) {
					saldo = saldo + valorEmprestimo;
					emprestimoEmpresa = emprestimoEmpresa - valorEmprestimo;
					//super.mostrarSaldo();
					System.out.println("Operação realizada com sucesso!");
					System.out.println("Seu atual é: R$ " + saldo);
				}else if (emprestimoEmpresa < valorEmprestimo ) {
					System.out.println("Não há saldo suficiente para realizar a operação!");
					movimentar();
				}
		
			}
		}else if (solicitaEmprestimo =='N') {
			System.out.println("Operação não efetuada!");
			movimentar();
			
		}else 
			System.out.println("Código inválido");
			movimentar();
		
	}
	
	@Override
	public double movimentar () {
		System.out.println("Deseja transacionar? \nD - débito, C - crédito ou E - empréstimo empresa: ");
		char mov1 = leia.next().charAt(0);
		if (mov1 == 'E') {
			System.out.println("Deseja solicitar o empréstimo empresa? \nConfirme: S ou N");
		char	mov2 = leia.next().charAt(0);
				if (mov2 == 'S') {
					pedirEmprestimo();
						movimentar();
				}else if (mov2 == 'N') {
					movimentar();
				}
					else {
						System.out.println("Código inválido!");
						movimentar();
					}
		}else if (mov1 == 'D' || mov1 == 'C') {
			if (mov1 == 'D') {
				debitar();
			} else if (mov1 == 'C') {
				creditar();
				
			}
		}
		else{
	System.out.println("Código inválido! \nTente novamente.");
	movimentar();
		}
		return saldo;
	}
		
	
	@Override
	public void debitar() {
		System.out.println("Qual o valor do movimento: R$ ");
		valorTransacao = leia.nextDouble();
		System.out.println("Continuar: S ou N");
		char continua = leia.next().charAt(0);
		if (continua == 'N') {
			System.out.println("Operação cancelada!");
			movimentar();
		}else if (continua == 'S') {
			if (saldo >= valorTransacao) {
				saldo = saldo - valorTransacao;
				contadorTransacao = contadorTransacao + 1;
				retornoSaldo = saldo;
				System.out.println("Transação realizada com sucesso!");
				System.out.println("Seu saldo atual é: R$ " + saldo);
				if (contadorTransacao == 10 && emprestimoEmpresa > 0) {
					System.out.println("Você realizou 10 transações! \nO empréstimo empresa está liberado!!\n");
					pedirEmprestimo();
				}
				movimentar();
			} else if (saldo < valorTransacao) {
				System.out.println("Saldo insuficiente!");
				movimentar();
			}
		}
	}
	
	@Override
	public void creditar() {

		System.out.println("Qual o valor do movimento: R$ ");
		valorTransacao = leia.nextDouble();
		System.out.println("Continuar: S ou N");
		char continua = leia.next().charAt(0);
		if (continua == 'N') {
			System.out.println("Operação cancelada!");
			movimentar();
		}else if (continua == 'S') {
			if (saldo >= valorTransacao || saldo < valorTransacao) {
				saldo = saldo + valorTransacao;
				retornoSaldo = saldo;
				contadorTransacao = contadorTransacao + 1;
				System.out.println("Transação realizada com sucesso!");
				System.out.println("Seu saldo atual é: R$ " + saldo);
				if (contadorTransacao == 10 && emprestimoEmpresa > 0) {
					System.out.println("Você realizou 10 transações! \nO empréstimo empresa está liberado!!\n");
					pedirEmprestimo();
				}
				movimentar();
			}
		}
	}	
}
	
	
	

