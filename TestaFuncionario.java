package atividade_poo;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario ("Thiago", "Masculino", 24, 458, "Financeiro");
		Funcionario f2 = new Funcionario ("Gabriela", "Feminino", 50, 200, "Qualidade");
		
		f1.visualizar();
		f2.visualizar();

	}
}
