package abstractFactory;

/**
 * 定义：为创建一组相关或者相互依赖的对象提供一个借口，
 *      而且无需指定它们的具体类
 *  Provide an interface for creating families of related or
 *  dependent objects without specifying their concrete classes.
 *
 *  优点：
 *  封装性：每个产品的实现类不是高层模块应该关心的，而是关心接口、抽象。
 *  ？：产品族内的约束为非公开状态。
 *     调用工厂类的高层木块不需要知道这个约束，具体的产品族内的约束是在工厂内实现的。
 *
 *  缺点：违反开闭原则
 *    扩展困难.如果需要新增产品，需要更改抽象工厂以及其实现类。
 *
 *  使用场景：一个对象族都有相同的约束，则可以使用抽象工厂模式。
 *
 * Created by hetianyun on 2018/8/30.
 */
public class Client {
  public static void main(String[] args) {

    HumanFactory femalHumanFactory = new FemalHumanFactory();
    HumanFactory malHumanFactory = new MalHumanFactory();

    Human femalWhiteHuman = femalHumanFactory.createWhiteHuman();
    Human malWhiteHuman = malHumanFactory.createWhiteHuman();

    femalWhiteHuman.getColor();
    femalWhiteHuman.getSex();
    femalWhiteHuman.talk();


    malWhiteHuman.getColor();
    malWhiteHuman.getSex();
    malWhiteHuman.talk();

  }
}
