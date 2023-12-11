package Atividades_Maria_Eduarda_Alcaide;

public class Sala extends Comodo{
	//atb
	private boolean temTV;
	
	//const
	public Sala() {
		
	}
	public Sala(boolean temTV, String nome) {
		super(nome);
		this.temTV = temTV;
	}
	
	//get
	public boolean getTemTV() {
		if(temTV == true) {
			System.out.println("A sala tem TV!");
		}else {
			System.out.println("A sala nao tem uma TV!");
		}
		return this.temTV;
	}
	public void setTemTV(boolean temTV) {
		this.temTV = temTV;
			
	}
}
