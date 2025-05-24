package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HelloController {

    @FXML
    private Button btn;

    @FXML
    private void onClick() {
        btn.setText("Clicado!");
    }
}
