package Atividades_Maria_Eduarda_Alcaide;

public class PessoaBike {
	//atributos
	public String nome;
	public String tipobike;
	
	//construtores
		public PessoaBike () {
			
		}
		public PessoaBike (String nome, String tipobike) {
			this.nome = nome;
			this.tipobike = tipobike;
		}
		
	//metodos
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String getTipoBike() {
			return tipobike;
		}
		public void setTipoBike(String tipobike) {
			this.tipobike = tipobike;
		}
		
		public void SubirNaBike() {
			System.out.println("A pessoa " + getNome() + " subiu em uma " + tipobike + " . . . ");
		}
		public void DescerDaBike() {
			System.out.println("A pessoa " +  getNome() +" desceu de uma " + tipobike + " . . . ");
		}
}//fim classe
