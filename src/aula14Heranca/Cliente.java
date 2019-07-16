package aula14Heranca;

public class Cliente {
	private String nome;
	private String email;
	private float credito;
	
	public Cliente(String nome, String email, float credito) {
		this.nome    = nome;
		this.email   = email;
		this.credito = credito;
		
	}
	public void setCredito(float credito) {
		this.credito = credito;
	}
	public float getCredito() {
		return credito;
	}
	public String toString() {
		return "CLIENTE: "+nome+" ("+email+" ) R$ "+credito;
	}
}
