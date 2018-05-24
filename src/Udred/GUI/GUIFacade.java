package Udred.GUI;

import Udred.Acq.*;
import Udred.Data.PostgresHelper;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Optional;

import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class GUIFacade implements IGUIFacade {

    static Stage PreLoader;
    static PreLoaderController preLoaderController;
    static Stage Login;
    static Stage Window;
    public static MainWindowController MainController;
    static Stage Admin;
    static Boolean changesSaved = true;
    
    protected static IBusinessFacade business;

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Setup GUIFacade Window
        Window = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MainWindow.fxml"));
        Parent root = loader.load();
        MainController = loader.getController();

        Window.setTitle("Sensum Udred");
//        primaryStage.getIcons().add(new Image(File.pathSeparator+"Udred"+File.pathSeparator+"EG.png"));
        Window.getIcons().add(new Image(getClass().getResource("/Udred/resources/images/EG.png").toExternalForm()));

        Scene s = new Scene(root, 1000, 800);
        Window.setScene(s);
        Window.setOnCloseRequest(e -> closeProgram());
        Window.show();

        // Setup Admin Window
        Admin = new Stage();
        root = FXMLLoader.load(getClass().getResource("AdminWindow.fxml"));
        Admin.setTitle("Sensum Udred - Admin");
//        primaryStage.getIcons().add(new Image(File.pathSeparator+"Udred"+File.pathSeparator+"EG.png"));
        Admin.getIcons().add(new Image(getClass().getResource("/Udred/resources/images/EG.png").toExternalForm()));
        Admin.setScene(new Scene(root, 800, 600));
        Admin.setOnCloseRequest(e -> closeProgram());

        // Setup Login Window
        Login = new Stage();
        root = FXMLLoader.load(getClass().getResource("LoginWindow.fxml"));
        Login.setTitle("Sensum Udred - Log Ind");
//        primaryStage.getIcons().add(new Image(File.pathSeparator+"Udred"+File.pathSeparator+"EG.png"));
        Login.getIcons().add(new Image(getClass().getResource("/Udred/resources/images/EG.png").toExternalForm()));
        Login.setScene(new Scene(root));
        Login.setOnCloseRequest(e -> closeProgram());
        //Login.show();

        // Setup Rainbow Window
//        PreLoader = new Stage();
//
//        FXMLLoader loader2 = new FXMLLoader(getClass().getResource("PreLoader.fxml"));
//        Parent root2 = loader2.load();
//        preLoaderController = loader2.getController();
//
////        root = FXMLLoader.load(getClass().getResource("Rainbow.fxml"));
//        root2.setStyle("-fx-background-color: transparent ;");
//        PreLoader.initStyle(StageStyle.TRANSPARENT);
//        Scene r = new Scene(root2);
//        r.setFill(null);
//        PreLoader.setScene(r);
//        PreLoader.centerOnScreen();
        //PreLoader.show();
        
        PostgresHelper DB = new PostgresHelper();
        DB.test();
    }
    
    
    private static void closeProgram() {
        if (changesSaved == false) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Gem Ændringer...");
            alert.setHeaderText("Du har oprettet/ændret sager der ikke er blevet gemt");
            alert.setContentText("Gem ændringer?");

            ButtonType buttonTypeOne = new ButtonType("Gem");
            ButtonType buttonTypeTwo = new ButtonType("Gem Ikke");
            ButtonType buttonTypeCancel = new ButtonType("Annuler", ButtonBar.ButtonData.CANCEL_CLOSE);

            alert.getButtonTypes().setAll(buttonTypeOne, buttonTypeTwo, buttonTypeCancel);

            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == buttonTypeOne) {
                // ... user chose "One"
            } else if (result.get() == buttonTypeTwo) {
                // ... user chose "Two"
            } else {
                // ... user chose CANCEL or closed the dialog
            }
        } else {
            System.exit(0);
        }

    }
    
    @Override
    public void injectBusiness(IBusinessFacade bus){
        this.business = bus;
    }

    @Override
    public void initialize() throws IOException, SQLException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ICase getCase(int CaseID){
        try
        {
            return business.getCase(CaseID);
        }
        catch (SQLException ex)
        {
            Logger.getLogger(GUIFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}