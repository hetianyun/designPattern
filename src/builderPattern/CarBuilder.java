package builderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hetianyun on 2018/9/4.
 */
public abstract class CarBuilder {
  public abstract void setSequence(List<String> sequence);

  public abstract CarModel getCarModel();
}
