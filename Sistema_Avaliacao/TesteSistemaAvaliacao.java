package Sistema_Avaliacao;

import java.util.Scanner;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class TesteSistemaAvaliacao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		//instanciando elementos
			//sala
			System.out.println("TURMA . . . . . . . .");
			System.out.println("qual a serie da turma?");
			int ano = entrada.nextInt();
			Sala sala1 = new Sala(ano);
			
			//professor
			System.out.println("\nPROFESSORES . . . . . . . .");
				//1
				System.out.println("1 - \nnome:");
				String Pn1 = entrada.next();
				System.out.println("idade:");
				int Pi1 = entrada.nextInt();
				System.out.println("materia:");
				String Pm1 = entrada.next();
				System.out.println("peso:");
				float Pp1 = entrada.nextFloat();
				System.out.println("altura:");
				float Pa1 = entrada.nextFloat();
				//2
				System.out.println("\n2 - \nnome:");
				String Pn2 = entrada.next();
				System.out.println("idade:");
				int Pi2 = entrada.nextInt();
				System.out.println("materia:");
				String Pm2 = entrada.next();
				System.out.println("peso:");
				float Pp2 = entrada.nextFloat();
				System.out.println("altura:");
				float Pa2 = entrada.nextFloat();
				
				Professor p1 = new Professor(Pm1, Pn1, Pi1, Pp1, Pa1);
				Professor p2 = new Professor(Pm2, Pn2, Pi2, Pp2, Pa2);
				
				//lista de professores
				List<Professor> prof_list = new ArrayList<Professor>();
				prof_list.add(p1);
				prof_list.add(p2);
					//lendo
					for(Professor vassoura : prof_list) {
						System.out.println("\n- Professor(a) " + vassoura.getNome() + " - " + vassoura.getMateria());
					}
			
			//prova
				System.out.println("\nPROVAS . . . . . . . .");
				//1
				System.out.println("1 - \nmateria:");
				String materia1 = entrada.next();
				System.out.println("quantidade de questoes:");
				int nQuestoes1 = entrada.nextInt();
				System.out.println("nota:");
				int notaProva1 = entrada.nextInt();
				System.out.println(". . . . . . . . . . . . ");
				//2
				System.out.println("2 - \nmateria:");
				String materia2 = entrada.next();
				System.out.println("quantidade de questoes:");
				int nQuestoes2 = entrada.nextInt();
				System.out.println("nota:");
				int notaProva2 = entrada.nextInt();
				System.out.println(". . . . . . . . . . . . ");
				//3
				System.out.println("3 - \nmateria:");
				String materia3 = entrada.next();
				System.out.println("quantidade de questoes:");
				int nQuestoes3 = entrada.nextInt();
				System.out.println("nota:");
				int notaProva3 = entrada.nextInt();
				System.out.println(". . . . . . . . . . . . ");
				//4
				System.out.println("4 - \nmateria:");
				String materia4 = entrada.next();
				System.out.println("quantidade de questoes:");
				int nQuestoes4 = entrada.nextInt();
				System.out.println("nota:");
				int notaProva4 = entrada.nextInt();
				System.out.println(". . . . . . . . . . . . ");
				
				Prova prova1 = new Prova (materia1, notaProva1, nQuestoes1);
				Prova prova2 = new Prova (materia2, notaProva2, nQuestoes2);
				Prova prova3 = new Prova (materia3, notaProva3, nQuestoes3);
				Prova prova4 = new Prova (materia4, notaProva4, nQuestoes4);
				
			//aluno
			System.out.println("\nALUNOS . . . . . . . .");
				//1
				System.out.println("1 - \nnome:");
				String An1 = entrada.next();
				System.out.println("idade:");
				int Ai1 = entrada.nextInt();
				System.out.println("data de nascimento:");
				LocalDate dataNascimento1 = null;
				String Ad1 = entrada.next();
				dataNascimento1 = LocalDate.parse(Ad1, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
				System.out.println("matricula:");
				int Am1 = entrada.nextInt();
				System.out.println("cpf:");
				int Ac1 = entrada.nextInt();
				System.out.println("peso:");
				float Ap1 = entrada.nextFloat();
				System.out.println("altura:");
				float Aa1 = entrada.nextFloat();
				//2
				System.out.println("\n2 - \nnome:");
				String An2 = entrada.next();
				System.out.println("idade:");
				int Ai2 = entrada.nextInt();
				System.out.println("data de nascimento:");
				LocalDate dataNascimento2 = null;
				String Ad2 = entrada.next();
				dataNascimento1 = LocalDate.parse(Ad1, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
				System.out.println("matricula:");
				int Am2 = entrada.nextInt();
				System.out.println("cpf:");
				int Ac2 = entrada.nextInt();
				System.out.println("peso:");
				float Ap2 = entrada.nextFloat();
				System.out.println("altura:");
				float Aa2 = entrada.nextFloat();	
	
				
				Aluno a1 = new Aluno(An1, Ai1, Ap1, Aa1, Am1, Ac1, dataNascimento1,  notaProva1, notaProva2);
				Aluno a2 = new Aluno(An2, Ai2, Ap2, Aa2, Am2, Ac2, dataNascimento2,  notaProva3, notaProva4);
				
				//lista de alunos
				List<Aluno> aluno_list = new ArrayList<Aluno>();
				aluno_list.add(a1);
				aluno_list.add(a2);
					//lendo
					for(Aluno vassoura : aluno_list) {
						System.out.println("\n- Aluno(a) " + vassoura.getNome() + " - " + vassoura.getMatricula());
					}
					
			//escola
			Escola escola = new Escola("Mundial", "Avenida das flores", 35834567 , aluno_list );
			
		//simulação 
		System.out.println("\nSIMULACAO . . . . . . . .");
		escola.matricularAlunos();
		p1.ensinar();
		sala1.conversar();
		sala1.aprender();
		a1.estudar();
		p1.aplicarProva();
		a1.realizarProva();
		p1.corrigirProva();
		a1.notaMedia();
		
	}

}
