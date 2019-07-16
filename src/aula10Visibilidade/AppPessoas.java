package aula10Visibilidade;

public class AppPessoas {

	public static void main(String[] args) {
		Pessoas p1 = new Pessoas("André", "andrebrandaodf@gmailcom", 2000 );
		Pessoas p2 = new Pessoas ("Daniel",1500);
		
		p1.aumentarSalario(15);

		p1.exibirDados();
		
		p2.exibirDados();
	}
}

