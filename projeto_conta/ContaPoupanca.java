package projeto_conta;

public class ContaPoupanca extends Conta{
	
	
	//Atributo
	int diaAniversarioPoupanca;
	int dia;
		
	//Construtor
	public ContaPoupanca (int numero, String cpf, double saldo, boolean ativo, String nome, int contadorTransacao, double valorTransacao, int diaAniversarioPoupanca) {
		super (numero, cpf, saldo, ativo, nome, contadorTransacao, valorTransacao);
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}

	//Getters e Setters
	public int getDiaAniversarioPoupanca() {
		return diaAniversarioPoupanca;
	}

	public void setDiaAniversarioPoupanca(int diaAniversarioPoupanca) {
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}

	
	//Metodos
			
	public void corrigir () {
		System.out.println("Digite a data de hoje, no formato [DD]: ");
		dia = leia.nextInt();
		diaAniversarioPoupanca = 24;
		if(dia == diaAniversarioPoupanca) {
			System.out.println("Parabéns, hoje é aniversário da sua conta poupança!!");
			System.out.println("Seu saldo será reajustado em 0,05% !");
			saldo = this.getSaldo() + (saldo * 0.05);
			
		}return;
		
	}
@Override
	public void setSaldo(double saldoBanco) {	
	}
}	

