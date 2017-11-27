package Java8.Interface;

import org.junit.Test;

/**
 * Created by githu on 2017/11/27.
 * 
 * 
 * 
 * java 8 新特性 当接口 类方法 方法名称相同时，
 * 
 * 那么类比接口有限的原则；会调用类对的方法
 * 如下 job01
 * 
 */
public class Jober {
    
    @Test
    public void job01(){
        MyClass02 class02=new MyClass02();
        //MyClass01   MyInterface01 MyInterface02 方法名字相同
        class02.getName();
        
        
    }
    @Test
    public void job02(){
        
        MyClass03 class03=new MyClass03();
        System.out.println(class03.getName());
        
    }
}
