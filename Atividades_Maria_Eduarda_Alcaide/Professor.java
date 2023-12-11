package Atividades_Maria_Eduarda_Alcaide;

public class Professor extends Pessoa{
	//atributos
		private String nomeCurso;
		private float salario;
		
	//construtor pra herdar a classe pai
	public Professor (String curso,String nome, String endereco, int telefone, int cpf, int celular, String nomeCurso, float salario){
		super();
		super.nome = nome;
		super.endereco = endereco;
		super.telefone = telefone;
		super.cpf = cpf;
		super.celular = celular;
		this.nomeCurso = nomeCurso;
		this.salario = salario;
	}
		
	public Professor() {
			
	}
		
	//metodos getters e setters
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
		
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
		
}//fim classe
