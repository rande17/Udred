
package Udred.GUI.CaseControl;

import Udred.GUI.GUIFacade;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author JogGez
 */
public class Controller 
{
    @FXML
    private TextField TextFieldCaseWorkerCPR;
    @FXML
    private TextField TextFieldCaseWorkerFirstName;
    @FXML
    private TextField TextFieldCaseWorkerLastName;
    @FXML
    private TextField TextFieldCaseWorkerTelephone;
    @FXML
    private TextField TextFieldCaseWorkerEMail;
    @FXML
    private TextField TextFieldCaseWorkerAddressStreet;
    @FXML
    private TextField TextFieldCaseWorkerAddressPostalCode;
    @FXML
    private TextField TextFieldCaseWorkerAddressCountry;
    @FXML
    private TextField TextFieldCaseWorkerAddressCity;
    @FXML
    private TextField TextFieldCaseWorkerAddressNumber;
    
    public void initialize() {

    }

    public void mouseEnter(MouseEvent mouseEvent) {
        GUIFacade.MainController.mouseEnter(mouseEvent);
    }

    public void mouseExit(MouseEvent mouseEvent) {
        GUIFacade.MainController.mouseExit(mouseEvent);
    }


}
