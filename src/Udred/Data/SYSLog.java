/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udred.Data;

/**
 *
 * @author Jonathan
 */
 
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class SYSLog
{
    private String filename;
 
    public SYSLog(String filename)
    {
        this.filename = filename;
    }
 
 
    public void writeText(ArrayList<String> sYSList)
    {
        //checks if file exists, if file doesn't exist it creates the file in our else statement.
        if (fileExists(filename))
        {
            System.err.println(filename);
            String toFile = "";
            for (String s: sYSList){
                toFile.concat(s);
            }
 
            try
            {
                FileWriter out = new FileWriter(filename);
                {
                    out.write(toFile);
                }
                out.flush();
                out.close();
 
            } catch (FileNotFoundException e)
            {
                e.printStackTrace();
            }
            catch (IOException ex)
            {
                Logger.getLogger(SYSLog.class.getName()).log(Level.SEVERE, null, ex);
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
