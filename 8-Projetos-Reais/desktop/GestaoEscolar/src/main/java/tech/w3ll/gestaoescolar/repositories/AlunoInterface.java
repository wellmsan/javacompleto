package main.java.tech.w3ll.gestaoescolar.repositories;

import main.java.tech.w3ll.gestaoescolar.models.Aluno;

import java.util.List;

public interface AlunoInterface {
    List<Aluno> getAlunos();
    boolean cadastrarAluno(Aluno aluno);
    Aluno buscarAlunoPorCPF(String cpf);
    boolean atualizarAluno(String cpf, Aluno aluno);
    boolean excluirAluno(String cpf);
}
