package Aula_1608;

public class Visitante2 {
	//atributos
		private String nome;
		private int idade;
		private double altura;

		//construtores
		public Visitante2 (String nome, int idade, double altura) {
			this.nome = nome;
			this.idade = idade;
			this.altura = altura;
		}
		
		public Visitante2() {
			
		}
		
		//metodos getters e setters
		public String getNome() {
			return nome;
		}
			
		public void setNome(String nome) {
			this.nome = nome;
		}
			
		public double getAltura() {
			return altura;
		}
			
		public void setAltura(double altura) {
			this.altura = altura;
		}
			
		public int getIdade() {
			return idade;
		}
			
		public void setIdade(int idade) {
			this.idade = idade;
		}
		
		//metodo pode andar no brinquedo
		public boolean podeAndarNoBrinquedo() {
			if(altura >= 1.60 && idade >= 12) {
				System.out.println("Voce pode andar no brinquedo");
				return true;
			}else {
				System.out.println("Voce nao pode andar no brinquedo");
				return false;
			}
		}
}
