package factoryMethod;

/**
 * Created by hetianyun on 2018/8/27.
 */
public class YellowHuman implements Human {

  @Override
  public void getColor() {
    System.out.println("yellow");
  }

  @Override
  public void talk() {
    System.out.println("chi");
  }
}
