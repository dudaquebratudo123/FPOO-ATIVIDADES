package Atividades_Maria_Eduarda_Alcaide;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteHeranca {

	public static void main (String[]args) {
		Scanner entrada = new Scanner (System.in);
	
		/*
		Pessoa bebe = new Pessoa();
		bebe.nome="Maria";
		bebe.chorar();
		bebe.dormir();
		bebe.idade=1;
		*/
		
		///Alunos
		Aluno al1 = new Aluno();
		System.out.println("Nome do aluno1: ");
		al1.setNome(entrada.next());
		System.out.println("Endereco: ");
		al1.setEndereco(entrada.next());
		System.out.println("Telefone: ");
		al1.setTelefone(entrada.nextInt());
		System.out.println("CPF: ");
		al1.setCpf(entrada.nextInt());
		System.out.println("Celular: ");
		al1.setCelular(entrada.nextInt());
		System.out.println("Curso: ");
		al1.setCurso(entrada.next());
		
		//testando metodos especiais
		al1.calcularMedia();
		al1.situacaoFinal();
		
		Aluno al2 = new Aluno();
		System.out.println("Nome do aluno2: ");
		al2.setNome(entrada.next());
		System.out.println("Endereco: ");
		al2.setEndereco(entrada.next());
		System.out.println("Telefone: ");
		al2.setTelefone(entrada.nextInt());
		System.out.println("CPF: ");
		al2.setCpf(entrada.nextInt());
		System.out.println("Celular: ");
		al2.setCelular(entrada.nextInt());
		System.out.println("Curso: ");
		al2.setCurso(entrada.next());
		
		al2.calcularMedia();
		al2.situacaoFinal();
		
		//Professores
		Professor prof1= new Professor();
		System.out.println("Nome do professor1: ");
		prof1.setNome(entrada.next());
		System.out.println("Endereco: ");
		prof1.setEndereco(entrada.next());
		System.out.println("Telefone: ");
		prof1.setTelefone(entrada.nextInt());
		System.out.println("CPF: ");
		prof1.setCpf(entrada.nextInt());
		System.out.println("Celular: ");
		prof1.setCelular(entrada.nextInt());
		System.out.println("Nome do curso: ");
		prof1.setNomeCurso(entrada.next());
		System.out.println("Salario: ");
		prof1.setSalario(entrada.nextFloat());
		
		Professor prof2= new Professor();
		System.out.println("Nome do professor2: ");
		prof2.setNome(entrada.next());
		System.out.println("Endereco: ");
		prof2.setEndereco(entrada.next());
		System.out.println("Telefone: ");
		prof2.setTelefone(entrada.nextInt());
		System.out.println("CPF: ");
		prof2.setCpf(entrada.nextInt());
		System.out.println("Celular: ");
		prof2.setCelular(entrada.nextInt());
		System.out.println("Nome do curso: ");
		prof2.setNomeCurso(entrada.next());
		System.out.println("Salario: ");
		prof2.setSalario(entrada.nextFloat());
		
		//criando arraylit para instanciar objetos
		int qntal = 1;//variavel para contagem
		System.out.println("\nArraylist para criar objetos");
		ArrayList<Aluno> criadoral = new ArrayList<>(); //criei uma lista vazia - obj criadoral
		for(int i = 0; i < 2; i++) {
			System.out.println("\nAluno " + qntal++);
			System.out.println("\nNome: ");
			 
			String nome = entrada.next();
			System.out.println("Endereco: ");
			String endereco = entrada.next();
			System.out.println("Telefone: ");
			int telefone = entrada.nextInt();
			System.out.println("Celular: ");
			int celular = entrada.nextInt();
			System.out.println("CPF: ");
			int cpf = entrada.nextInt();
			System.out.println("Curso: ");
			String curso = entrada.next();
			//criando objeto para colocar os atributos do scanner - ajuda do construtor
			Aluno alunin = new Aluno(curso, qntal, i, nome, endereco, telefone, cpf, celular);
			criadoral.add(alunin);
		}//fim for1
		qntal = 1;
		//lendo o array
		for(Aluno alunin:criadoral) {
			System.out.println("\nAluno " + qntal++);
			System.out.println("Nome : " + alunin.getNome());
			System.out.println("Endereco : " + alunin.getEndereco());
			System.out.println("Telefone : " + alunin.getTelefone());
			System.out.println("CPF : " + alunin.getCpf());
			System.out.println("Celular : " + alunin.getCelular());
			System.out.println("Curso : " + alunin.getCurso());
		}//fim for2
		
	}//fim main
	
}//fim classe
