package Java_IO;

import org.junit.Test;

import java.io.*;

/**
 * Created by githu on 2017/11/20.
 */
public class BufferIO {
    //处理流
    //buffered 原理是:输入流字节存入到一个byte数组中达默认给这个数组一个长度来存放字节，然后在做处理
    @Test
    public void learnBufferedInputStream() throws IOException {
        FileInputStream fis = null;
        BufferedInputStream bis = null;

        try {
            fis = new FileInputStream("E:\\内功\\JAVA_SE\\JAVAIO\\src\\Java_IO\\LeaarnBufferedInputStream.java");
            bis = new BufferedInputStream(fis);
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在");
        } catch (IOException e) {
            System.out.println("文件处理失败");
        }
        int b = 0;
        while ((b=bis.read())!=-1){
            
            //这里会出现乱码是因为inputstream字节流一个字节一个字节的读取
            //中文是三个字节一个字符
            System.out.print((char)b);
        }
      bis.close();

    }
    @Test
    public void learnBufferReader(){
        try {
            FileReader fr=new FileReader("E:\\内功\\JAVA_SE\\JAVAIO\\src\\Java_IO\\BufferIO.java");
            BufferedReader br=new BufferedReader(fr);
            String s="";
            while((s=br.readLine())!=null){
                System.out.println(s);
            }
           br.close();
        }catch (FileNotFoundException e){
            System.out.println("找不到指定文件");
        }catch (IOException e){
            System.out.println("读取文件异常");
        }
        
        
    }
    @Test
    public void learnBufferWriter(){
       try {
           BufferedWriter bw=new BufferedWriter(new FileWriter("E:\\内功\\JAVA_SE\\JAVAIO\\src\\Java_IO\\BufferIOCoppy.java"));
           BufferedReader br=new BufferedReader(new FileReader("E:\\内功\\JAVA_SE\\JAVAIO\\src\\Java_IO\\BufferIO.java"));
           
         String str ="";
           while ((str=br.readLine())!=null){
               bw.write(str);
           }
           bw.flush();
           bw.close();
           br.close();
       }catch (FileNotFoundException e){
           System.out.println("无法找到文件");
           
       }catch (IOException e){
           System.out.println("文件处理失败");
       }
    }
}
