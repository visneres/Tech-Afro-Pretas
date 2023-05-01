package projeto_conta;

	import java.util.Scanner;

public class ContaEstudantil extends ContaCorrente{
	
	Scanner leia = new Scanner (System.in);
	
	//Atributo
	double limiteEstudantil = 5000;
	double valorEstudantil;
	char solicitaEstudantil;
	
	//Construtor
	public ContaEstudantil (int numero, String cpf, double saldo, boolean ativo, String nome, int contadorTransacao, double valorTransacao) {
		super(numero, cpf, saldo, ativo, nome, contadorTransacao, valorTransacao);
		this.limiteEstudantil = limiteEstudantil;
		this.valorEstudantil = valorEstudantil;
		
	}

	//Getters e Setters
	public double getLimiteEstudantil() {
		return limiteEstudantil;
	}
	
	public double getValorEstudantil() {
		return valorEstudantil;
	}

	//Metodo
	public void usarEstudantil() {
		System.out.println("\t\t\t\t******************CARREGANDO!******************\n");
		System.out.println("O valor máximo do empréstimo estudantil é de: R$" + limiteEstudantil + "!");
		System.out.println("Informe o valor que deseja para o empréstimo: R$ ");
		valorEstudantil = leia.nextDouble();
		System.out.println("Confirmar empréstimo: S para SIM ou N para NÃO");
		solicitaEstudantil = leia.next().charAt(0);
		if (solicitaEstudantil == 'S') {
			if (valorEstudantil > limiteEstudantil) {
				System.out.println("Não foi possível realizar a operação!");
				System.out.println("Valor disponível para empréstimo: R$" + limiteEstudantil);
			}else if (valorEstudantil > 0 && valorEstudantil <= 5000) {
			if (limiteEstudantil >= valorEstudantil) {
				saldo = saldo + valorEstudantil;
				limiteEstudantil = limiteEstudantil - valorEstudantil;
				//super.mostrarSaldo();
				System.out.println("Operação realizada com sucesso!");
				System.out.println("Seu atual é: R$ " + saldo);
			}else if (limiteEstudantil < valorEstudantil) {
				System.out.println("Não há saldo suficiente para realizar a operação!");
				movimentar();
			}
			
		}
		}else if (solicitaEstudantil =='N') {
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
			System.out.println("Deseja solicitar o empréstimo estudantil? \nConfirme: S ou N");
		char	mov2 = leia.next().charAt(0);
				if (mov2 == 'S') {
					usarEstudantil();
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
				if (contadorTransacao == 10 && limiteEstudantil > 0) {
					System.out.println("Você realizou 10 transações! \nO empréstimo estudantil está liberado!!\n");
					usarEstudantil();
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
				if (contadorTransacao == 10 && limiteEstudantil > 0) {
					System.out.println("Você realizou 10 transações! \nO empréstimo estudantil está liberado!!\n");
					usarEstudantil();
				}
				movimentar();
			}
		}
	}
}

	
	

