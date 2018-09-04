package builderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hetianyun on 2018/9/4.
 */
public class BenzCarBuilder extends CarBuilder {
  private CarModel benz = new BenzCarModel();

  @Override
  public void setSequence(List<String> sequence) {
    this.benz.setSequence(sequence);
  }

  @Override
  public CarModel getCarModel() {
    return benz;
  }
}
