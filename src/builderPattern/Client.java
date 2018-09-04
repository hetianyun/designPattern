package builderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 建造者模式（生成器模式）
 * Separate the construction of a complex object from its representation
 * so that the same construction process can create different representations.
 *
 * 将一个复杂的对象的构建和它的表示分离，使得同样的构建过程可以创建不同的表示。
 *
 * 优点：
 *    封装性：客户端不需要知道产品内部组成的细节。
 *    建造者独立，容易扩展
 *    便于控制细节风险
 * 使用场景：
 * 1、相同的方法，不同的执行顺序，产生不同的事件结果时，可以使用建造者模式。
 * 2、多个部件或零件，都可以装配到一个对象中，但是产生的运行结果又不相同时。
 * 3、产品类非常复杂，或者产品类中的调用顺序不同产生不同的效能。
 *
 * 注意事项：建造者模式关注的是零件的类型和装配的顺序，这是它与工厂方法模式最大的不同，关注点不同。
 *
 */
public class Client {
  public static void main(String[] args) {
    List<String> sequence = new ArrayList();
    sequence.add("start");
    sequence.add("alarm");
    sequence.add("stop");


    Director director = new Director();
    CarModel aBenzCarModel = director.getABenzCarModel();
    aBenzCarModel.run();

  }

}
