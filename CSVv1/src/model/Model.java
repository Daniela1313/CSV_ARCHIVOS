package model;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniela Garcia Rios
 */


public class Model {
  
    private String message;
    private String Path;
    private ResultSet rs;

    public String getPath(){
        System.out.println("getPath");
        return Path;
    }
   

    public void setPath(String path) {
        System.out.println("setPath");
        this.Path = path;
    }

    public String getMessage() {
        System.out.println("getMessage");
        return message;
    }

    public void setMessage(String message) {
        System.out.println("setMessage");
        this.message = message;
    }
    
    
    public void writeFile(String path, String message){
        try{
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file, true);
            try(PrintWriter printWriter = new PrintWriter(fileWriter)){
                //System.out.println("@@@@@@@@@@@@");
                System.out.println(message);
                printWriter.println(message);
                printWriter.close();
            }        
        }catch(FileNotFoundException err){
           System.out.println("File not found:" +err.getMessage());
        }catch(IOException err){
            System.err.println("error "+err.getMessage());
        }
        
    }
    
}


