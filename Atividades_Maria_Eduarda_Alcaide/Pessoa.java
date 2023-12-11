package Atividades_Maria_Eduarda_Alcaide;

public class Pessoa {
	//atributos
	protected String nome;
	protected String endereco;
	protected int telefone;
	protected int cpf;
	protected int celular;

	//construtores
	public Pessoa (String nome, String endereco, int telefone, int cpf, int celular) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cpf = cpf;
		this.celular = celular;
	}
	
	public Pessoa() {
		
	}
	
	//metodos getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public int getCpf() {
		return cpf;
	}
		
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public int getCelular() {
		return celular;
	}
		
	public void setCelular(int celular) {
		this.celular = celular;
	}
}//fim classe
