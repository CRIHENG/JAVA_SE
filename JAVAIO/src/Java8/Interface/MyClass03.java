package Java8.Interface;

/**
 * Created by githu on 2017/11/27.
 */
public class MyClass03 implements MyInterface01, MyInterface02 {

    /*
    *这里需要指定使用那个接口的方法 
    * */
    @Override
    public String getName() {

        //MyInterface01
        return MyInterface02.super.getName();
    }
}
