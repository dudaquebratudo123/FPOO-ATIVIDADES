package Sistema_Avaliacao;

public class Prova {
	//atb
	private String materia;
	private int nota;
	private int questoes;
	
	//const
	public Prova() {
		
	}
	public Prova(String materia, int nota, int questoes) {
		this.setMateria(materia);
		this.setNota(nota);
		this.setQuestoes(questoes);
	}
	
	//get - set
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	
	public int getQuestoes() {
		return this.questoes;
	}
	public void setQuestoes(int questoes) {
		this.questoes = questoes;
	}
}
