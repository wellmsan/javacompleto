package repositorios;

import modelos.Professor;

public interface ProfessorInterface {
    boolean cadastrarProfessor(Professor Professor);
    Professor buscarProfessorPorCPF(String cpf);
    boolean atualizarProfessor(Professor Professor);
    boolean excluirProfessor(String cpf);
}
