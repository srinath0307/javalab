import java.io.File;
import java.util.Scanner;

public class HelloFile {

    public static void main(String[] args) throws Exception {        
        Scanner sc = new Scanner(System.in);
        String filePath = sc.nextLine().trim();       
        FileInfoPrinter.printDetails(filePath);        
    }


}//end of class Hello

/*public class Hello {

    public static void main(String[] args) throws Exception {        
        Scanner sc = new Scanner(System.in);
        String filePath = sc.nextLine().trim();       
        FileInfoPrinter.printDetails(filePath);        
    }


}//end of class Hello*/

public static void printDetails(String filePath) throws Exception
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

