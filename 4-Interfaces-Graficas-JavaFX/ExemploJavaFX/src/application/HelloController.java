package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    public TableColumn<Agenda, String> colNome;
    @FXML
    public TableColumn<Agenda, String> colTelefone;
    @FXML
    public TableView<Agenda> tabelaAgenda;
    @FXML
    public TextField txtNome;
    @FXML
    public TextField txtTelefone;
    @FXML
    public Button btnCadastrar;
    private List<Agenda> agendaList = new ArrayList<>();
    private ObservableList<Agenda> observableList = FXCollections.observableArrayList();

    public void carregarTabela(){
        agendaList.add(new Agenda("Juliana Silva", "71 98765-3564"));
        agendaList.add(new Agenda("Maria da Silva", "71 94231-3456"));
        agendaList.add(new Agenda("Dalmy Souza", "74 98765-1234"));

        observableList.addAll(agendaList);
    }

    public void cadastrarContato(){
        agendaList.add(new Agenda(txtNome.getText(), txtTelefone.getText()));
        observableList.add(agendaList.getLast());

        txtNome.setText("");
        txtTelefone.setText("");
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        colNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        colTelefone.setCellValueFactory(new PropertyValueFactory<>("telefone"));

        tabelaAgenda.setItems(observableList);
        carregarTabela();
    }
}
