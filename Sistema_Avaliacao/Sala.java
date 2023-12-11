package Sistema_Avaliacao;

public class Sala {
	//atb
	private int anoEscolar;
	
	//const
	public Sala() {
		
	}
	public Sala (int anoEscolar) {
		this.setAnoEscolar(anoEscolar);
	}
	
	//get - set
	public int getAnoEscolar() {
		return anoEscolar;
	}
	public void setAnoEscolar(int anoEscolar) {
		this.anoEscolar = anoEscolar;
	}
	
	//met. esp
	public void aprender() {
		System.out.println("\nA sala esta aprendendo . . . ");
	}
	public void conversar() {
		System.out.println("\nA sala esta conversando . . .");
	}
}
