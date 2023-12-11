package Sistema_Avaliacao;

import java.util.List;

public class Escola {
	//atb
	private String nome;
	private String localizacao;
	private int telefone;
	private List<Aluno> qtdAlunos;
	
	//const
	public Escola() {
		
	}
	public Escola(String nome, String localizacao, int telefone, List<Aluno>  qtdAlunos) {
		this.setNome(nome);
		this.setLocalizacao(localizacao);
		this.setTelefone(telefone);
		this.setQtdAlunos(qtdAlunos);
	}
	
	//get - set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public List<Aluno> getQtdAlunos() {
		return qtdAlunos;
	}
	public void setQtdAlunos(List<Aluno> qtdAlunos) {
		this.qtdAlunos = qtdAlunos;
	}
	
	//met esp
	public void matricularAlunos() {
		System.out.println("\nA escola " + getNome() + " esta matriculando alunos . . .");
	}
}
