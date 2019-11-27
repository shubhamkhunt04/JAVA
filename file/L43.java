 import java.io.File;
import java.io.IOException;
class L43
{
    public static void main(String[] args)throws IOException{
        
        File f1=new File("E:\\filep\\name1.txt"); 
        f1.createNewFile();
        System.out.println("exist file:"+f1.exists());
        System.out.println("write :"+f1.canWrite());
        System.out.println("size  :"+f1.length()+" bytes");
        System.out.println("name :"+f1.getName());
        f1.delete();
        System.out.println("exist file:"+f1.exists());
    }
}