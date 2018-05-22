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

import java.io.File;
import java.util.Iterator;
import java.util.Scanner;

public class SYSLogController
{

    public TextArea textAreaLog;

    public void initialize()
    {
        for (int i = 0; i < GUIFacade.business.getSYSLogText().size(); i++)
        textAreaLog.appendText(GUIFacade.business.getSYSLogText().get(i) + " ");

    }
}
