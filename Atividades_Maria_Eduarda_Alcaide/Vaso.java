package Atividades_Maria_Eduarda_Alcaide;

public class Vaso {
	//atributos
	private String cor;
	private double tamanho;
	private String material;
	
	//construtores
	public Vaso() {
		
	}
	
	public Vaso(String cor, double tamanho, String material) {
		this.cor = cor;
		this.tamanho = tamanho;
		this.material = material;
	}
	
	//getters e setters
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	//metodo especial
	public void exibir(String cor, double tamanho, String material) {
		System.out.println("Cor: " + getCor());
		System.out.println("Tamanho: " + getTamanho());
		System.out.println("Material: " + getMaterial());
	}

	
}//fim clase
