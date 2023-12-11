package Aula_3008;

public class TesteControle {

	public static void main(String[] args) {
		//instanciando tv
		Tv tv1 = new Tv();
		tv1.ligar();
		tv1.volumeMais(11);
		tv1.volumeMais(12);
		tv1.volumeMais(13);
		tv1.volumeMenos(14);
		System.out.println("polegadas da tv : " + tv1.getPolegadas());
		
	}

}
