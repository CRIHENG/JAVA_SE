package Java_IO;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by githu on 2017/11/17.
 */
public class LearnFileReader {
    
    @Test
    public void demo01(){
        FileReader reader=null;
     try {
         reader=new FileReader("E:\\内功\\JAVA_SE\\JAVAIO\\src\\Java_IO\\LearnFileReader.java");
            int b =0;
         while((b=reader.read())!=-1){
             System.out.print((char)b);
         }
                 
     }catch (FileNotFoundException e){
         System.out.println("找不到指定文件");
     }catch (IOException e){
         System.out.println("异常");
     }
}
}
