
package Udred.GUI.CaseControl;

import Udred.GUI.GUIFacade;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author JogGez
 */
public class Controller 
{
    @FXML
    private TextField TextFieldCitizenCPR;
    @FXML
    private TextField TextFieldCitizenFirstName;
    @FXML
    private TextField TextFieldCitizenLastName;
    @FXML
    private TextField TextFieldCitizenTelephone;
    @FXML
    private TextField TextFieldCitizenEMail;
    @FXML
    private TextField TextFieldCitizenAddressStreet;
    @FXML
    private TextField TextFieldCitizenAddressPostalCode;
    @FXML
    private TextField TextFieldCitizenAddressCountry;
    @FXML
    private TextField TextFieldCitizenAddressCity;
    @FXML
    private TextField TextFieldCitizenAddressNumber;
    @FXML
    private TableView<?> tableViewCitizenCases;
    
    public void initialize() {

    }

    @FXML
    public void mouseEnter(MouseEvent mouseEvent) {
        GUIFacade.MainController.mouseEnter(mouseEvent);
    }

    @FXML
    public void mouseExit(MouseEvent mouseEvent) {
        GUIFacade.MainController.mouseExit(mouseEvent);
    }

    public TextField getTextFieldCitizenCPR()
    {
        return TextFieldCitizenCPR;
    }

    public void setTextFieldCitizenCPR(TextField TextFieldCitizenCPR)
    {
        this.TextFieldCitizenCPR = TextFieldCitizenCPR;
    }

    public TextField getTextFieldCitizenFirstName()
    {
        return TextFieldCitizenFirstName;
    }

    public void setTextFieldCitizenFirstName(TextField TextFieldCitizenFirstName)
    {
        this.TextFieldCitizenFirstName = TextFieldCitizenFirstName;
    }

    public TextField getTextFieldCitizenLastName()
    {
        return TextFieldCitizenLastName;
    }

    public void setTextFieldCitizenLastName(TextField TextFieldCitizenLastName)
    {
        this.TextFieldCitizenLastName = TextFieldCitizenLastName;
    }

    public TextField getTextFieldCitizenTelephone()
    {
        return TextFieldCitizenTelephone;
    }

    public void setTextFieldCitizenTelephone(TextField TextFieldCitizenTelephone)
    {
        this.TextFieldCitizenTelephone = TextFieldCitizenTelephone;
    }

    public TextField getTextFieldCitizenEMail()
    {
        return TextFieldCitizenEMail;
    }

    public void setTextFieldCitizenEMail(TextField TextFieldCitizenEMail)
    {
        this.TextFieldCitizenEMail = TextFieldCitizenEMail;
    }

    public TextField getTextFieldCitizenAddressStreet()
    {
        return TextFieldCitizenAddressStreet;
    }

    public void setTextFieldCitizenAddressStreet(TextField TextFieldCitizenAddressStreet)
    {
        this.TextFieldCitizenAddressStreet = TextFieldCitizenAddressStreet;
    }

    public TextField getTextFieldCitizenAddressPostalCode()
    {
        return TextFieldCitizenAddressPostalCode;
    }

    public void setTextFieldCitizenAddressPostalCode(TextField TextFieldCitizenAddressPostalCode)
    {
        this.TextFieldCitizenAddressPostalCode = TextFieldCitizenAddressPostalCode;
    }

    public TextField getTextFieldCitizenAddressCountry()
    {
        return TextFieldCitizenAddressCountry;
    }

    public void setTextFieldCitizenAddressCountry(TextField TextFieldCitizenAddressCountry)
    {
        this.TextFieldCitizenAddressCountry = TextFieldCitizenAddressCountry;
    }

    public TextField getTextFieldCitizenAddressCity()
    {
        return TextFieldCitizenAddressCity;
    }

    public void setTextFieldCitizenAddressCity(TextField TextFieldCitizenAddressCity)
    {
        this.TextFieldCitizenAddressCity = TextFieldCitizenAddressCity;
    }

    public TextField getTextFieldCitizenAddressNumber()
    {
        return TextFieldCitizenAddressNumber;
    }

    public void setTextFieldCitizenAddressNumber(TextField TextFieldCitizenAddressNumber)
    {
        this.TextFieldCitizenAddressNumber = TextFieldCitizenAddressNumber;
    }
    
  


}
