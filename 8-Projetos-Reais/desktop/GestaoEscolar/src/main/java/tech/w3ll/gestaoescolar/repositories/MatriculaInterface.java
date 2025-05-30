package main.java.tech.w3ll.gestaoescolar.repositories;

import main.java.tech.w3ll.gestaoescolar.models.Matricula;

import java.util.List;

public interface MatriculaInterface {
    boolean cadastrarMatricula(Matricula matricula);
    List<Matricula> buscarMatriculaPorAluno(String cpf);
    boolean excluirMatricula(Matricula matricula);
}
