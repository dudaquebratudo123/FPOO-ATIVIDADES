package Aula_0409;

import java.util.List;

public class Faculdade {
	//atb
	public String nomeFacul;
	public List<Turma> cursos;
	
	//cont.
	public Faculdade() {
		
	}
	public Faculdade(String nomeFacul, List<Turma> cursos) {
		this.nomeFacul = nomeFacul;
		this.cursos = cursos;
	}
	
	//get e set
	public String getNomeFacul() {
		return this.nomeFacul;
	}
	public void setNomeFacul(String nomeFacul) {
		this.nomeFacul = nomeFacul;
	}
	
	public List<Turma> getCursos() {
		return this.cursos;
	}
	public void setCursos(List<Turma> cursos) {
		this.cursos = cursos;
	}
	
	//met 
	public int getTotalEstudantes() {
		int nEstudantes = 0;
		List<Estudante> estudante;
		for(Turma cur : cursos) { //cur varre cursos (que está dentro de Turma)
			estudante = cur.getEstudantes();
			for(Estudante s : estudante) {
				nEstudantes++;
			}
		}
		return nEstudantes;
		
	}//fim main
	
}//fim classe
