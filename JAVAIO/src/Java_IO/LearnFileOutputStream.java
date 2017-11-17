package Java_IO;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by githu on 2017/11/17.
 */
public class LearnFileOutputStream {
    @Test
    public void demo01() throws IOException {
       
        FileInputStream in = null;
        FileOutputStream out=null;
        try {
            in=new FileInputStream("E:\\内功\\JAVA_SE\\JAVAIO\\src\\Java_IO\\LearnFileInputStream.java");
            out= new FileOutputStream("E:\\内功\\JAVA_SE\\JAVAIO\\src\\Java_IO\\LearnFileInputStreamCopy.java");
            
        }catch (FileNotFoundException e){
            System.out.println(" file is not found  ");
        }
        int readFile=0;
        while ((readFile=in.read())!=-1){
            out.write(readFile);
        }
        in.close();
        out.close();
    }
}
