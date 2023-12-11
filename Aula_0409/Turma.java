package Aula_0409;

import java.util.List;

public class Turma {
	//atb
	public String nome;
	public List<Estudante> estudantes;//agregação
	
	//const.
	public Turma() {
		
	}
	public Turma(String nome, List<Estudante> estudantes) {
		this.nome = nome;
		this.estudantes = estudantes;
	}
	
	//get e set
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Estudante> getEstudantes() {
		return this.estudantes;
	}
	public void setEstudantes(List<Estudante> estudantes) {
		this.estudantes = estudantes;
	}
	
	//
}
