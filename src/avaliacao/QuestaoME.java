package avaliacao;

public class QuestaoME extends QuestaoSimples {

	private String alternativa1;
	private String alternativa2;
	private String alternativa3;
	private String alternativa4;
	
	public QuestaoME(String e, String r, String a1, String a2, String a3, String a4) {
		super(e, r);
		this.alternativa1 = a1;
		this.alternativa2 = a2;
		this.alternativa3 = a3;
		this.alternativa4 = a4;
	}
	
	public String aplicarQuestao() {
		return "P: "+super.enunciado+"\n"+
			   "   A) "+alternativa1+"\n"+
			   "   B) "+alternativa2+"\n"+
			   "   C) "+alternativa3+"\n"+
			   "   D) "+alternativa4;
	}
}
