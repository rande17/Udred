package Udred;

import Udred.Business.Case;
import Udred.Business.LogicFacade;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class MainWindowController {

    public GridPane grdMain;
    public Button btnFindCase;
    public Button btnCreateCase;
    public ChoiceBox choiceBoxShow;
    public ListView listViewCases;
    @FXML
    public Label labelStatusBarInformation;
    public TabPane tabPaneMain;
    public GridPane gridPaneChoice;
    public ListView listViewFavorites;

    private ObservableList<String> cases = FXCollections.observableArrayList();

    public void initialize() throws IOException, SQLException {
        choiceBoxShow.getItems().add("Alle");
        choiceBoxShow.getItems().add("Åbne");
        choiceBoxShow.getItems().add("Afventer Samtykke");
        choiceBoxShow.getItems().add("Lukkede");
        choiceBoxShow.getSelectionModel().selectFirst();
        choiceBoxShow.getSelectionModel().selectedItemProperty().addListener((v, oldval,newval) -> choiceBoxSelectionChanged(newval.toString()));

//        listViewCases.getItems().add("151218-131959");
//        listViewCases.getItems().add("101018-080800");
//        listViewCases.getItems().add("050318-160032");
//        listViewCases.getItems().add("250718-123525");
//        listViewCases.getItems().add("010118-094810");
//        listViewCases.getItems().add("220318-103659");
//        listViewCases.getItems().add("050418-083545");
//        listViewCases.getItems().add("050918-160324");
//        listViewCases.getItems().add("191118-123502");
//        listViewCases.getItems().add("190718-101342");
//        listViewCases.getItems().add("060118-142549");
//        listViewCases.getItems().add("250518-080238");
//        listViewCases.getItems().add("290218-115823");
//        listViewCases.getItems().add("081218-091253");
//        listViewCases.getItems().add("120818-135824");
//        listViewCases.getItems().add("250818-112503");
//        listViewCases.getItems().add("030618-153409");
//        listViewCases.getItems().add("270418-120251");
//        listViewCases.getItems().add("070518-094503");
//        listViewCases.getItems().add("040918-075352");
//        listViewCases.getItems().add("220818-145832");
//        listViewCases.getItems().add("030718-105327");
//        listViewCases.getItems().add("090718-142546");
//        listViewCases.getItems().add("050818-115312");
//        listViewCases.getItems().add("230518-152105");
//        listViewCases.getItems().add("110518-080953");
//        listViewCases.getItems().add("241218-121212");
//        listViewCases.getItems().add("311218-235826");

//        listViewCases.getSelectionModel().selectedItemProperty().addListener((v, oldval,newval) -> {
//                    try {
//                        caseNumber = newval.toString();
//                        showCase(new ActionEvent());
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }
//
//        );


        listViewCases.setOnMouseClicked(click -> {

            if (click.getClickCount() == 2) {
                //Use ListView's getSelected Item
                try {
                    Case c = LogicFacade.getInstance().getCase(listViewCases.getSelectionModel().getSelectedItem().toString());
                    
                    
                    showCase(c);
                }catch (IOException e) {
                    e.printStackTrace();
                }
                catch (SQLException ex)
                {
                    Logger.getLogger(MainWindowController.class.getName()).log(Level.SEVERE, null, ex);
                }
                //use this to do whatever you want to. Open Link etc.

                //use this to do whatever you want to. Open Link etc.
            }
        });
        
        cases = FXCollections.observableArrayList(LogicFacade.getInstance().getUserCaseList(""));
        listViewCases.setItems(cases);

//        listViewFavorites.getSelectionModel().selectedItemProperty().addListener((v, oldval,newval) -> {
//                    try {
//                        caseNumber = newval.toString();
//                        showCase(new ActionEvent());
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }
//
//        );

        
        
        listViewFavorites.setOnMouseClicked(click -> {

            if (click.getClickCount() == 2) {
                //Use ListView's getSelected Item
                try {
                    caseNumber = listViewFavorites.getSelectionModel().getSelectedItem().toString();
                    showCase(new Case());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                //use this to do whatever you want to. Open Link etc.
            }
        });

    }

    private void choiceBoxSelectionChanged(String newval) {

    }

    private String caseNumber = "Ny Sag";

    public void showCase(Case c) throws IOException {
        Tab tab = new Tab();
        tab.setText(String.valueOf(c.getCaseID()));
        tab.setOnCloseRequest(e -> {
            TabPane tabPane = tab.getTabPane();
            if (tabPane.getTabs().size() <= 1) {
                // don't allow the last tab to be closed.
//                e.consume();
                gridPaneChoice.setVisible(true);
                return;
            }
        });

//        Pane newLoadedPane = FXMLLoader.load(getClass().getResource("CaseEditor.fxml"));
        FXMLLoader loader = new FXMLLoader(getClass().getResource("CaseEditor.fxml"));
        Pane newLoadedPane = loader.load();
        // Get the Controller from the FXMLLoader
        CaseEditorController controller = loader.getController();
        // Set data in the controller
        controller.setCaseID(String.valueOf(c.getCaseID()));

//        grdMain.getChildren().clear();
//        grdMain.getChildren().add(newLoadedPane);

        tab.setContent(newLoadedPane);
        tabPaneMain.getTabs().add(tab);
        tabPaneMain.getSelectionModel().select(tab);

        gridPaneChoice.setVisible(false);
    }

    public void createCase(ActionEvent event) throws IOException {
        Tab tab = new Tab();
        tab.setText("Ny sag");
        tab.setOnCloseRequest(e -> {
            TabPane tabPane = tab.getTabPane();
            if (tabPane.getTabs().size() <= 1) {
                // don't allow the last tab to be closed.
//                e.consume();
                gridPaneChoice.setVisible(true);
                return;
            }
        });

//        Pane newLoadedPane = FXMLLoader.load(getClass().getResource("CaseEditor.fxml"));
        FXMLLoader loader = new FXMLLoader(getClass().getResource("CaseEditor.fxml"));
        Pane newLoadedPane = loader.load();
        // Get the Controller from the FXMLLoader
        CaseEditorController controller = loader.getController();
        // Set data in the controller
        controller.setCaseID(caseNumber);
//        grdMain.getChildren().clear();
//        grdMain.getChildren().add(newLoadedPane);

        tab.setContent(newLoadedPane);
        tabPaneMain.getTabs().add(tab);
        tabPaneMain.getSelectionModel().select(tab);

        gridPaneChoice.setVisible(false);

        Main.changesSaved = false;
    }



    public void addCaseToFavorites() {
        listViewFavorites.getItems().add(tabPaneMain.selectionModelProperty().get().getSelectedItem().getText());
    }

    public void removeCaseFromFavorites() {
        listViewFavorites.getItems().remove(listViewFavorites.getSelectionModel().getSelectedItem());
    }

    public void showCaseFinder(ActionEvent event) throws IOException {
        Pane newLoadedPane =  FXMLLoader.load(getClass().getResource("CaseFinder.fxml"));
        grdMain.getChildren().clear();
        grdMain.getChildren().add(newLoadedPane);
    }

    public ArrayList<String> statusBarInformation = new ArrayList<>();
    public Integer statusLayer = 0;

    public void mouseEnter(MouseEvent mouseEvent) {
        Node n = (Node) mouseEvent.getSource();
        Main.MainController.labelStatusBarInformation.setText(n.accessibleTextProperty().getValue());
//        labelStatusBarInformation.setText(n.accessibleTextProperty().getValue());

        statusBarInformation.add(n.accessibleTextProperty().getValue());

        statusLayer++;
   }

    public void mouseExit(MouseEvent mouseEvent) {
        Main.MainController.labelStatusBarInformation.setText("");
//        labelStatusBarInformation.setText(n.accessibleTextProperty().getValue());

        statusLayer--;

        if (statusLayer > 0) {
            statusBarInformation.remove(statusBarInformation.size()-1);
            Main.MainController.labelStatusBarInformation.setText(statusBarInformation.get(statusBarInformation.size()-1));
        }
    }

    public void exitApplication() {
        Platform.exit();
//        System.exit(0);
    }


    public void closeCurrentCase(ActionEvent actionEvent) {

        tabPaneMain.getTabs().remove(tabPaneMain.getSelectionModel().getSelectedItem());

        if (tabPaneMain.getTabs().size() < 1) {
            gridPaneChoice.setVisible(true);
        }
    }

    public void logOut(ActionEvent actionEvent) {
        // Hide this current window (if this is what you want)
        Main.Window.close();

        Main.Login.show();
    }

    public void closeAllCases(ActionEvent actionEvent) {
        tabPaneMain.getTabs().clear();
        gridPaneChoice.setVisible(true);
    }
}
