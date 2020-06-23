package School_Project;
import java.io.FileWriter; 
public class writeToFile  
{
    String path = "";
    writeToFile(String data) 
    {
        path = data; 
    }
    void write(String data)
    {
        try
        {
            FileWriter fw = new FileWriter(path, true); 
            fw.write(data); 
            fw.close(); 
        } catch(Exception e)
        {
            System.out.println(e); 
        }
        System.out.println("Success, you can find the file at: " + path); 
    }
    
}