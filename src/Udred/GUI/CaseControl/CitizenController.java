package Udred.GUI.CaseControl;

import Udred.GUI.GUIFacade;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author JogGez
 */
public class CitizenController implements Initializable
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
    
    public String getCitizenCPR(){
        return TextFieldCitizenCPR.getText();
    }
    
    public void setCitizenCPR(String CPR){
        TextFieldCitizenCPR.setText(CPR);
    }
    
    public String getCitizenFirstName(){
        return TextFieldCitizenFirstName.getText();
    }
    
    public void setCitizenFirstName(String fname){
        TextFieldCitizenFirstName.setText(fname);
    }
    
    public String getCitizenLastName(){
        return TextFieldCitizenLastName.getText();
    }
    
    public void setCitizenLastName(String lname){
        TextFieldCitizenLastName.setText(lname);
    }
    
    public String getCitizenTelephone(){
        return TextFieldCitizenTelephone.getText();
    }
    
    public void setCitizenTelephone(String tlf){
        TextFieldCitizenTelephone.setText(tlf);
    }
    
    public String getCitizenEMail(){
        return TextFieldCitizenEMail.getText();
    }
    
    public void setCitizenEMail(String email){
        TextFieldCitizenEMail.setText(email);
    }
    
    public String getCitizenAddressStreet(){
        return TextFieldCitizenAddressStreet.getText();
    }
    
    public void setCitizenAddressStreet(String street){
        TextFieldCitizenAddressStreet.setText(street);
    }
    
    public String getCitizenAddressNumber(){
        return TextFieldCitizenAddressNumber.getText();
    }
    
    public void setCitizenAddressNumber(String number){
        TextFieldCitizenAddressNumber.setText(number);
    }
        
    public String getCitizenAddressPostalCode(){
        return TextFieldCitizenAddressPostalCode.getText();
    }
    
    public void setCitizenAddressPostalCode(String code){
        TextFieldCitizenAddressPostalCode.setText(code);
    }
    
    public String getCitizenAddressCity(){
        return TextFieldCitizenAddressCity.getText();
    }
    
    public void setCitizenAddressCity(String city){
        TextFieldCitizenAddressCity.setText(city);
    }
    
    public String getCitizenAddressCountry(){
        return TextFieldCitizenAddressCountry.getText();
    }
    
    public void setCitizenAddressCountry(String country){
        TextFieldCitizenAddressCountry.setText(country);
    }
}
