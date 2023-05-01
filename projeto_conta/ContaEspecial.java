package projeto_conta;

	import java.util.Scanner;

public class ContaEspecial extends ContaCorrente{
	
	
	Scanner leia = new Scanner (System.in); 
	

	//Atributos
	protected double limiteEspecial = 1000;
	protected double saldoEspecial;
	
	//Construtor
		public ContaEspecial (int numero, String cpf, double saldo, boolean ativo, String nome, int contadorTransacao, double valorTransacao) {
			super(numero, cpf, saldo, ativo, nome, contadorTransacao, valorTransacao);
			this.limiteEspecial = limiteEspecial;
		}
	//Getters e Setters
	public double getLimiteEspecial() {
		return limiteEspecial;
	}
		
	//Metodos
	
	
	public void usarLimite () {
			System.out.println("Saldo insuficiente!");
			System.out.println("Para finalizar a transação será necessário utilizar o seu limite especial!");
			System.out.println("O valor máximo do limite especial é de " + limiteEspecial +".\nInforme o valor que deseja solicitar: R$ ");
			saldoEspecial = leia.nextDouble();
			System.out.println("Confirme a operação: S ou N");
			char confirma = leia.next().charAt(0);
			if(confirma == 'S') {
				if(limiteEspecial >= saldoEspecial) {
					saldo = saldo + saldoEspecial;
					limiteEspecial = limiteEspecial - saldoEspecial;
					System.out.println("Operação realizada com sucesso!");
					System.out.println("Saldo atual: R$" + saldo);
					movimentar();
				}else if (limiteEspecial < saldoEspecial) {
					System.out.println("Saldo do limite especial é insuficiente para realizar a operação!");
					System.out.println("Seu saldo de limite especial é de R$" + limiteEspecial);
					movimentar();
				}
			}else if (confirma == 'N') {
				System.out.println("Operação cancelada!");
				movimentar();
			}
	}

	
	@Override
	public double movimentar () {
		System.out.println("Deseja transacionar? \nD - débito, C - crédito ou N - para sair: ");
		char mov1 = leia.next().charAt(0);
		if (mov1 == 'N') {
			System.out.println("Deseja sair? \nConfirme: S ou N");
		char	mov2 = leia.next().charAt(0);
				if (mov2 == 'S') {
					Banco.opcao();
									
				}else if (mov2 == 'N') {
					movimentar();
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
				System.out.println("Operação cancelada! \nVocê será redirecionado para o menu principal");
				Banco.opcao();
			}else if (continua == 'S') {
				if (saldo >= valorTransacao) {
					saldo -= valorTransacao;
					contadorTransacao = contadorTransacao + 1;
					System.out.println("Transação realizada com sucesso!");
					System.out.println("Seu saldo atual é: R$ " + saldo);
					System.out.println("Deseja transacionar novamente? S ou N");
					char mov3 = leia.next().charAt(0);
					if (mov3 == 'S') {
						movimentar();
					} else if (mov3 == 'N') {
						Banco.opcao();
					} else{
						System.out.println("Código inválido! \nTente novamente.");
						movimentar();
					}
				} else if (saldo < valorTransacao) {
					usarLimite();
				}
			}
		}
}
