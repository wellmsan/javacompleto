package main.java.tech.w3ll.gestaoescolar.repositories.listas;

import main.java.tech.w3ll.gestaoescolar.models.Aluno;
import main.java.tech.w3ll.gestaoescolar.repositories.AlunoInterface;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AlunoRepoLista implements AlunoInterface {
    private static final List<Aluno> alunos = new ArrayList<>();

    public AlunoRepoLista() {
        alunos.add(new Aluno("Welber", "123.123.123-98", new Date("02/09/1983"), "welber@gmail.com"));
        alunos.add(new Aluno("Juliana", "123.123.123-93", new Date("01/08/1983"), "juliana@gmail.com"));
    }

    @Override
    public List<Aluno> getAlunos() {
        return alunos;
    }

    @Override
    public boolean cadastrarAluno(Aluno aluno) {
        boolean cadastrado;
        try {
            alunos.add(aluno);
            cadastrado = true;
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar aluno: " + e.getMessage());
            cadastrado = false;
        }
        return cadastrado;
    }

    @Override
    public Aluno buscarAlunoPorCPF(String cpf) {
        Aluno encontrado = null;
        try {
            for (Aluno aluno : alunos) {
                if (aluno.getCpf().equals(cpf)) {
                    encontrado = aluno;
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao buscar aluno:" + e.getMessage());
        }
        return encontrado;
    }

    @Override
    public boolean atualizarAluno(String cpf, Aluno aluno) {
        boolean atualizado = false;
        try {
            for (Aluno encontrado : alunos) {
                if (encontrado.getCpf().equals(cpf)) {
                    encontrado.setNome(aluno.getNome());
                    encontrado.setDataNascimento(aluno.getDataNascimento());
                    encontrado.setEmail(aluno.getEmail());
                    atualizado = true;
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao atualizar aluno:" + e.getMessage());
        }
        return atualizado;
    }

    @Override
    public boolean excluirAluno(String cpf) {
        boolean excluido = false;
        Aluno encontrado = null;
        try {
            for (int i = 0; i <= alunos.size(); i++) {
                if (alunos.get(i).getCpf().equals(cpf)) {
                    encontrado = alunos.get(i);
                    break;
                }
            }
            if (encontrado != null)
                alunos.remove(encontrado);
        } catch (Exception e) {
            System.out.println("Erro ao atualizar aluno:" + e.getMessage());
        }
        return excluido;
    }
}
