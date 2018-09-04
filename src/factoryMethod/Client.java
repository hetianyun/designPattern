package factoryMethod;

/**
 * Created by hetianyun on 2018/8/27.
 *
 * Define an interface for creating an object, but let subclass decide which
 * class to instance. Factory Method lets a class defer instance to subclasses.
 *
 * 定义一个用于创建对象的接口，让子类决定实例化哪一个类。
 * 工厂方法使一个类的实例化延迟到其子类。
 *
 * 优点：
 * 1、良好的封装，降低块间的耦合。
 * 2、扩展性优秀
 * 3、屏蔽产品类
 * 4、典型的解耦框架，高层模块只需要产品的抽象类。
 *
 * 符合 德米特法则，依赖倒置原则，里氏替换原则
 *
 */
public class Client {
  public static void main(String[] args) {
    AbstractHumanFactory humanFactory = new HumanFactory();

    Human yHuman = humanFactory.createHuman(YellowHuman.class);
    yHuman.getColor();
    yHuman.talk();


    Human bHuman = humanFactory.createHuman(BlackHuman.class);
    bHuman.getColor();
    bHuman.talk();

  }
}
