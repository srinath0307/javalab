import java.io.*;

public class FileHandling {

    public static void main(String[] args) throws Exception {        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filePath = br.readLine();       
        FileInfoPrinter.printDetails(filePath);        
    }

}

class FileInfoPrinter{

public static void printDetails(String filePath)  throws Exception
{

    try
    {
            File f=new File(filePath);
            BufferedReader b=new BufferedReader(new FileReader(f));
            
            System.out.println("Present");
            System.out.println(b.readLine());
          
    }
    catch(Exception e)
    {
        System.out.println("NotPresent");
    }

}
}