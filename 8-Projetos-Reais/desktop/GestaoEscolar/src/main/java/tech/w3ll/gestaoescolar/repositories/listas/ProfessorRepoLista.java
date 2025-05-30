package main.java.tech.w3ll.gestaoescolar.repositories.listas;

import main.java.tech.w3ll.gestaoescolar.models.Professor;
import main.java.tech.w3ll.gestaoescolar.repositories.ProfessorInterface;

import java.util.ArrayList;
import java.util.List;

public class ProfessorRepoLista implements ProfessorInterface {
    List<Professor> professors;

    public ProfessorRepoLista() {
        professors = new ArrayList<>();
    }


    @Override
    public boolean cadastrarProfessor(Professor professor) {
        boolean cadastrado;
        try {
            professors.add(professor);
            cadastrado = true;
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar professor: " + e.getMessage());
            cadastrado = false;
        }
        return cadastrado;
    }

    @Override
    public Professor buscarProfessorPorCPF(String cpf) {
        Professor encontrado = null;
        try {
            for (Professor professor : professors) {
                if (professor.getCpf().equals(cpf)) {
                    encontrado = professor;
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao buscar professor:" + e.getMessage());
        }
        return encontrado;
    }

    @Override
    public boolean atualizarProfessor(String cpf, Professor professor) {
        boolean atualizado = false;
        try {
            for (Professor encontrado : professors) {
                if (encontrado.getCpf().equals(cpf)) {
                    encontrado.setNome(professor.getNome());
                    encontrado.setDataNascimento(professor.getDataNascimento());
                    encontrado.setEmail(professor.getEmail());
                    atualizado = true;
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao atualizar professor:" + e.getMessage());
        }
        return atualizado;
    }

    @Override
    public boolean excluirProfessor(String cpf) {
        boolean excluido = false;
        Professor encontrado = null;
        try {
            for (int i = 0; i <= professors.size(); i++) {
                if (professors.get(i).getCpf().equals(cpf)) {
                    encontrado = professors.get(i);
                    break;
                }
            }
            if (encontrado != null)
                professors.remove(encontrado);
        } catch (Exception e) {
            System.out.println("Erro ao atualizar professor:" + e.getMessage());
        }
        return excluido;
    }
}
