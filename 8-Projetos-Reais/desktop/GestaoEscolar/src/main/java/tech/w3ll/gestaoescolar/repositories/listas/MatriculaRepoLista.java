package main.java.tech.w3ll.gestaoescolar.repositories.listas;

import main.java.tech.w3ll.gestaoescolar.models.Aluno;
import main.java.tech.w3ll.gestaoescolar.models.Matricula;
import main.java.tech.w3ll.gestaoescolar.repositories.MatriculaInterface;

import java.util.ArrayList;
import java.util.List;

public class MatriculaRepoLista implements MatriculaInterface {
    private List<Matricula> matriculas;
    private AlunoRepoLista alunoRepo;

    public MatriculaRepoLista() {
        this.matriculas = new ArrayList<>();
    }

    @Override
    public boolean cadastrarMatricula(Matricula matricula) {
        boolean cadastrado;
        try {
            matriculas.add(matricula);
            cadastrado = true;
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar matricula: " + e.getMessage());
            cadastrado = false;
        }
        return cadastrado;
    }

    @Override
    public List<Matricula> buscarMatriculaPorAluno(String cpf) {
        List<Matricula> encontrados = new ArrayList<>();
        try {
            Aluno aluno = alunoRepo.buscarAlunoPorCPF(cpf);
            for (Matricula matricula : matriculas) {
                if (matricula.getAluno().equals(aluno)) {
                    encontrados.add(matricula);
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao buscar matricula:" + e.getMessage());
        }
        return encontrados;
    }

    @Override
    public boolean excluirMatricula(Matricula matricula) {
        boolean excluido = false;
        try {
            if (matriculas.remove(matricula))
                excluido = true;
        } catch (Exception e) {
            System.out.println("Erro ao atualizar matricula:" + e.getMessage());
        }
        return excluido;
    }
}
