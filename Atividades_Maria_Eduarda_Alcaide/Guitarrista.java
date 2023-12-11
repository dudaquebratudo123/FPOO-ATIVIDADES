package Atividades_Maria_Eduarda_Alcaide;

public class Guitarrista extends MembroBanda{
	//const
	public Guitarrista() {
		
	}
	public Guitarrista(String nome) {
		super(nome);
	}	
	//met
	public void tocar() {
		System.out.println("O guitarrista está em acao");
	}
}
