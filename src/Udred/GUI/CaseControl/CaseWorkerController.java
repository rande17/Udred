package Udred.GUI.CaseControl;

import Udred.GUI.GUIFacade;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author JogGez
 */
public class CaseWorkerController implements Initializable
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
    
    public String getCaseWorkerCPR(){
        return TextFieldCaseWorkerCPR.getText();
    }
    
    public void setCaseWorkerCPR(String CPR){
        TextFieldCaseWorkerCPR.setText(CPR);
    }
    
    public String getCaseWorkerFirstName(){
        return TextFieldCaseWorkerFirstName.getText();
    }
    
    public void setCaseWorkerFirstName(String fname){
        TextFieldCaseWorkerFirstName.setText(fname);
    }
    
    public String getCaseWorkerLastName(){
        return TextFieldCaseWorkerLastName.getText();
    }
    
    public void setCaseWorkerLastName(String lname){
        TextFieldCaseWorkerLastName.setText(lname);
    }
    
    public String getCaseWorkerTelephone(){
        return TextFieldCaseWorkerTelephone.getText();
    }
    
    public void setCaseWorkerTelephone(String tlf){
        TextFieldCaseWorkerTelephone.setText(tlf);
    }
    
    public String getCaseWorkerEMail(){
        return TextFieldCaseWorkerEMail.getText();
    }
    
    public void setCaseWorkerEMail(String email){
        TextFieldCaseWorkerEMail.setText(email);
    }
    
    public String getCaseWorkerAddressStreet(){
        return TextFieldCaseWorkerAddressStreet.getText();
    }
    
    public void setCaseWorkerAddressStreet(String street){
        TextFieldCaseWorkerAddressStreet.setText(street);
    }
    
    public String getCaseWorkerAddressNumber(){
        return TextFieldCaseWorkerAddressNumber.getText();
    }
    
    public void setCaseWorkerAddressNumber(String number){
        TextFieldCaseWorkerAddressNumber.setText(number);
    }
        
    public String getCaseWorkerAddressPostalCode(){
        return TextFieldCaseWorkerAddressPostalCode.getText();
    }
    
    public void setCaseWorkerAddressPostalCode(String code){
        TextFieldCaseWorkerAddressPostalCode.setText(code);
    }
    
    public String getCaseWorkerAddressCity(){
        return TextFieldCaseWorkerAddressCity.getText();
    }
    
    public void setCaseWorkerAddressCity(String city){
        TextFieldCaseWorkerAddressCity.setText(city);
    }
    
    public String getCaseWorkerAddressCountry(){
        return TextFieldCaseWorkerAddressCountry.getText();
    }
    
    public void setCaseWorkerAddressCountry(String country){
        TextFieldCaseWorkerAddressCountry.setText(country);
    }
}
