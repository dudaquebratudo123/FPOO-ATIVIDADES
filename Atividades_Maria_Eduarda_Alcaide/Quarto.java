package Atividades_Maria_Eduarda_Alcaide;

public class Quarto extends Comodo{
	//atb
	private int numeroCamas;
	
	//const
	public Quarto() {
		
	}
	public Quarto(String nome, int numeroCamas) {
		super(nome);
		this.numeroCamas = numeroCamas;
	}
	
	//get e set
	public int getNumeroCamas() {
		return this.numeroCamas;
	}
	public void setNumeroCamas(int numeroCamas) {
		this.numeroCamas = numeroCamas;
	}
}
