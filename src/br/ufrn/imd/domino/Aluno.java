package br.ufrn.imd.domino;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aluno extends Pessoa {

	private String matricula;
	private Curso curso;
	private double ira;
	private List<Disciplina> disciplinas;
	
	public Aluno() {
		disciplinas = new ArrayList<Disciplina>();
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public double getIra() {
		return ira;
	}
	public void setIra(double ira) {
		this.ira = ira;
	}
	
	@Override
	public String toString() {
		return getNome() + " matrícula: " +matricula;
	}
	
	public void escolheCurso(Curso course) {
		if(getCurso() == null) {
			setCurso(course);
		}
		else {
			System.out.println("o aluno já está matriculada no curso: " + getCurso());
		}
	}
	
	
	public void solicitarMatricula(Disciplina disciplina) {
		//verificar se a disciplina já existe na coleção
		if(!disciplinas.contains(disciplina))
			disciplinas.add(disciplina);
	}

	
	public void trancarMatricula() {
		System.out.println("Selecione a disciplina que você quer trancar e indique o respectivo ID: ");
		
		for (Disciplina d : listarDisciplinas()) {
			System.out.println(d);
		}
		Scanner sc = new Scanner(System.in);
		int subject = sc.nextInt();
		
		try {		
			for(Disciplina d: disciplinas) {
			if(d.getId() == subject);
			disciplinas.remove(d);
			}
			
		} finally {
			sc.close();
		}
			
	}
	
	
	public List<Disciplina> listarDisciplinas() {
		List<Disciplina> disciplinasRetornadas = new ArrayList<Disciplina>();
		disciplinasRetornadas.addAll(disciplinas);
		return disciplinasRetornadas;
	}
	
	public int qtdDisciplinas( ) {
		return disciplinas.size();
	}
	
}
