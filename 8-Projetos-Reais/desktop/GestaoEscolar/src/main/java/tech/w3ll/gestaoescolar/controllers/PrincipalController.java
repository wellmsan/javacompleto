package main.java.tech.w3ll.gestaoescolar.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class PrincipalController {
    @FXML
    private AnchorPane contentPane;

    @FXML
    private ScrollPane scrollPane;

    @FXML
    public Label btnAluno;

    @FXML
    public void abrirListaAlunos(MouseEvent mouseEvent) throws IOException {
        loadScreen("/fxml/alunos/alunos-lista.fxml");
    }

    @FXML
    public void abrirListaProfessores(MouseEvent mouseEvent) {
        loadScreen("/fxml/professores/professores-lista.fxml");
    }

    private void loadScreen(String fxmlPath) {
        try {
            // Carrega o FXML da tela filha
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
            Node screen = loader.load();

            // Limpa o contentPane e adiciona a nova tela
            contentPane.getChildren().clear();
            contentPane.getChildren().add(screen);

            // Ajusta o conteúdo para preencher o espaço disponível
            AnchorPane.setTopAnchor(screen, 0.0);
            AnchorPane.setBottomAnchor(screen, 0.0);
            AnchorPane.setLeftAnchor(screen, 0.0);
            AnchorPane.setRightAnchor(screen, 0.0);

            // Opcional: ajusta o scroll para o topo
            scrollPane.setFitToWidth(true);
            scrollPane.setVvalue(0);
            scrollPane.setHvalue(0);

        } catch (IOException e) {
            e.printStackTrace();
            // Aqui você pode adicionar tratamento de erro adequado
        }
    }


}
