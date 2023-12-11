package Atividades_Maria_Eduarda_Alcaide;

public class Passagem {
	//atb
	private Voo voo;
	private Passageiro passageiro;
	private double precoTotal;
	
	
	//const
	public Passagem() {
	}
	/*
	public Passagem(Voo voo, Passageiro passageiro, double precoTotal) {
		this.passageiro = passageiro;
		this.voo = voo;
		this.precoTotal = precoTotal;
	}
	*/
	
	public Passagem(Voo voo, Passageiro p1) {
		this.passageiro = p1;
		this.voo = voo;
	}
	
	//get-set
	public Voo getVoo() {
		return this.voo;
	}
	public void setVoo(Voo voo) {
		this.voo = voo;
	}
	
	public Passageiro getPassageiro() {
		return passageiro;
	}
	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}
	
	public double getPrecoTotal() {
		return precoTotal;
	}
	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}
	
	//
	@Override
	public String toString() {
		return "nome do passageiro: " + passageiro.getNome() + "\nnumero: " + 
				voo.getNumeroVoo() + "\norigem: " + voo.getOrigem() +
				"\ndestino: " + voo.getDestino() + "\npreco: " + voo.getPreco();		
		}
	}



/*




*/