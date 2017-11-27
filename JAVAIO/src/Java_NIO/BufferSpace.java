package Java_NIO;

import org.junit.Test;

import java.nio.ByteBuffer;

/**
 * Created by githu on 2017/11/27.
 */
public class BufferSpace {
    
    @Test
    public  void testBuffer01() {
        String test = "abcdefg";
        ByteBuffer bb = ByteBuffer.allocate(1024);
        bb.put(test.getBytes());
        System.out.println("-------------put()--------------");
        System.out.println(bb.position());
        System.out.println(bb.capacity());
        System.out.println(bb.limit());
        //当切换读模式的position 0  limit 7
        bb.flip();
        System.out.println("-------------flip()--------------");
        System.out.println(bb.position());
        System.out.println(bb.capacity());
        System.out.println(bb.limit());
        
        byte[] bytes=new byte[bb.limit()];
        bb.get(bytes);
        
        System.out.println("-------------get()--------------");
        System.out.println(bb.position());
        System.out.println(bb.capacity());
        System.out.println(bb.limit());
        bb.rewind();
        System.out.println("-------------rewind()--------------");
        System.out.println(bb.position());
        System.out.println(bb.capacity());
        System.out.println(bb.limit());
        
        bb.clear();
        System.out.println("-------------clear()--------------");
        System.out.println(bb.position());
        System.out.println(bb.capacity());
        System.out.println(bb.limit());


    }   
    
    
    @Test
    public void testBuffer02(){

        String test = "abcdefg";
        ByteBuffer bb = ByteBuffer.allocate(1024);
        bb.put(test.getBytes());
        bb.flip();
        byte[] bytes=new byte[bb.limit()];
        bb.get(bytes,0,2);
        System.out.println(new String(bytes,0,2));
        bb.mark();
        System.out.println(bb.position());
        bb.get(bytes,2,2);
        System.out.println(new String(bytes,2,2));
        System.out.println(bb.position());
        bb.reset();
        System.out.println(bb.position());
        if(bb.hasRemaining()) System.out.println(bb.remaining());
    }
}
