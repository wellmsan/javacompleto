package main.java.tech.w3ll.gestaoescolar.controllers;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import main.java.tech.w3ll.gestaoescolar.models.Aluno;
import main.java.tech.w3ll.gestaoescolar.repositories.listas.AlunoRepoLista;

import java.time.LocalDate;
import java.util.Date;

public class AlunoNovoController {
    @FXML
    public TextField txtNome;
    @FXML
    public TextField txtCPF;
    @FXML
    public DatePicker txtNascimento;
    @FXML
    public TextField txtEmail;
    @FXML
    public Button btnSalvar;


    @FXML
    public void salvarAluno(ActionEvent actionEvent) {
        String nome = txtNome.getText();
        String cpf = txtCPF.getText();
        String email = txtEmail.getText();

        LocalDate localDate = txtNascimento.getValue();
        Date dataNascimento = java.sql.Date.valueOf(localDate);

        Aluno aluno = new Aluno(nome, cpf, dataNascimento, email);
        AlunoRepoLista alunoRepoLista = new AlunoRepoLista();
        alunoRepoLista.cadastrarAluno(aluno);

        Stage stage = (Stage) btnSalvar.getScene().getWindow();
        stage.close();

    }
}
