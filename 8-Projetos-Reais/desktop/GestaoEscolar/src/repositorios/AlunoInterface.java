package repositorios;

import modelos.Aluno;

public interface AlunoInterface {
    boolean cadastrarAluno(Aluno aluno);
    Aluno buscarAlunoPorCPF(String cpf);
    boolean atualizarAluno(Aluno aluno);
    boolean excluirAluno(String cpf);
}
