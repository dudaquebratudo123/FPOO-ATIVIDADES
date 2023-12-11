package Atividades_Maria_Eduarda_Alcaide;

public class SpeedBike implements Veiculo{
	
	//atributos
	public int velocidade;
	public int marcha;
	
	//variaveis
	int aumentarM;
	int diminuirM;
	
	//construtores
	public SpeedBike () {
			
	}
	public SpeedBike (int velocidade, int marcha) {
		this.marcha = marcha;
		this.velocidade = velocidade;
	}
		
	//metodos da interface
	@Override
	public int mudarMarchaMais(int marcha) {
		marcha = marcha + 1;
		System.out.println("A pessoa aumentou a marcha da bike para: " + marcha);
		return marcha;
	}
	
	@Override
	public int mudarMarchaMenos(int marcha) {
		System.out.println("A pessoa diminuiu a marcha da bike para: " + marcha);
		return marcha;
	}
	
	@Override
	public void acelerar() {
		velocidade = velocidade + 1;
		System.out.println("A bike esta acelerando . . .");
	}

	@Override
	public void frear() {
		velocidade = velocidade - 1;
		if (velocidade >= 1) {
			System.out.println("A bike diminuiu a velocidade");
		}else if(velocidade == 0 ) {
			System.out.println("A bike freou, esta parada . . .");
		}
	}
	
	//metodos dessa classe
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public int getMarcha() {
		return marcha;
	}
	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}
	
	public void estado( int velocidade) {
		if (velocidade > 0) {
			System.out.println("A bike está em movimento . . .");
		}else {
			System.out.println("A bike está parada . . .");
		}
	}
	

}//fim classe
