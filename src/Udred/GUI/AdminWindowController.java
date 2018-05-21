package Udred.GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;

public class AdminWindowController {


    public GridPane gridPaneMain;
    public MenuItem sYSLogButton;

    public void initialize() {

    }
    
    public void openSYSLog (ActionEvent actionEvent) throws Exception
    {
        // Setup Main Window
        Stage Window = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SYSLog.fxml"));
        Parent root = loader.load();
        
//        Window.getIcons().add(new Image(getClass().getResource("/Udred/resource/images/EG.png").toExternalForm()));
                
        Scene s = new Scene(root);
        Window.setScene(s);
        Window.show();
    }
}
