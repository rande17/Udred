package Udred.GUI;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.util.Duration;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoginWindowController {
    public Button btnLogin;
    public Button btnLoginAdmin;
    public TextField textFieldUsername;
    public PasswordField passwordFieldPassword;
    public CheckBox checkBoxRememberLogin;

    public void initialize() throws IOException
    {
        Properties prop = new Properties();
        InputStream input = null;

//        try {
//
//            input = getClass().getClassLoader().getResourceAsStream("Udred/resources/config.properties");
//
//            // load a properties file
//            prop.load(input);
//
//            // get the property value and print it out
//            textFieldUsername.setText(prop.getProperty("user"));
//
//            if (prop.getProperty("remberLogin").contains("true")) {
//                checkBoxRememberLogin.selectedProperty().setValue(true);
//                passwordFieldPassword.setText(prop.getProperty("password"));
//            }
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        } finally {
//            if (input != null) {
//                try {
//                    input.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }

        btnLogin.setOnMouseClicked((event) ->
        {
            if (checkBoxRememberLogin.selectedProperty().getValue()) {
                prop.setProperty("rememberLogin", "true");
                prop.setProperty("user", textFieldUsername.getText());
                prop.setProperty("password", passwordFieldPassword.getText());

            } else {
                prop.setProperty("rememberLogin", "false");
                prop.setProperty("user", textFieldUsername.getText());
                prop.setProperty("password", "");
            }

            GUIFacade.business.writeLoginInfoToSyslog();
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();

            //region Just for fun
            //Main.Rainbow.setOpacity(0);
            //Main.Rainbow.show();
            //Main.rainbowController.start();
            GUIFacade.Window.setTitle("Sensum Udred - " + textFieldUsername.getText());
            GUIFacade.Window.show();
            
//            Timeline timelineFadeOut = new Timeline();
//            timelineFadeOut.setCycleCount(Timeline.INDEFINITE);
//            timelineFadeOut.getKeyFrames().add(
//                    new KeyFrame(new Duration(10), new EventHandler<ActionEvent>() {
//                        public void handle(ActionEvent t) {
//                            GUIFacade.Rainbow.setOpacity(GUIFacade.Rainbow.getOpacity()-0.01);
//                            if(GUIFacade.Rainbow.getOpacity()<0.01){//30 divided by 0.01 equals 3000 so you take the duration and divide it be the opacity to get your transition time in milliseconds
//
//                                GUIFacade.Rainbow.hide();
//                                timelineFadeOut.stop();
//
//                                GUIFacade.Window.setTitle("Sensum Udred - " + textFieldUsername.getText());
//                                GUIFacade.Window.show();
//
//                            }
//                        }}));
//
//
//            Timeline timelineWait= new Timeline();
//            timelineWait.setCycleCount(Timeline.INDEFINITE);
//            timelineWait.getKeyFrames().add(
//                    new KeyFrame(new Duration(5000), new EventHandler<ActionEvent>() {
//                        public void handle(ActionEvent t) {
//
//                                timelineWait.stop();
//                                timelineFadeOut.play();
//
//
//                        }}));
//
//            Timeline timelineFadeIn = new Timeline();
//            timelineFadeIn.setCycleCount(Timeline.INDEFINITE);
//            timelineFadeIn.getKeyFrames().add(
//                    new KeyFrame(new Duration(30), new EventHandler<ActionEvent>() {
//                        public void handle(ActionEvent t) {
//                            GUIFacade.Rainbow.setOpacity(GUIFacade.Rainbow.getOpacity()+0.01);
//                            if(GUIFacade.Rainbow.getOpacity()>0.99){//30 divided by 0.01 equals 3000 so you take the duration and divide it be the opacity to get your transition time in milliseconds
//                                timelineFadeIn.stop();
//                                timelineWait.play();
//
//                            }
//                        }}));
//
//            timelineFadeIn.play();
            //endregion

//            GUIFacade.Window.setTitle("Sensum Udred - " + textFieldUsername.getText());
//            GUIFacade.Window.show();
        });

        btnLoginAdmin.setOnMouseClicked((event) ->
        {
                // Hide this current window (if this is what you want)
                ((Node)(event.getSource())).getScene().getWindow().hide();
                
                // write login information to syslog
                
                
                GUIFacade.Admin.show();
        });
    }
}
