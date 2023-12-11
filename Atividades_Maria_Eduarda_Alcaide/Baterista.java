package Atividades_Maria_Eduarda_Alcaide;

public class Baterista extends MembroBanda{
	//const
	public Baterista() {
		
	}
	public Baterista(String nome) {
		super(nome);
	}
	//met
	public void tocar() {
		System.out.println("O baterista está em acao");
	}
}
