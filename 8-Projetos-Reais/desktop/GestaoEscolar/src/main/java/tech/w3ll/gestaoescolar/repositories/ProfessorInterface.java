package main.java.tech.w3ll.gestaoescolar.repositories;

import main.java.tech.w3ll.gestaoescolar.models.Professor;

public interface ProfessorInterface {
    boolean cadastrarProfessor(Professor Professor);
    Professor buscarProfessorPorCPF(String cpf);
    boolean atualizarProfessor(String cpf, Professor Professor);
    boolean excluirProfessor(String cpf);
}
