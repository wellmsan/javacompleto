package repositorios;

import modelos.Aluno;
import modelos.Matricula;

public interface MatriculaInterface {
    boolean cadastrarMatricula(Matricula Matricula);
    Matricula buscarMatriculaPorAluno(Aluno aluno);
    boolean atualizarMatricula(Matricula Matricula);
    boolean excluirMatricula(String nome);
}
