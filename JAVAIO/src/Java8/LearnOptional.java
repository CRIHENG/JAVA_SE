package Java8;

import org.junit.Test;

import java.util.Optional;

public class LearnOptional {
/*
*Optional容器类的常用方法:
* Opteional.of(T t):创建一个Optional 实例
* Optional.empty:创建一个空的Optional实例
* Optional.ofNullable:可以简单的理解为包含了上述2个方法;
* */

    @Test
    public void testOfNullable() {
        Optional<String> opNotNull=Optional.ofNullable(new String("测试ofNullable"));
        System.out.println(opNotNull.get());
        Optional<String> op=Optional.ofNullable(null);
        op.get();

    }


    @Test
    public void testEmpty() {
        Optional<String> op = Optional.empty();
        //当GET对象值的时候，会有什么问题呢？答案：java.util.NoSuchElementException: No value present
        op.get();
    }


    @Test
    public void testOf() {
        Optional<String> op = Optional.of(new String("测试optional"));
        //获取容器类中的值
        System.out.println(op.get());
        //注意.of (T t) 参数不能为空 NullPointException
        Optional<String> opNull = Optional.of(null);
        //当然下面这段代码是无法走到的因为在构建Optional是出现了空指针,能快速排查错误点
        System.out.println("---------------分割线-----------");
        System.out.println(opNull.get());

    }
}
