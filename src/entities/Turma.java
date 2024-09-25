package entities;

import java.util.Date;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Turma {
	private UUID id;
    private String nome;
    private Date dataInicio;
    private Professor professor;
    private Curso curso;
    private Alunos aluno;
}
