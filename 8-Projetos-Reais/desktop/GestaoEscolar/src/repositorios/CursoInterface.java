package repositorios;

import modelos.Curso;

public interface CursoInterface {
    boolean cadastrarCurso(Curso Curso);
    Curso buscarCursoPorNome(String nome);
    boolean atualizarCurso(Curso Curso);
    boolean excluirCurso(String nome);
}
