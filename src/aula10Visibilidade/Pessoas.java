package aula10Visibilidade;

public class Pessoas {

	private String nome;
	private String email;
	private double salario;

	//Construtor 
	public Pessoas(String nome, String email, double salario) {
		this.nome 	 = nome;
		this.email 	 = email;
		this.salario = salario;
	}
	
	// Sobrecarga
	public Pessoas (String nome, double salario) {
		this.nome  	 = nome;
		this.email   = "Não especificado";
		this.salario = salario;
	}
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void aumentarSalario(double indice) {
		salario = salario + indice * salario / 100;
	}

	public void exibirDados() {
		System.out.println("Sistema pessoa ****");
		System.out.println("Nome: " + nome + "(" + email + ")");
		System.out.println("Salário R$ " + salario);
	}
}