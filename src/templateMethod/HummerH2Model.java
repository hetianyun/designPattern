package templateMethod;

/**
 * Created by hetianyun on 2018/9/3.
 */
public class HummerH2Model extends HummerModel {
  @Override
  protected void start() {
    System.out.println("h2  start");
  }

  @Override
  protected void stop() {
    System.out.println("h2 stop");

  }

  @Override
  protected void alarm() {
    System.out.println("h2 alarm");

  }

  @Override
  protected void engineBoom() {
    System.out.println("h2 engineBoom");

  }

  @Override
  protected boolean isAlarm() {
    return false;
  }
}
