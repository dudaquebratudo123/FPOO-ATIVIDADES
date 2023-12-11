package Atividades_Maria_Eduarda_Alcaide;

import java.util.Scanner;

public class Aluno extends Pessoa { //herda a classe Pessoa
	//atributos
	private String curso;
	private float nota1;
	private float nota2;
	private float media;
	
	//construtor pra herdar a classe pai
	public Aluno (String curso, float nota1, float nota2,String nome, String endereco, int telefone, int cpf, int celular){
		super();
		super.nome = nome;
		super.endereco = endereco;
		super.telefone = telefone;
		super.cpf = cpf;
		super.celular = celular;
		this.curso = curso;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	public Aluno() {
		
	}
	
	//metodos getters e setters
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public float getNota1() {
		return nota1;
	}
	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}
	
	public float getNota2() {
		return nota2;
	}
	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}
	
	//metodos especiais
	public void calcularMedia() {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Nota 1: ");
		float nota1 = entrada.nextFloat();
		System.out.println("Nota 2: ");
		float nota2 = entrada.nextFloat();
		media = (nota1+nota2)/2;
		System.out.println("Media :" + media);
	}
	
	public void situacaoFinal() {
		if(media >= 7) {
		}else {
			System.out.println("Aluno reprovado");
		}
		System.out.println("Aluno aprovado");
		System.out.println("Nome do aluno: " + super.getNome());
		System.out.println("Endereco: " + super.getEndereco());
		System.out.println("Telefone: " + super.getTelefone());
		System.out.println("CPF: " + super.getCpf());
		System.out.println("Celular : " + super.getCelular());
	}
	
}//fim classe
