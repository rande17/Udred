package Udred.GUI.CaseControl;

import Udred.GUI.GUIFacade;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author JogGez
 */
public class CaseInformationController implements Initializable
{
    @FXML
    private TextField TextFieldCaseInformationTitle;
    @FXML
    private TextArea TextFieldCaseInformationInformation;

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

    public String getCaseInformationInformation()
    {
        return TextFieldCaseInformationInformation.getText();
    }

    public void setCaseInformationInformation(String information)
    {
        this.TextFieldCaseInformationInformation.setText(information);
    }
    
    public String getCaseInformationTitle()
    {
        return TextFieldCaseInformationTitle.getText();
    }

    public void setCaseInformationTitle(String title)
    {
        this.TextFieldCaseInformationTitle.setText(title);
    }
    
}
