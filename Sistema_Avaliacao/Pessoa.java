package Sistema_Avaliacao;

public class Pessoa {
	//atb
	private String nome;
	private int idade;
	private float peso;
	private float altura;
	
	//const
	public Pessoa() {
		
	}
	public Pessoa(String nome, int idade, float peso, float altura ) {
		this.setNome(nome);
		this.setAltura(altura);
		this.setPeso(peso);
		this.setAltura(altura);
	}
	
	//get - set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	//met.esp
	public void falar() {
		System.out.println("\nA pessoa" + getNome() + "esta falando . . .");
	}
	
	public void andar() {
		System.out.println("\nA pessoa" + getNome() + "esta andando . . .");
	}
	
	public void questionar() {
		System.out.println("\nA pessoa" + getNome() + "esta questionando o professor . . .");
	}
	
	
}
