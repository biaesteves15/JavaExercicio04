package controllers;

import java.text.SimpleDateFormat;
import java.util.UUID;

import javax.swing.JOptionPane;

import entities.Alunos;
import entities.Curso;
import entities.Professor;
import entities.Turma;
import repositories.TurmaRepositoryXml;

public class TurmaController {

	public void cadastrarTurma() {

		var turma = obterDadosTurma();
		turma.setProfessor(obterDadosProfessor());
		turma.setCurso(obterDadosCurso());
		turma.setAluno(obterDadosAlunos());
		
		var turmaRepositoryXml = new TurmaRepositoryXml();
		turmaRepositoryXml.exportarDados(turma);

	}

	private Turma obterDadosTurma() {

		var turma = new Turma();

		try {

			turma.setId(UUID.randomUUID());
			turma.setNome(JOptionPane.showInputDialog("Informe o nome da turma: "));
			turma.setDataInicio(new SimpleDateFormat("dd/MM/yyyy")
					.parse(JOptionPane.showInputDialog("Informe a data de início da turma: ")));

		} catch (Exception e) {
			System.out.println("\nErro: " + e.getMessage());
		}

		return turma;
	}

	private Professor obterDadosProfessor() {

		var professor = new Professor();

		professor.setId(UUID.randomUUID());
		professor.setNome(JOptionPane.showInputDialog("Informe o nome do professor: "));
		professor.setTelefone(JOptionPane.showInputDialog("Informe o telefone do professor: "));
		professor.setEmail(JOptionPane.showInputDialog("Informe o email do professor: "));

		return professor;
	}

	private Curso obterDadosCurso() {

		var curso = new Curso();
		
		curso.setId(UUID.randomUUID());
		curso.setTitulo(JOptionPane.showInputDialog("Informe o título do curso: "));
		curso.setCargaHoraria(JOptionPane.showInputDialog("Informe a carga horária do curso: "));

		return curso;
	}

	private Alunos obterDadosAlunos() {

		var aluno = new Alunos();

		aluno.setId(UUID.randomUUID());
		aluno.setNome(JOptionPane.showInputDialog("Informe o nome do aluno: "));
		aluno.setEmail(JOptionPane.showInputDialog("Informe o email do aluno: "));

		return aluno;
	}
}
