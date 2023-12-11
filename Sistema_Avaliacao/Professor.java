package Sistema_Avaliacao;

public class Professor extends Pessoa{
	//atb
	private String materia;
	
	//const
	public Professor() {
		
	}
	public Professor(String materia, String nome, int idade, float peso, float altura ) {
		this.setMateria(materia);
		super.setNome(nome);
		super.setAltura(altura);
		super.setPeso(peso);
		super.setAltura(altura);
	}
	
	//get - set
	public String getMateria() {
		return this.materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	//mt esp
	public void ensinar() {
		System.out.println("\nO professor(a) " + getNome() +" esta ensinando . . .");
	}
	
	public void aplicarProva() {
		System.out.println("O professor(a) " + getNome() + " esta aplicando a prova . . .");
	}
	
	public void corrigirProva() {
		System.out.println("O professor(a) " + getNome() + " esta corrrigindo a prova . . .");
	}
}
