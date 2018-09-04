package templateMethod;

/**
 * Created by hetianyun on 2018/9/3.
 */
public abstract class HummerModel {
  protected abstract void start();

  protected abstract void stop();

  protected abstract void alarm();

  protected abstract void engineBoom();

  public void run() {
    this.start();
    this.engineBoom();
    if (isAlarm()) {
      this.alarm();
    }
    this.stop();

  }

  protected boolean isAlarm() {
    return true;
  }

}
