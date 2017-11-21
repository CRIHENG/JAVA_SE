package Java_IO;

import org.junit.Test;

import java.io.*;


public class DataIOandByteArrayIO {
    @Test
    public void testDataIoAndByteArrayIO(){

        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        DataOutputStream  dos=new DataOutputStream(baos);
        try {
            dos.writeDouble(Math.random());
            dos.writeBoolean(true);
            ByteArrayInputStream bais=new ByteArrayInputStream(baos.toByteArray());
            DataInputStream    dis=new DataInputStream(bais);
            //先写先读
            System.out.print(dis.readDouble());
            System.out.print(dis.readBoolean());
            dos.close(); dis.close();

        }catch (IOException e){
            e.printStackTrace();

        }


    }
}
