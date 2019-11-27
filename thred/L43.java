import java.io.file;
import java.io.File;
import java.io.IOException;
class L43
{
    public static void main(String[] args) {
        
        File f1=new File("E:\filep\\name1txt"); 
        f1.createNewFile();
        System.out.println("exist file:"+f1.exists());
        System.out.println("write :"+f1.canWrite());
        System.out.println("size  :"+f1.length());
        System.out.println("name :"+f1.getName();
        
    }
}