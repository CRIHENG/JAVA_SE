package Java_IO;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by githu on 2017/11/17.
 */
public class CharaterIO {
    
    @Test
    public void  learnFileReader(){
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
    @Test
    public  void learnFileWriter(){
        FileWriter writer=null;

        try {
            writer=new FileWriter("E:\\内功\\JAVA_SE\\JAVAIO\\src\\Java_IO\\code.java");
            for(int i=0; i<50000;i++){
                writer.write(i);
            }
        }catch (FileNotFoundException e){
            System.out.println("系统找不到指定文件");
        }catch (IOException e){
            System.out.println("文件异常");
        }
    }
}
