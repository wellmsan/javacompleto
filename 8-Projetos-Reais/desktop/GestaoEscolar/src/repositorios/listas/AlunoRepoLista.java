package repositorios.listas;

import modelos.Aluno;
import repositorios.AlunoInterface;

import java.util.ArrayList;
import java.util.List;

public class AlunoRepoLista implements AlunoInterface {
    List<Aluno> alunos;

    public AlunoRepoLista() {
        alunos = new ArrayList<>();
    }


    @Override
    public boolean cadastrarAluno(Aluno aluno) {
        boolean cadastrado;
        try {
            alunos.add(aluno);
            cadastrado = true;
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar aluno");
            cadastrado = false;
        }
        return cadastrado;
    }

    @Override
    public Aluno buscarAlunoPorCPF(String cpf) {
        return null;
    }

    @Override
    public boolean atualizarAluno(Aluno aluno) {
        return false;
    }

    @Override
    public boolean excluirAluno(String cpf) {
        return false;
    }
}
