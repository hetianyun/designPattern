package builderPattern;

/**
 * Created by hetianyun on 2018/9/4.
 */
public class BenzCarModel extends CarModel {
  @Override
  public void start() {
    System.out.println("benz start");

  }

  @Override
  public void stop() {
    System.out.println("benz stop");

  }

  @Override
  public void alarm() {
    System.out.println("benz alarm");

  }

  @Override
  public void engineBoom() {
    System.out.println("benz engineBoom");

  }
}
