package Atividades_Maria_Eduarda_Alcaide;

public class Passageiro {
	//atb
	private String nome;
	private String sobrenome;
	private String email;
	
	//const
	public Passageiro() {
		
	}
	public Passageiro(String nome, String sobrenome, String email) {
		this.nome = nome;
		this.email = email;
		this.sobrenome = sobrenome;
	}
	
	//get-set
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return this.sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
