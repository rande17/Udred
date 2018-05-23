package Udred.caseTemplates;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author JogGez
 */
public class Controller implements Initializable
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
    
}
