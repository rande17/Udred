package Udred;

import javafx.scene.control.TextArea;

public class SYSLogController
{

    public TextArea textAreaLog;

    public void initialize()
    {
        // Sets the text from the file, we get from database, readFromFile method
        textAreaLog.setText("");

    }
}
