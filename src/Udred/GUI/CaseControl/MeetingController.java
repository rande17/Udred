package Udred.GUI.CaseControl;

import Udred.GUI.GUIFacade;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author JogGez
 */
public class MeetingController implements Initializable
{
    @FXML
    private DatePicker datePickerMeetingDate;
    @FXML
    private TextField textFieldMeetingSubject;
    @FXML
    private TextField textFieldMeetingAddressStreet;
    @FXML
    private TextField textFieldMeetingAddressPostalCode;
    @FXML
    private TextField textFieldMeetingAddressCountry;
    @FXML
    private TextField textFieldMeetingAddressCity;
    @FXML
    private TextField textFieldMeetingAddressNumber;

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
    
    public String getMeetingSubject()
    {
        return textFieldMeetingSubject.getText();
    }

    public void setMeetingSubject(String subject)
    {
        this.textFieldMeetingSubject.setText(subject);
    }
    
    public LocalDate getMeetingDate()
    {
        return datePickerMeetingDate.getValue();
    }

    public void setMeetingDate(LocalDate date)
    {
        this.datePickerMeetingDate.setValue(date);
    }
    
    public String getMeetingAddressStreet()
    {
        return textFieldMeetingAddressStreet.getText();
    }

    public void setMeetingAddressStreet(String street)
    {
        this.textFieldMeetingAddressStreet.setText(street);
    }
    
    public String getMeetingAddressNumber()
    {
        return textFieldMeetingAddressNumber.getText();
    }

    public void setMeetingAddressNumber(String number)
    {
        this.textFieldMeetingAddressNumber.setText(number);
    }
    
    public String getMeetingAddressPostalCode()
    {
        return textFieldMeetingAddressPostalCode.getText();
    }

    public void setMeetingAddressPostalCode(String code)
    {
        this.textFieldMeetingAddressPostalCode.setText(code);
    }
    
    public String getMeetingAddressCity()
    {
        return textFieldMeetingAddressCity.getText();
    }

    public void setMeetingAddressCity(String city)
    {
        this.textFieldMeetingAddressCity.setText(city);
    }
        
    public String getMeetingAddressCountry()
    {
        return textFieldMeetingAddressCountry.getText();
    }

    public void setMeetingAddressCountry(String country)
    {
        this.textFieldMeetingAddressCountry.setText(country);
    }
    
}
