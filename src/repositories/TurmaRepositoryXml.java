package repositories;

import java.io.PrintWriter;

import entities.Turma;

public class TurmaRepositoryXml {
	
	public void exportarDados(Turma turma) {
		
		try {
			
			var printWriter = new PrintWriter("turma_" + turma.getId() + ".xml");
			
			printWriter.write("<?xml version='1.0' encoding='iso-8859-1'?>");
	
			printWriter.write("<Turma>");
				printWriter.write("<Id>" + turma.getId() + "</Id>");
				printWriter.write("<Nome>" + turma.getNome() + "</Nome>");
				printWriter.write("<DataInicio>" + turma.getDataInicio() + "</DataInicio>");
				printWriter.write("<Professor>");
					printWriter.write("<IdProfessor>" + turma.getProfessor().getId() + "</IdProfessor>");
					printWriter.write("<NomeProfessor>" + turma.getProfessor().getNome() + "</NomeProfessor>");
					printWriter.write("<TelefoneProfessor>" + turma.getProfessor().getTelefone() + "</TelefoneProfessor>");
					printWriter.write("<EmailProfessor>" + turma.getProfessor().getEmail() + "</EmailProfessor>");
				printWriter.write("</Professor>");
				printWriter.write("<Curso>");
					printWriter.write("<IdCurso>" + turma.getCurso().getId() + "</IdCurso>");
					printWriter.write("<TituloCurso>" + turma.getCurso().getTitulo() + "</TituloCurso>");
					printWriter.write("<CargaHorariaCurso>" + turma.getCurso().getCargaHoraria() + "</CargaHorariaCurso>");
				printWriter.write("</Curso>");
				printWriter.write("<Alunos>");
					printWriter.write("<Aluno>");
						printWriter.write("<IdAluno>" + turma.getAluno().getId() + "</IdAluno>");
						printWriter.write("<NomeAluno>" + turma.getAluno().getNome() + "</NomeAluno>");
						printWriter.write("<EmailAluno>" + turma.getAluno().getEmail() + "</EmailAluno>");
					printWriter.write("</Aluno>");
				printWriter.write("</Alunos>");
			printWriter.write("</Turma>");
			
			printWriter.close();
			
			System.out.println("\nArquivo XML gravado com sucesso!");
			
		}
		catch(Exception e) {
			System.out.println("\nErro" + e.getMessage());
		}
	}
}
