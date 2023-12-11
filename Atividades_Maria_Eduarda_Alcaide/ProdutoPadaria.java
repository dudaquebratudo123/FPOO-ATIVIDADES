package Atividades_Maria_Eduarda_Alcaide;

public class ProdutoPadaria implements Produto {
	//atributos
	private String nome;
	private double preco;
	
	//construtores
	public ProdutoPadaria() {
		
	}
	public ProdutoPadaria(String nome, double preco) {
		
	}
	
	//metodos da interface
	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public double getPreco() {
		return preco;
	}

	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	//metodos dessa classe
	public void exibir(String nome, double preco) {
		System.out.println("Produto: " + getNome());
		System.out.println("Preco: " + getPreco());
		
	}

}
