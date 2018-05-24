package Udred.GUI;

import Udred.Acq.ICase;
import Udred.Acq.IPatient;
import Udred.Acq.IUser;
import Udred.Business.Address;
import Udred.Business.Case;
import Udred.Business.InquiryInformation;
import Udred.Business.Patient;
import Udred.Business.User;
import Udred.GUI.CaseControl.Controller;
import Udred.GUI.CaseControl.CustomControl;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

public class CaseEditorController {

    public ChoiceBox cbxStatus;
    public TextField textFieldCaseID;
    public DatePicker datePickerCaseCreated;
    public DatePicker datePickerCaseClosed;
    public TitledPane tlpCaseworker;
    public TitledPane tlpCaseInformation;
    public TitledPane tlpCaseInformation2;
    public TitledPane tlpMeeting;

    public VBox vBoxCitizens;
    public VBox vBoxCaseWorkers;
    public VBox vBoxCaseInformation;
    public VBox vBoxMeetings;
    @FXML
    private Button btnAddCitizen;
    @FXML
    private Button btnAddCase;

    @FXML
    private void addCase(ActionEvent event) {
        CustomControl c = (CustomControl) vBoxCitizens.getChildren().get(0);
        Address address = new Address("TESTVEJ", "00TEST", "TestBy", 0000);
        IPatient patient = new Patient(c.getController().getTextFieldCitizenFirstName().getText() + " " + 
                                       c.getController().getTextFieldCitizenLastName().getText(), 
                                        Integer.parseInt(c.getController().getTextFieldCitizenCPR().getText()), 
                                        Integer.parseInt(c.getController().getTextFieldCitizenTelephone().getText()), address);
        int caseID = Integer.parseInt(textFieldCaseID.getText());
        String status = cbxStatus.getValue().toString();
        boolean consent = true;
        String caseType = "social";
        IUser caseWorker =  GUIFacade.business.getActiveUser();
        InquiryInformation inquiryInformation = new InquiryInformation("Dette er en test sag");
        ICase currentCase = new Case(caseID, (Patient) patient, status, consent, caseType, (User) caseWorker, inquiryInformation);
        patient.savePatient(patient);
        currentCase.save(currentCase);
    }


    public enum Status {
        OPEN("Åben"),
        CLOSED("Lukket"),
        UNDEFINED("Afventer sammentykke");

        private String caseType;

        Status(String caseType) {
            this.caseType = caseType;
        }

        @Override
        public String toString() {
            return caseType;
        }
    }

    public void initialize() throws IOException {


        cbxStatus.getItems().setAll(Status.values());

//        CustomControl cstCitizen = new CustomControl();
//        cstCitizen.getLabel().setText("Karsten Breddahl Laursen");
//        Node citizenNode = (Node)FXMLLoader.load(getClass().getResource("/Udred/caseTemplates/Citizen.fxml"));
//        cstCitizen.setContent(citizenNode);
//        vBoxCitizens.getChildren().add(cstCitizen);
//
//
//        CustomControl cstCaseWorker = new CustomControl();
//        cstCaseWorker.getLabel().setText("Jenny Corvenious Jensen");
//        Node caseWorkerNode = (Node)FXMLLoader.load(getClass().getResource("/Udred/caseTemplates/CaseWorker.fxml"));
//        cstCaseWorker.setContent(caseWorkerNode);
//        vBoxCaseWorkers.getChildren().add(cstCaseWorker);
//
//
//        CustomControl cstCaseInformation = new CustomControl();
//        cstCaseInformation.getLabel().setText("Information fra Sygehus");
//        Node caseInformationNode = (Node)FXMLLoader.load(getClass().getResource("/Udred/caseTemplates/CaseInformation.fxml"));
//        cstCaseInformation.setContent(caseInformationNode);
//        vBoxCaseInformation.getChildren().add(cstCaseInformation);
//
//        CustomControl cstCaseInformation2 = new CustomControl();
//        cstCaseInformation2.getLabel().setText("Midligtidlig addresse ændring");
//        Node caseInformationNode2 = (Node)FXMLLoader.load(getClass().getResource("/Udred/caseTemplates/CaseInformation.fxml"));
//        cstCaseInformation2.setContent(caseInformationNode2);
//        vBoxCaseInformation.getChildren().add(cstCaseInformation2);
//
//        CustomControl cstMeeting = new CustomControl();
//        cstMeeting.getLabel().setText("04/05-2018");
//        Node meetingNode = (Node)FXMLLoader.load(getClass().getResource("/Udred/caseTemplates/Meeting.fxml"));
//        cstMeeting.setContent(meetingNode);
//        vBoxMeetings.getChildren().add(cstMeeting);

        datePickerCaseCreated.valueProperty().addListener((observable, oldValue, newValue) -> GUIFacade.changesSaved = false);
        datePickerCaseClosed.valueProperty().addListener((observable, oldValue, newValue) -> GUIFacade.changesSaved = false);


        // translate the titledpane arrow and header so that the arrow is displayed to right of the header.
//        StackPane connectivityArrow = (StackPane) tlpCitizen.lookup(".arrow");
//        connectivityArrow.translateXProperty().bind(
//                tlpCitizen.widthProperty().subtract(connectivityArrow.widthProperty().multiply(2))
//        );
//        Pane connectivityTitle = (Pane) tlpCitizen.lookup(".header");
//        connectivityTitle.translateXProperty().bind(
//                connectivityArrow.widthProperty().negate()
//        );
    }

    @FXML
    public void addCitizen() throws IOException {
        CustomControl cst = new CustomControl();
        cst.getLabel().setText("Ny Borger");
        //Node citizen = (Node)FXMLLoader.load(getClass().getResource("/Udred/GUI/CaseControl/Citizen.fxml"));
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Udred/GUI/CaseControl/Citizen.fxml"));
        Node citizen = (Node)loader.load();
        Controller c = loader.getController();
        cst.setController(c);
        
        cst.setContent(citizen);
        
        vBoxCitizens.getChildren().add(cst);
    }

    @FXML
    public void addCaseWorker() throws IOException {
        CustomControl cst = new CustomControl();
        cst.getLabel().setText("Ny Sagsbehandler");
        //Node citizen = (Node)FXMLLoader.load(getClass().getResource("/Udred/GUI/CaseControl/CaseWorker.fxml"));

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Udred/GUI/CaseControl/CaseWorker.fxml"));
        Node citizen = (Node)loader.load();
        Controller c = loader.getController();
        cst.setController(c);

        cst.setContent(citizen);
        vBoxCaseWorkers.getChildren().add(cst);
    }
    @FXML
    public void addCaseInformation() throws IOException {
        CustomControl cst = new CustomControl();
        cst.getLabel().setText("Ny Information");
        //Node citizen = (Node)FXMLLoader.load(getClass().getResource("/Udred/GUI/CaseControl/CaseInformation.fxml"));
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Udred/GUI/CaseControl/CaseInformation.fxml"));
        Node citizen = (Node)loader.load();
        Controller c = loader.getController();
        cst.setController(c);
        
        cst.setContent(citizen);
        vBoxCaseInformation.getChildren().add(cst);
    }
    @FXML
    public void addMeeting() throws IOException {
        CustomControl cst = new CustomControl();
        cst.getLabel().setText("Nyt Møde");
        //Node citizen = (Node)FXMLLoader.load(getClass().getResource("/Udred/GUI/CaseControl/Meeting.fxml"));
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Udred/GUI/CaseControl/Meeting.fxml"));
        Node citizen = (Node)loader.load();
        Controller c = loader.getController();
        cst.setController(c);
        
        cst.setContent(citizen);
        vBoxMeetings.getChildren().add(cst);
    }

    public void setCaseID(String caseID) {
        textFieldCaseID.setText(caseID);
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
    public void changesRegistered() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText("Look, an Information Dialog");
        alert.setContentText("I have a great message for you!");
    }



}
