package aula11MetodosStatic;

public class TesteStatic {

	public int at1;
	public int at2;
	
	public static int AT3;
	
	public void exibirValores() {
		System.out.println("AT1 = "+at1+"  AT2 = "+at2);
		System.out.println("AT3 = "+AT3);
	}
	
	public static void metodoStatic(String str) {
		System.out.println("MÉTODO STATIC "+str);
	}
	
}
