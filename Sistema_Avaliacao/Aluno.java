package Sistema_Avaliacao;

import java.time.LocalDate;

public class Aluno extends Pessoa{
	//atb
	private int matricula;
	private int cpf;
	private LocalDate dataNascimento;
	private float qtdnotas;
	private float nota1;
	private float nota2;
	private int resultado;
	
	//const
	public Aluno() {
		
	}
	public Aluno(int matricula, int cpf, LocalDate dataNascimento, float qtdnotas, int resultado) {
		this.setMatricula(matricula);
		this.setCpf(cpf);
		this.setDataNascimento(dataNascimento);
		this.setNotas(qtdnotas);
		this.setResultado(resultado);
	}
	public Aluno(String nome, int idade, float peso, float altura, int matricula, int cpf, LocalDate dataNascimento, float nota1, float nota2) {
		super.setNome(nome);
		super.setAltura(altura);
		super.setPeso(peso);
		super.setAltura(altura);
		this.setMatricula(matricula);
		this.setCpf(cpf);
		this.setDataNascimento(dataNascimento);
		this.setNota1(nota1);
		this.setNota2(nota2);
	}
	
	//get - set
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public float getQtdNotas() {
		return this.qtdnotas;
	}
	public void setNotas(float notas) {
		this.qtdnotas = notas;
	}
	
	public int Resultado() {
		return this.resultado;
	}
	public void setResultado(int resultado) {
		this.resultado = resultado;
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
	
	//met. esp
	public void realizarProva() {
		System.out.println("\nO aluno(a)" + getNome() + "esta realizando a prova . . .");
	}
	
	public void estudar() {
		System.out.println("\nO aluno(a) " + getNome() + " esta estudando . . .");
	}
	
	public void notaMedia() {
		System.out.println("\nA media do aluno(a) " + getNome() + " e: " + (nota1 + nota2)/2);
		if(resultado >= 7) {
			System.out.println("Ele(a) foi aprovado!");
		}else {
			System.out.println("Ele(a) foi reprovado!");
		}
	}
}
