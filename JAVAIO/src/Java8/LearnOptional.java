package Java8;

import org.junit.Test;

import java.util.Optional;

public class LearnOptional {
/*
*Optional容器类的常用方法:
* Opteional.of(T t):创建一个Optional 实例
* Optional.empty():创建一个空的Optional实例
* Optional.ofNullable(T t):可以简单的理解为包含了上述2个方法;
* isPreSend()判断是否有值
* orElse(T t)判断是否有值，没有则替换
* orElseGet(Suppler s) 判断你是否有值，没有就返回定义的对象返回的值或者已有的对象返回的值
* map();判断是否有值，处理后返回Optional 否则返回Optional.empty();
* flatMap():和MAP类似 但是参数一定要求返回的时Optional类型;
* */

    @Test
    public void testMap() {
        Optional<String> opMap = Optional.ofNullable(new String("123456"));

        Optional<Integer> strToInt= opMap.map((e)-> Integer.parseInt(e));

         System.out.println(strToInt.get());

         Optional<Double> strToDouble =opMap.flatMap((e)->Optional.of(Double.parseDouble(e)));
         System.out.println(strToDouble.get());
    }

    @Test
    public void testOfNullable() {
        Optional<String> opNotNull = Optional.ofNullable(new String("测试ofNullable"));
        System.out.println(opNotNull.get());
        Optional<String> op = Optional.ofNullable(null);
        if (op.isPresent()) {
            op.get();
        }
        String str = op.orElse("没有值，那个人走了让我告诉你下,你该忙什么就忙什么吧");
        System.out.println(str);
        //自定义对象
        String str01 = op.orElseGet(() -> {
            return new String("哎呀，这叫函数式编程啊！");
        });
        System.out.println(str01);
    }

    ;


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
