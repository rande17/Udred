/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udred.Acq;

import java.io.IOException;
import java.sql.SQLException;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author niemeijeren
 */
public interface IMainWindowController {

    void addCaseToFavorites();

    void closeAllCases(ActionEvent actionEvent);

    void closeCurrentCase(ActionEvent actionEvent);

    void createCase(ActionEvent event) throws IOException;

    void exitApplication();

    void initialize() throws IOException, SQLException;

    void injectBusiness(IBusinessFacade bus);

    void logOut(ActionEvent actionEvent);

    void mouseEnter(MouseEvent mouseEvent);

    void mouseExit(MouseEvent mouseEvent);

    void removeCaseFromFavorites();

    void showCase(ICase c) throws IOException;

    void showCaseFinder(ActionEvent event) throws IOException;
    
}
