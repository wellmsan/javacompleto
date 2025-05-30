package main.java.tech.w3ll.gestaoescolar.models;

public class Curso {
    private String nome;
    private int cargaHorario;
    private Professor professor;

    public Curso(String nome, int cargaHorario, Professor professor) {
        this.nome = nome;
        this.cargaHorario = cargaHorario;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHorario() {
        return cargaHorario;
    }

    public void setCargaHorario(int cargaHorario) {
        this.cargaHorario = cargaHorario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
