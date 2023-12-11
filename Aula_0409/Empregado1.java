package Aula_0409;

public class Empregado1 {
	//Atributos
	public int salario;
	public Pessoa funcionario;// na composicao muda o tipo do atributo para o nome da classe
	
	//const.
	public Empregado1() {
		
	}
	public Empregado1(int salario, Pessoa funcionario) {
		this.salario = salario;
		this.funcionario = funcionario;
	}
	
	//get e set
	public int getSalario() {
		return this.salario;
	}
	
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	public Pessoa getFuncionario() {
		return this.funcionario;
	}
	public void setFuncionario(Pessoa funcionario) {
		this.funcionario = funcionario;
	}
}
