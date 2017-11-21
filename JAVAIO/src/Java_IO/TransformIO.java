package Java_IO;

import org.junit.Test;

import java.io.*;

/**
 * Created by githu on 2017/11/21.
 */
public class TransformIO {
    @Test
    public void learnInputStreamReader(){
        
        
    }
    @Test
    public void learnOutputStreamWriter(){
       try {
          
           InputStreamReader isr=new InputStreamReader(new FileInputStream("E:\\内功\\JAVA_SE\\JAVAIO\\src\\Java_IO\\BufferIO.java"));
           BufferedReader br=new BufferedReader(isr);
           OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("E:\\内功\\JAVA_SE\\JAVAIO\\src\\Java_IO\\text.txt"));
           BufferedWriter bw=new BufferedWriter(osw);
            String s="";
            while ((s=br.readLine())!=null){
                bw.write(s);
                bw.newLine();
           }
           bw.flush();
           bw.close();
           br.close();
       }catch (FileNotFoundException e){
           System.out.println("无法找到文件");
       }catch (IOException e){
           System.out.println("处理文件异常");
       }
       

    }
}
