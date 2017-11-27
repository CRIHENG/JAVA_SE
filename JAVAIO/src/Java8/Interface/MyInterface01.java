package Java8.Interface;

/**
 * Created by githu on 2017/11/27.
 * <p>
 * java 8 支持接口有默认的构造方法打和静态方法
 */
public interface MyInterface01 {
    default String getName() {
        return "我是接口 001";

    }

    static void getString() {
        System.out.println("我是接口 001 的静态方法");
    }

}
