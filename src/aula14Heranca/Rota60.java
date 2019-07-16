package aula14Heranca;

public class Rota60 {

	public static void main(String[] args) {
		Cliente c;
		ClienteVip v;
		
		c = new Cliente("Isidro", "isidro@isidro.com", 500);
		v = new ClienteVip("André", "andre@andre.com", 500, 300);
		
		System.out.println(c);
		System.out.println(v);

		//Vou comprar
		if(v.fazerCompra(650)) {
			System.out.println("Conseguiu comprar");
		}
		else {
			System.out.println("Saldo Insuficiente");
		}
		System.out.println(v);
	}
		
}
