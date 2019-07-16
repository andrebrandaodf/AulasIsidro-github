package aula13Heranca;

public class AppPessoa {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("André", "andrebrandaodf@gmail.com");

		Funcionario f = new Funcionario("Isidro", "isidro@gmail.com", 5000);

		System.out.println("Mostrando infos.........");
		System.out.println(p);
		System.out.println(f);
	}

}
