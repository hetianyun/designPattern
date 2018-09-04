package templateMethod;

/**
 * Created by hetianyun on 2018/9/3.
 */
public class HummerH1Model extends HummerModel {
  /**
   * 是否需要响铃
   */
  protected boolean alarmFlag = true;

  @Override
  public void start() {
    System.out.println("H1 start");
  }

  @Override
  public void stop() {
    System.out.println("H1 stop");

  }

  @Override
  public void alarm() {
    System.out.println("H1 alarm");

  }

  @Override
  public void engineBoom() {
    System.out.println("H1 boom");

  }

  @Override
  protected boolean isAlarm() {
    return this.alarmFlag;
  }

  public void setAlarmFlag(boolean alarmFlag) {
    this.alarmFlag = alarmFlag;
  }
}
