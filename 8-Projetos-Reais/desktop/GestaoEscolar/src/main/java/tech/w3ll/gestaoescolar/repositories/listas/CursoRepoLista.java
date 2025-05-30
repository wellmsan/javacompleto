package main.java.tech.w3ll.gestaoescolar.repositories.listas;

import main.java.tech.w3ll.gestaoescolar.models.Curso;
import main.java.tech.w3ll.gestaoescolar.repositories.CursoInterface;

import java.util.ArrayList;
import java.util.List;

public class CursoRepoLista implements CursoInterface {
    private List<Curso> cursos;

    public CursoRepoLista() {
        this.cursos = new ArrayList<>();
    }

    @Override
    public boolean cadastrarCurso(Curso Curso) {
        boolean cadastrado;
        try {
            cursos.add(Curso);
            cadastrado = true;
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar curso: " + e.getMessage());
            cadastrado = false;
        }
        return cadastrado;
    }

    @Override
    public Curso buscarCursoPorNome(String nome) {
        Curso encontrado = null;
        try {
            for (Curso curso : cursos) {
                if (curso.getNome().equals(nome)) {
                    encontrado = curso;
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao buscar curso:" + e.getMessage());
        }
        return encontrado;
    }

    @Override
    public boolean atualizarCurso(String nome, Curso curso) {
        boolean atualizado = false;
        try {
            for (Curso encontrado : cursos) {
                if (encontrado.getNome().equals(nome)) {
                    encontrado.setCargaHorario(curso.getCargaHorario());
                    encontrado.setProfessor(curso.getProfessor());
                    atualizado = true;
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao atualizar curso:" + e.getMessage());
        }
        return atualizado;
    }

    @Override
    public boolean excluirCurso(String nome) {
        boolean excluido = false;
        Curso encontrado = null;
        try {
            for (int i = 0; i <= cursos.size(); i++) {
                if (cursos.get(i).getNome().equals(nome)) {
                    encontrado = cursos.get(i);
                    break;
                }
            }
            if (encontrado != null)
                cursos.remove(encontrado);
        } catch (Exception e) {
            System.out.println("Erro ao atualizar curso:" + e.getMessage());
        }
        return excluido;
    }
}
