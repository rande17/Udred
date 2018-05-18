package Udred.Data;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SYSLog
{

    public SYSLog(String filename)
    {
        this.textField = textField;
        this.filename = filename;
    }


    public void writeText(ArrayList<String> sYSList)
    {
        //checks if file exists, if file doesn't exist it creates the file in our else statement.
        if (fileExists(filename))
        {
            String toFile = "";
            for (String s: sYSList){
                toFile.concat(s);
            }


            try
            {
                PrintWriter out = new PrintWriter(filename);
                {
                    out.println(textField);
                }

                out.flush();
                out.close();

            } catch (FileNotFoundException e)
            {
                e.printStackTrace();
            }
        } else
        {
            createFile(filename);

            this.writeText(sYSList);
        }
    }

    public ArrayList<String> readFromFile()
    {
        ArrayList<String> sYSList = new ArrayList<>();
        try
        {
            Scanner input = new Scanner(new File(filename));

            while (input.hasNextLine())
            {
                sYSList.add(input.next());
            }
            input.close(); 
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        return sYSList;
        
    }

    private boolean fileExists(String filename)
    {
        return new File(filename).exists() && new File(filename).isFile();
    }

    private boolean createFile(String filename)
    {
        try
        {
            File file = new File(filename);
            return file.createNewFile();

        } catch (IOException e)
        {
            e.printStackTrace();
        }
        return false;
    }
}
