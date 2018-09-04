package builderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hetianyun on 2018/9/4.
 */
public abstract class CarModel {

  public abstract void start();

  public abstract void stop();

  public abstract void alarm();

  public abstract void engineBoom();

  private List<String> sequence = new ArrayList<>();

  public  void run(){
    for (String s : sequence) {
      if (s.equalsIgnoreCase("start")) {
        this.start();
      } else if (s.equalsIgnoreCase("stop")) {
        this.stop();
      } else if (s.equalsIgnoreCase("alarm")) {
        this.alarm();
      } else if (s.equalsIgnoreCase("engineBoom")) {
        this.engineBoom();
      }
    }
  }

  public void setSequence(List<String> sequence) {
    this.sequence = sequence;
  }
}
