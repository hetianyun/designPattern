package abstractFactory;

/**
 * Created by hetianyun on 2018/8/30.
 */
public abstract class AbstractWhiteHuman implements Human {
  @Override
  public void getColor() {
    System.out.println("white");
  }

  @Override
  public void talk() {
    System.out.println("waliwa");
  }
}
