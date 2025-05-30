package main.java.tech.w3ll.gestaoescolar.repositories;

import main.java.tech.w3ll.gestaoescolar.models.Curso;

public interface CursoInterface {
    boolean cadastrarCurso(Curso Curso);
    Curso buscarCursoPorNome(String nome);
    boolean atualizarCurso(String nome, Curso Curso);
    boolean excluirCurso(String nome);
}
