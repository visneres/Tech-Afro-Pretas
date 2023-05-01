package projeto_conta;

	import java.util.Scanner;

public class ContaCorrente extends Conta {
	
	Scanner leia = new Scanner (System.in);
	
	//Atributos
	protected int contadorTalao;
	protected char solicitaCheque;
		
	
	//Construtor 
	public ContaCorrente (int numero, String cpf, double saldo, boolean ativo, String nome, int contadorTransacao, double valorTransacao) {
		super (numero, cpf, saldo, ativo, nome, contadorTransacao, valorTransacao);
	}

	//Getters e Setters
	public int getContadorTalao() {
		return contadorTalao;
	}

	public void setContadorTalao(int contadorTalao) {
		this.contadorTalao = contadorTalao;
	}
	

	
	//Metodos
	public void pedirTalao () {
			if(contadorTransacao == 10) {
			System.out.println("Contador de talão: " + contadorTalao);
			System.out.println("Deseja solicitar cheque? \nDigite: S para SIM ou N para NÃO");
			solicitaCheque = leia.next().charAt(0);
			if (solicitaCheque == 'S' && contadorTalao < 3) {
				contadorTalao = contadorTalao + 1;
				saldo = saldo - 30;
				System.out.println("Solicitação de cheque realizada com sucesso!");
				System.out.println("Seu saldo atual é: R$" + saldo);
			} else if (solicitaCheque == 'N'&& contadorTalao < 3) {
				System.out.println("Não foi realizada solicitação de cheque!");
				super.mostrarSaldo();
				movimentar();
			}else if (solicitaCheque == 'N'&& contadorTalao >= 3) {
				System.out.println("Não foi realizada solicitação de cheque!");
				super.mostrarSaldo();
				movimentar();
			}else if (solicitaCheque == 'S'&& contadorTalao >= 3) {
				System.out.println("Você já efetuou as 3 solicitações de cheques possíveis!");
				movimentar();
			}else {
				System.out.println("Código inválido!");
				movimentar();
			}
			}
	}
	
	
	@Override
	public double movimentar () {
		System.out.println("Deseja transacionar? \nD - débito, C - crédito ou N - para sair: ");
		char mov1 = leia.next().charAt(0);
		if (mov1 == 'N') {
			System.out.println("Deseja solicitar cheque? \nConfirme: S ou N");
		char	mov2 = leia.next().charAt(0);
				if (mov2 == 'S') {
					if (contadorTalao < 3) {
						System.out.println("Solicitação efetuada com sucesso!");
						contadorTalao = contadorTalao + 1;
						saldo = saldo - 30;
						System.out.println("Seu saldo é: R$" + saldo);
						movimentar();
					}else if(contadorTalao >= 3) {
						System.out.println("Somente é possível solicitar até 3 cheques!");
						movimentar();
					}
				
				}else if (mov2 == 'N') {
					Banco.opcao();
				}
		}else if (mov1 == 'D' || mov1 == 'C') {
			if (mov1 == 'D') {
				debitar();
				pedirTalao();
			} else if (mov1 == 'C') {
				creditar();
				pedirTalao();
			}
		}
		else{
	System.out.println("Operação inválida! \nTente novamente.");
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
				if (contadorTransacao == 10) {
					pedirTalao();
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
				if (contadorTransacao == 10) {
					pedirTalao();
				}
				movimentar();
			}
		}
	}	
}


