package Aula_0409;

import java.util.List;
import java.util.ArrayList;

public class TesteFaculdade {

	public static void main(String[] args) {
		//inst classe estudante
		Estudante e1 = new Estudante("fabin","TIA", 28);
		Estudante e2 = new Estudante("junin","TIB", 12);
		Estudante e3 = new Estudante("claudin","EE", 50);
		Estudante e4 = new Estudante("paulin","ECP", 28);
		
		//lista vazia de estudantes
		List<Estudante> eTI = new ArrayList<Estudante>();
		eTI.add(e1);
		eTI.add(e2);
		
		//mostrando alunos da lista
		int i2 = 0;
		for(Estudante estudante : eTI) {
			System.out.printf("Posicao %d - %s %d %s\n", i2, estudante.nome
					, estudante.r_a, estudante.curso);
			i2++;
		}
		
		//vamos adicionar os alunos e3 e e4 na lista NOVA
		List<Estudante> eEE = new ArrayList<Estudante>();//lista eEE
		eEE.add(e3);
		eEE.add(e4);
		
		//instancia da classe turma
		Turma TIA = new Turma("TI", eTI);
		Turma EE = new Turma("EngE", eEE);
		
		//lista de turma p/ adicionar os alunos a ela
		List<Turma> tur = new ArrayList<Turma>();
		tur.add(TIA);
		tur.add(EE);
		//ler a lista e verificar quais alunos estao nela
		for(int i = 0; i < tur.size(); i++) {
			System.out.println("nome das turmas: " + tur.get(i).getNome());
		}
		//instancia da classe faculdade
		Faculdade senai = new Faculdade("SENAI", tur);
		System.out.println("total de estudantes da faculdade e: " + senai.getTotalEstudantes());
	}//fim main

}//fim classe
