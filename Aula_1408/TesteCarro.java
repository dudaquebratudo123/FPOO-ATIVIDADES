package Aula_1408;

public class TesteCarro {

	public static void main(String[] args) {
		//instanciando objetos da classe Carro
		Carro c1 = new Carro();
		//atribui um modelo para o caRRO
		c1.modelo = "GOL G5";
		System.out.println("O modelo e : " + c1.modelo);
		//atribui um valor para a potencia do carro
		c1.setPotencia(1000);
		System.out.println("a potencia e : " + c1.getPotencia() + " CV");
		//verificando se o carro está parado ou em movimento
		c1.isParado();
		System.out.println("Estado do carro esta parado?" + c1.isParado());
		//modificar o estado do carro
		c1.setParado(true);
		//frear com o Parado true
		System.out.println("Pisando no freio " + c1.getFrear());
		//acelerar com o Parado false
		//System.out.println("Pisando no acelerador" + c1.getAcelerar());
		
		//usando construtor padrão
		Carro c2 = new Carro();
		//usando construtor com paramentros
		Carro c3 = new Carro("Audi" , 7.5f );
		
	}//fim main

}//fim classe
