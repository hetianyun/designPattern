package factoryMethod;

/**
 * Created by hetianyun on 2018/8/27.
 */
public class BlackHuman implements Human {

  @Override
  public void getColor() {
    System.out.println("black");
  }

  @Override
  public void talk() {
    System.out.println("WALIWA");
  }
}
