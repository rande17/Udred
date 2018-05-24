
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
    
    /**
     *
     * @param primaryStage
     * @throws Exception
     */
    void start(Stage primaryStage)throws Exception ;
        
    /**
     *
     * @throws IOException
     * @throws SQLException
     */
    void initialize() throws IOException, SQLException;
        
    /**
     *
     * @param bus
     */
    void injectBusiness(IBusinessFacade bus);
        
    /**
     *
     * @param CaseID
     * @return
     */
    ICase getCase(int CaseID);

}
