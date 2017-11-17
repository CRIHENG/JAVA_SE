package Java_IO;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by githu on 2017/11/17.
 */
public class LearnFileWriter {
    @Test
    public  void demo01(){
        FileWriter  writer=null;
        
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
