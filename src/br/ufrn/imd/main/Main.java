package br.ufrn.imd.main;

import java.util.Calendar;

import br.ufrn.imd.domino.Aluno;
import br.ufrn.imd.domino.Curso;
import br.ufrn.imd.domino.Disciplina;

public class Main {

	public static void main(String[] args) {

		/**
		 * Criação de um Aluno
		 */
		Aluno jose = new Aluno();
		jose.setNome("José da Silva");
		jose.setMatricula("20229393939");
		
		
		/**
		 * Ajuste da data de nascimento do aluno
		 */
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.set(Calendar.DATE, 19);
		dataNascimento.set(Calendar.MONTH, 9);
		dataNascimento.set(Calendar.YEAR, 1988);
		jose.setDataNascimento(dataNascimento.getTime());
		System.out.println(jose.getDataNascimento());
		
		
		/**
		 * Cadastramento de um auluno do curso
		 */
		Curso bti = new Curso();
		bti.setDescricao("Bacharelado em Tecnologia da Informação");
		
		jose.setCurso(bti);
		
		
		/**
		 * Inserção de disciplinas na grade do aluno
		 */
		
		Disciplina imd0040 = new Disciplina();
		imd0040.setId(1);
		imd0040.setCurso(bti);
		imd0040.setDescricao("Linguagens de programação II");
		
		
		/**
		 * chamada para a matrícula na disciplina do aluno
		 */
		
		jose.solicitarMatricula(imd0040);
		jose.setIra(9.6);
		
		Disciplina imd0404 = new Disciplina();
		imd0404.setId(2);
		imd0404.setCurso(bti);
		imd0404.setDescricao("Web I");
		
		jose.solicitarMatricula(imd0404);
		jose.escolheCurso(bti);
		
		System.out.println(jose);
		
		//
		
		for (Disciplina d : jose.listarDisciplinas()) {
			System.out.println(d);
		}
		
		Disciplina imd0404c = new Disciplina();
		imd0404c.setId(2);
		imd0404c.setCurso(bti);
		imd0404c.setDescricao("Web I");
		
		
		/**
		 * Chamada da função para trancamento de matrícula e verificação
		 */
		
		
		
		jose.trancarMatricula();
		
		System.out.println("Matrículas após o trancamento da disciplinas");
		
		for (Disciplina d : jose.listarDisciplinas()) {
			System.err.print(d);
		}
		
		//inserção interativa desses itens 
		//regras de negócio - implementação dos métodos de solicitar matrícula
		
	}

}
