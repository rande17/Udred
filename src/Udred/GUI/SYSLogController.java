/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udred.GUI;

/**
 *
 * @author Jonathan
 */

import javafx.scene.control.TextArea;

public class SYSLogController
{

    public TextArea textAreaLog;

    public void initialize()
    {
        // Sets the text from the file, we get from database, readFromFile method
        textAreaLog.setText(GUIFacade.business.getSYSLogText().get(0));
    }
}
