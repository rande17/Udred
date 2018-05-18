package Udred;


import Udred.Data.SYSLog;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.stage.Window;

public class AdminWindowController {


    public GridPane gridPaneMain;

    public void initialize() {

    }
    
    public void openSYSLog(ActionEvent actionEvent) throws Exception
    {
        // Setup Main Window
        Stage Window = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SYSLog.fxml"));
        Parent root = loader.load();

        //        primaryStage.getIcons().add(new Image(File.pathSeparator+"Udred"+File.pathSeparator+"EG.png"));
        Window.getIcons().add(new Image(getClass().getResource("/Udred/resources/images/EG.png").toExternalForm()));

        Scene s = new Scene(root);
        Window.setScene(s);
        Window.show();
    }
}
