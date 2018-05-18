
package Acq;

import java.io.IOException;
import java.sql.SQLException;
import javafx.stage.Stage;

/**
 *
 * @author JogGez
 */
public interface IGUIFacade 
{
    
        void start(Stage primaryStage)throws Exception ;
        
        void initialize() throws IOException, SQLException;
        
        void injectBusiness(IBusinessFacade bus);

}
