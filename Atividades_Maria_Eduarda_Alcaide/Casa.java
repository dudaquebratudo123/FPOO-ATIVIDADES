package Atividades_Maria_Eduarda_Alcaide;

public class Casa {
	//atb 
	private String cor;
	private float preco;
	private float metragem;
	private Quarto quarto;
	private Sala sala;
	
	//const
	public Casa() {
		super();
	}
	public Casa(String cor, float preco, float metragem, Quarto quarto, Sala sala) {
		super();
		this.cor = cor;
		this.preco = preco;
		this.metragem = metragem;
		this.quarto = quarto;
		this.sala = sala;
	}
	public Casa(Quarto quarto, Sala sala) {
		this.quarto = quarto;
		this.sala = sala;
	}
	
	public Casa(Quarto quarto) {
		this.quarto = quarto;
		
	}
	//get e set
	public String getCor(){
		return this.cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public float getPreco() {
		return this.preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public float getMetragem() {
		return this.metragem;
	}
	public void setMetragem(float metragem) {
		this.metragem = metragem;
	}
	
	public Quarto getQuarto() {
		return this.quarto;
	}
	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}
	
	public Sala getSala() {
		return this.sala;
	}
	public void setSala(Sala sala) {
		this.sala = sala;
	}
	
	//met esp.
	public void mostrarDetalhes() {
		System.out.println("\nDETALHES DA CASA . . . .");
		System.out.println("cor : " + getCor() + "\npreco : R$ " + getPreco() + " \nmetragem : "
				+ getMetragem() + " m\nSALA . . \nnome : " + quarto.getNome() + "\ntem tv? " +
				sala.getTemTV() + "\nQUARTO . . \nnome: " + quarto.getNumeroCamas() + 
				"\nnumero de camas : " + quarto.getNumeroCamas() );
		
		/*
		[System.out.println("cor :" + getCor());
		System.out.println("nome da sala:" + sala.getTemTV());
		*/
		
	}

	
}
