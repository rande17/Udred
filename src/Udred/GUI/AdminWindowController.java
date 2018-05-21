package Udred.GUI;


import Acq.IUser;
import java.sql.SQLException;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.GridPane;
import javafx.util.StringConverter;
import javafx.util.converter.IntegerStringConverter;

public class AdminWindowController {


    public GridPane gridPaneMain;
    @FXML
    private TableView<IUser> tabelViewUsers;
    @FXML
    private TableColumn<IUser, String> colUsername;
    @FXML
    private TableColumn<IUser, Integer> colWorkerID;
    @FXML
    private TableColumn<IUser, Integer> colAccessLevel;
    @FXML
    private Button buttonAddUser;
    @FXML
    private Button buttonRemoveUser;

    public void initialize() throws SQLException {
            GUIFacade.getAllUsers();
        
            colUsername.setCellValueFactory(new PropertyValueFactory<>("userName"));
            colUsername.setCellFactory(TextFieldTableCell.<IUser> forTableColumn());
            
            colUsername.setOnEditCommit((CellEditEvent<IUser, String> event) -> {
            TablePosition<IUser, String> pos = event.getTablePosition();
 
            String newFullName = event.getNewValue();
 
            int row = pos.getRow();
            IUser person = event.getTableView().getItems().get(row);
 
            person.setUserName(newFullName);
            });
             
             

            colWorkerID.setCellValueFactory(new PropertyValueFactory<>("workerID"));
            
            colWorkerID.setCellFactory(TextFieldTableCell.forTableColumn(new StringConverter<Integer>(){

                @Override
                public String toString(Integer object) {
                    return object.toString();
                }

                @Override
                public Integer fromString(String string) {
                    return Integer.parseInt(string);
                }

            }));

            colWorkerID.setOnEditCommit((CellEditEvent<IUser, Integer> event) -> {
            TablePosition<IUser, Integer> pos = event.getTablePosition();
 
            int newWorkerID = event.getNewValue();
 
            int row = pos.getRow();
            IUser person = event.getTableView().getItems().get(row);
 
            person.setWorkerID(newWorkerID);
            });
            

            colAccessLevel.setCellValueFactory(new PropertyValueFactory<>("accessLevel"));
            
            tabelViewUsers.setItems(GUIFacade.userList);
    }

    @FXML
    private void addUser(ActionEvent event)
    {
        GUIFacade.business.addUser();
    }

    @FXML
    private void removeUser(ActionEvent event)
    {
        GUIFacade.business.removeUser((IUser)tabelViewUsers.getSelectionModel().getSelectedItem());
    }
}
