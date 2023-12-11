package Atividades_Maria_Eduarda_Alcaide;

public class VasoDecorado extends Vaso{
	//atributos
	private String decoracao;
	
	//construtores
	public VasoDecorado() {
		
	}
	
	public VasoDecorado(String cor, double tamanho, String material, String decoracao) {
		super();
		super.setCor(cor);
		super.setTamanho(tamanho);
		super.setMaterial(material);
		this.setDecoracao(decoracao);
	}
	
	//getters e setters
	public String getDecoracao() {
		return decoracao;
	}
	public void setDecoracao(String decoracao) {
		this.decoracao = decoracao;
	}
	
	//metodo especial
	public void exibir(String cor, double tamanho, String material, String decoracao) {
		System.out.println("Cor: " + getCor());
		System.out.println("Tamanho: " + getTamanho());
		System.out.println("Material: " + getMaterial());
		System.out.println("Decoracao: " + getDecoracao());
	}
}//fim classe
