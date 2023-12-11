package Atividades_Maria_Eduarda_Alcaide;

public class Vocalista extends MembroBanda{
	//const
	public Vocalista() {
			
	}
	public Vocalista(String nome) {
		super(nome);
	}
	//met
	public void tocar() {
		System.out.println("O vocalista está em acao");
	}
}
