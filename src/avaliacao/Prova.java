package avaliacao;

import java.util.Scanner;

public class Prova {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		QuestaoSimples perguntas[];
		perguntas = new QuestaoSimples[5];
		
		perguntas[0] = new QuestaoSimples("Quem Descobriu o Brasil?", "PA Cabral");
		perguntas[1] = new QuestaoME     ("Qual a cor do cavalo branco do Napoleão?", "A", "Branco", "Preto", "Marrom","Amarelo");
		perguntas[2] = new QuestaoComDica("Qual a linguagem do curso?", "Java", "Inicia JA termina em VA");
		perguntas[3] = new QuestaoSimples("Qual a fórmula da água?", "H2O");
		perguntas[4] = new QuestaoME     ("Qual o jogo favorito do André?", "C", "Mario", "Megaman", "Fifa", "PES");
		
		int pontos = 0;
		System.out.println("=============== AVALIAÇÃO ===============");
		for(int i=0; i<perguntas.length; i++) {
			System.out.println(perguntas[i].aplicarQuestao());
			System.out.println("Sua resposta: ");
			String resp = tc.nextLine();
			if(perguntas[i].corrigir(resp)) {
				pontos +=2;
			}
		}
		
		System.out.println("Nota final = "+pontos);
		
		tc.close();
	}

}
