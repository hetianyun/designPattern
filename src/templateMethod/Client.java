package templateMethod;

/**
 * 模板方法模式：
 *  Define the skeleton of an algorithm in an operation, deferring
 *  some steps to subclasses. Template Method lets subclasses
 *  redefine certain steps of an algorithm without changing the
 *  algorithm's structure.
 *  定义一个操作中的算法的框架，而将一些步骤延迟到子类中。使得子类可以不改变一个
 *  算法的结构即可重定义该算法的某些特定步骤。
 *  基本方法+模板方法（一般加final）
 *
 *  优点：
 *   封装不变部分，扩展可变部分。
 *   提取公共部分代码，便于维护。
 *   行为由父类控制，子类实现。
 *  缺点：
 *
 *  使用场景：
 *  1、多个子类有公共的方法，并且逻辑基本相同。
 *  2、重构时，把相同的代码抽取到父类中，然后通过钩子函数约束其行为。
 *  3、重要、复杂的算法，可以把核心算法设计为模板方法，周边的相关细节功能则由各个子类实现。
 *
 *
 *
 * Created by hetianyun on 2018/9/3.
 */
public class Client {
  public static void main(String[] args) {
    HummerH1Model h1 = new HummerH1Model();
    h1.setAlarmFlag(true);

    h1.run();

    h1.setAlarmFlag(false);
    h1.run();

    HummerModel h2 = new HummerH2Model();
    h2.run();

  }

}
