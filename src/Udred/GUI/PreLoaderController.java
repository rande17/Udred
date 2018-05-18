package Udred.GUI;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author JogGez
 */
public class PreLoaderController implements Initializable
{
    @FXML
    private ImageView imageViewUni;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        new Thread(() ->
        {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            Platform.runLater(new Runnable() {
                
                @Override
                public void run() {
                    imageViewUni.getScene().getWindow().hide();

                    GUIFacade.Login.show();
                }
            });
        }).start();
    }    
    
}
