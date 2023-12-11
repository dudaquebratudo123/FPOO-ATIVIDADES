package Aula_1408;

public class Carro {
	//atributos
	public String modelo;
	private float potencia;
	public boolean parado; // verificar o estado
	
	//construtores
	
	public Carro (String mod, float pot) {
		this.modelo = mod;
		this.potencia = pot;
		System.out.println("model: " + modelo + " potencia: " + potencia);
	}

	public Carro() {
		System.out.println("acabei de nascer");
	}

	//metodos getters e setters
	public String getModelo() {
		return modelo; // modelo = característica que voce quer VER	(GET)
	}
	
	public void setModelo(String m) { //o void nao tem retorno, ele retorna o tipo do parâmetro q vc impõem
		this.modelo = m;
	}
	
	public Float getPotencia() {
		return potencia;
	}
	
	public void setPotencia (float p) {
		this.potencia = p;
	}
	
	//metodos especiais (lógica)
	public boolean getAcelerar() {
		if (parado == true) {
			System.out.println("Sem movimento");
		}else {
			System.out.println("Acelerando e em movimento");
		}
		return parado;
	}
	
	public boolean getFrear() {
		if(parado == true) {
			System.out.println("Sem movimento");
		}else {
			System.out.println("Esta em movimento");
		}
		return parado;
	}
	
	public boolean isParado() {
		
		return parado; //investigação do estado inicial, testa, v/f
	}
	public void setParado(boolean pa) { // muda o estado do carro
		parado = pa;
	}

}//fim classe
