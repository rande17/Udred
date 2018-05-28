package Udred.GUI.CaseControl;

import Udred.GUI.GUIFacade;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author JogGez
 */
public class CaseController implements Initializable
{
    @FXML
    private TextField textFieldCaseID;
    @FXML
    private ChoiceBox<?> cbxStatus;
    @FXML
    private DatePicker datePickerCaseCreated;
    @FXML
    private DatePicker datePickerCaseClosed;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }    

    @FXML
    public void mouseEnter(MouseEvent mouseEvent) {
        GUIFacade.MainController.mouseEnter(mouseEvent);
    }

    @FXML
    public void mouseExit(MouseEvent mouseEvent) {
        GUIFacade.MainController.mouseExit(mouseEvent);
    }

    @FXML
    private void changesRegistered(InputMethodEvent event)
    {
    }
    
}
