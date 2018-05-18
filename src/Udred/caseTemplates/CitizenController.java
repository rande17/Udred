package Udred.caseTemplates;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import Udred.GUI.GUIFacade;

public class CitizenController {

    @FXML
    public void initialize() {

    }

    public void mouseEnter(MouseEvent mouseEvent) {
        GUIFacade.MainController.mouseEnter(mouseEvent);
    }

    public void mouseExit(MouseEvent mouseEvent) {
        GUIFacade.MainController.mouseExit(mouseEvent);
    }

}
