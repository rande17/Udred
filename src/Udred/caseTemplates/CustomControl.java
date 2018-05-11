package Udred.caseTemplates;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;

public class CustomControl extends TitledPane {
    @FXML private Label lblText;

    public CustomControl() {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Udred/caseTemplates/CustomControl.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        fxmlLoader.setClassLoader(getClass().getClassLoader());

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    public Label getLabel() {
        return lblText;
    }

    @FXML
    public void removeThis() {
        VBox par = (VBox)this.getParent();
        par.getChildren().remove(this);
    }

}