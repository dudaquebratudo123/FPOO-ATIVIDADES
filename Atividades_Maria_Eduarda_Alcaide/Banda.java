package Atividades_Maria_Eduarda_Alcaide;

import java.util.List;

public class Banda {
	//atb
	private String nome;
	private String musica;
	private List<MembroBanda> membros;
	
	//const
	public Banda() {
		
	}
	public Banda(String nome, List<MembroBanda> membros, String musica) {
		this.nome = nome;
		this.setMembros(membros);
		this.musica = musica;
	}
	public Banda(List<MembroBanda> membros) {
		this.setMembros(membros);
	}
	
	//get e set
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<MembroBanda> getMembros() {
		return membros;
	}
	
	public void setMembros(List<MembroBanda> membros) {
		this.membros = membros;
	}
	
	public String getMusica() {
		return this.musica;
	}
	public void setMusica(String musica) {
		this.musica = musica;
	}
	
	//met esp
	public void adicionarMembro() {
		
	}
	
	public void realizarShow() {
		System.out.println("\nO SHOW COMECOU!");
		System.out.println("A banda " + getNome() + " esta tocando " + getMusica());
	}
	
	
	
}
