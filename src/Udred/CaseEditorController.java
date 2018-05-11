package Udred;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.*;
import Udred.caseTemplates.CustomControl;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

import java.io.File;
import java.io.IOException;

public class CaseEditorController {

    public ChoiceBox cbxStatus;
    public TextField textFieldCaseID;
    public DatePicker datePickerCaseCreated;
    public DatePicker datePickerCaseClosed;
    @FXML
    private TitledPane tlpCitizen;
    public TitledPane tlpCaseworker;
    public TitledPane tlpCaseInformation;
    public TitledPane tlpCaseInformation2;
    public TitledPane tlpMeeting;

    public VBox vBoxCitizens;
    public VBox vBoxCaseWorkers;
    public VBox vBoxCaseInformation;
    public VBox vBoxMeetings;


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

    @FXML
    public void initialize() throws IOException {


        cbxStatus.getItems().setAll(Status.values());

        CustomControl cstCitizen = new CustomControl();
        cstCitizen.getLabel().setText("Karsten Breddahl Laursen");
        Node citizenNode = (Node)FXMLLoader.load(getClass().getResource("/Udred/caseTemplates/Citizen.fxml"));
        cstCitizen.setContent(citizenNode);
        vBoxCitizens.getChildren().add(cstCitizen);


        CustomControl cstCaseWorker = new CustomControl();
        cstCaseWorker.getLabel().setText("Jenny Corvenious Jensen");
        Node caseWorkerNode = (Node)FXMLLoader.load(getClass().getResource("/Udred/caseTemplates/CaseWorker.fxml"));
        cstCaseWorker.setContent(caseWorkerNode);
        vBoxCaseWorkers.getChildren().add(cstCaseWorker);


        CustomControl cstCaseInformation = new CustomControl();
        cstCaseInformation.getLabel().setText("Information fra Sygehus");
        Node caseInformationNode = (Node)FXMLLoader.load(getClass().getResource("/Udred/caseTemplates/CaseInformation.fxml"));
        cstCaseInformation.setContent(caseInformationNode);
        vBoxCaseInformation.getChildren().add(cstCaseInformation);

        CustomControl cstCaseInformation2 = new CustomControl();
        cstCaseInformation2.getLabel().setText("Midligtidlig addresse ændring");
        Node caseInformationNode2 = (Node)FXMLLoader.load(getClass().getResource("/Udred/caseTemplates/CaseInformation.fxml"));
        cstCaseInformation2.setContent(caseInformationNode2);
        vBoxCaseInformation.getChildren().add(cstCaseInformation2);

        CustomControl cstMeeting = new CustomControl();
        cstMeeting.getLabel().setText("04/05-2018");
        Node meetingNode = (Node)FXMLLoader.load(getClass().getResource("/Udred/caseTemplates/Meeting.fxml"));
        cstMeeting.setContent(meetingNode);
        vBoxMeetings.getChildren().add(cstMeeting);

        datePickerCaseCreated.valueProperty().addListener((observable, oldValue, newValue) -> Main.changesSaved = false);
        datePickerCaseClosed.valueProperty().addListener((observable, oldValue, newValue) -> Main.changesSaved = false);


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

    public void addCitizen() throws IOException {
        CustomControl cst = new CustomControl();
        cst.getLabel().setText("Ny Borger");
        Node citizen = (Node)FXMLLoader.load(getClass().getResource("/Udred/caseTemplates/Citizen.fxml"));
        cst.setContent(citizen);
        vBoxCitizens.getChildren().add(cst);
    }

    public void addCaseWorker() throws IOException {
        CustomControl cst = new CustomControl();
        cst.getLabel().setText("Ny Sagsbehandler");
        Node citizen = (Node)FXMLLoader.load(getClass().getResource("/Udred/caseTemplates/CaseWorker.fxml"));
        cst.setContent(citizen);
        vBoxCaseWorkers.getChildren().add(cst);
    }
    public void addCaseInformation() throws IOException {
        CustomControl cst = new CustomControl();
        cst.getLabel().setText("Ny Information");
        Node citizen = (Node)FXMLLoader.load(getClass().getResource("/Udred/caseTemplates/CaseInformation.fxml"));
        cst.setContent(citizen);
        vBoxCaseInformation.getChildren().add(cst);
    }
    public void addMeeting() throws IOException {
        CustomControl cst = new CustomControl();
        cst.getLabel().setText("Nyt Møde");
        Node citizen = (Node)FXMLLoader.load(getClass().getResource("/Udred/caseTemplates/Meeting.fxml"));
        cst.setContent(citizen);
        vBoxMeetings.getChildren().add(cst);
    }

    public void setCaseID(String caseID) {
        textFieldCaseID.setText(caseID);
    }

    public void mouseEnter(MouseEvent mouseEvent) {
        Main.MainController.mouseEnter(mouseEvent);
    }

    public void mouseExit(MouseEvent mouseEvent) {
        Main.MainController.mouseExit(mouseEvent);
    }

    public void changesRegistered() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText("Look, an Information Dialog");
        alert.setContentText("I have a great message for you!");
    }



}
