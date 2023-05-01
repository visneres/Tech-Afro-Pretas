package projeto_conta;

	import java.util.Scanner;

public abstract class Conta {
	
	Scanner leia = new Scanner (System.in);
	
	Banco banco = new Banco();
	
	//Atributos
	protected int numero;
	protected String cpf;
	protected double saldo;
	protected boolean ativo;
	protected int contadorTransacao = 0;
	protected String nome;
	protected double valorTransacao;
	double retornoSaldo;

	
	//Construtor
	public Conta (int numero, String cpf, double saldo, boolean ativo, String nome, int contadorTransacao, double valorTransacao){
		this.numero = numero;
		this.cpf = cpf;
		this.saldo = saldo;
		this.ativo = ativo;
		this.nome = nome;
		this.contadorTransacao = contadorTransacao;
		this.valorTransacao = valorTransacao;
		
	}

	//Getters e Setters
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCpf() {
		return cpf;
	}

public void setCpf(String cpf) {
	this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldoBanco) {
	
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	public int getContadorTransacao() {
		return contadorTransacao;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getValorTransacao() {
		return valorTransacao;
	}
	
	
	
	//Metodos
	public double mostrarSaldo () {
		retornoSaldo = saldo;
		System.out.println("Saldo atual: R$ " + retornoSaldo);
		return saldo;
	}

	public void numeroConta () {
		System.out.println("Informe o número da conta: ");
		numero = leia.nextInt();		
	}
	public void lerCpf () {	
		System.out.println("\nInforme o seu CPF, somente numeros:");
		cpf = leia.next();
		if (cpf.length() != 11) {
			System.out.println("CPF inválido!");
			lerCpf();
		}
	}
	public void statusConta () {
		if (cpf == cpf && numero == numero && nome == nome) {
			ativo = true;
			System.out.println("Conta: ativa");
		}
		else {
			ativo = false;
			System.out.println("Conta: desativada");
		}
	}
	public void solicitarNome () {
		System.out.println("Informe seu nome: ");
		nome = leia.next();
		System.out.println("Bem vindo(a) " + nome);
		
	}

	public double movimentar () {
		System.out.println("Deseja transacionar? \nD - débito, C - crédito ou N - caso não deseje transacionar: ");
		char mov1 = leia.next().charAt(0);
		if (mov1 == 'N') {
			System.out.println("Voltar para o menu principal? \nConfirme: S ou N");
		char	mov2 = leia.next().charAt(0);
				if (mov2 == 'S') {
					Banco.opcao();
				}else if (mov2 == 'N') {
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
	System.out.println("Ação inválida! \nTente novamente.");
	movimentar();
	}
		return saldo;
	}
	
	public void debitar() {
		System.out.println("Qual o valor do movimento: R$ ");
		valorTransacao = leia.nextDouble();
		System.out.println("Continuar: S ou N");
		char continua = leia.next().charAt(0);
		if (continua == 'N') {
			System.out.println("Operação cancelada! \nVocê será redirecionado para o menu principal\n");
			Banco.opcao();
		}else if (continua == 'S') {
			if (saldo >= valorTransacao) {
				saldo = saldo - valorTransacao;
				contadorTransacao = contadorTransacao + 1;
				retornoSaldo = saldo;
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
				System.out.println("Saldo insuficiente!");
				movimentar();
			}
		}
	}
	
	public void creditar() {

		System.out.println("Qual o valor do movimento: R$ ");
		valorTransacao = leia.nextDouble();
		System.out.println("Continuar: S ou N");
		char continua = leia.next().charAt(0);
		if (continua == 'N') {
			System.out.println("Operação cancelada! \nVocê será redirecionado para o menu principal");
			Banco.opcao();
		}else if (continua == 'S') {
			if (saldo >= valorTransacao || saldo < valorTransacao) {
				saldo = saldo + valorTransacao;
				retornoSaldo = saldo;
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
			}
		}
	}
}

	