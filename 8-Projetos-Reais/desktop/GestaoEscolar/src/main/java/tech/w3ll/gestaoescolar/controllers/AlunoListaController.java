package main.java.tech.w3ll.gestaoescolar.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;
import main.java.tech.w3ll.gestaoescolar.models.Aluno;
import main.java.tech.w3ll.gestaoescolar.repositories.listas.AlunoRepoLista;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

public class AlunoListaController implements Initializable {

    @FXML
    private Button btnNovo;
    @FXML
    private TableView<Aluno> tblAlunos;
    @FXML
    private TableColumn<Aluno, String> colNome;
    @FXML
    private TableColumn<Aluno, String> colCpf;
    @FXML
    private TableColumn<Aluno, Date> colNascimento;
    @FXML
    private TableColumn<Aluno, String> colEmail;
    private static ObservableList<Aluno> listaAlunos = FXCollections.observableArrayList();




    @FXML
    public void cadastrarNovo(ActionEvent actionEvent) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/alunos/alunos-novo.fxml"));
        Stage stage = new Stage();
        try {
            Scene scene = new Scene(fxmlLoader.load());
            stage.setScene(scene);
            stage.setTitle("Cadastro de Aluno");
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setResizable(false);
            stage.show();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    private void carregarDados() {
        AlunoRepoLista alunoRepo = new AlunoRepoLista();
        listaAlunos.clear();
        listaAlunos.addAll(alunoRepo.getAlunos());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        colNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        colCpf.setCellValueFactory(new PropertyValueFactory<>("cpf"));

        colNascimento.setCellValueFactory(new PropertyValueFactory<>("dataNascimento"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));

        tblAlunos.setItems(listaAlunos);
        carregarDados();
    }
}
