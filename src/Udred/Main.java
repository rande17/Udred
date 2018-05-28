package Udred;

import Udred.Acq.*;
import Udred.Business.BusinessFacade;
import Udred.Data.DataFacade;
import Udred.GUI.*;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;

/**
 *
 * @author JogGez
 */
public class Main extends Application
{
    
    
    static IBusinessFacade business;
    static IDataFacade data;
    static IGUIFacade gui;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        business    = new BusinessFacade();
        data        = new DataFacade();
        gui         = new GUIFacade();
        
        gui.injectBusiness(business);
        business.injectDataFacade(data);
        
        launch(args);
        
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        gui.start(primaryStage);
    }
}
