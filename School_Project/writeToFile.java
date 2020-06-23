package School_Project;
import java.io.FileWriter; 
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class writeToFile  
{
    String path = "";
    writeToFile(String data) 
    {
        System.out.println("Please enter path: ");
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            path = inp.readLine();
           
        } // end of try
        catch(Exception e)
        {
            System.out.println(e);
        }// end of catch. 
    }
    void write(String data)
    {
        try
        {
            FileWriter fw = new FileWriter(path); 
            fw.write(data); 
            fw.close(); 
        } catch(Exception e)
        {
            System.out.println(e); 
        }
        System.out.println("Success, you can find the file at: " + path); 
    }
    
}