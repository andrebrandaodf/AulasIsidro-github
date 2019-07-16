package aula13Heranca;

public class Funcionario extends Pessoa{

	private float salario;
	
	public Funcionario(String nome, String email, float salario) {
		super(nome,email);
		this.salario = salario;
	}
	
	public float getSalario() {
		return salario;
	}
	
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public String toString() {
		return "Funcionário: " +super.nome+ " ("+super.email+") R$ "+this.salario;
	}
}
