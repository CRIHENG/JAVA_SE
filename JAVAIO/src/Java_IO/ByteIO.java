package Java_IO;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 * Created by githu on 2017/11/17.
 */
public class ByteIO {


    //读取文件
    @Test
    public void learnFileinputStream() throws IOException {
        //字节流 一次读一个字节 节点流（）
        FileInputStream in =null;
        
        try {
            in=new FileInputStream("E:\\内功\\JAVA_SE\\JAVAIO\\src\\Java_IO\\LearnFileInputStream.java");
        }catch (FileNotFoundException e){
            System.out.println("找不到指定文件");
        }
        int b =0;
        //read () 如果读完返回-1；
        
        while ((b=in.read())!=-1){
            System.out.print((char)b);
        }
        //关闭流
        in.close();
    }
    @Test
    public void LearnFileOutputStream() throws IOException {

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
