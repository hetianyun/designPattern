package builderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hetianyun on 2018/9/4.
 */
public class Director {
  private List<String> sequence = new ArrayList<>();
  private CarBuilder benzCarBuilder = new BenzCarBuilder();

  public CarModel getABenzCarModel(){
    this.sequence.clear();
    sequence.add("start");
    sequence.add("alarm");
    sequence.add("stop");
    this.benzCarBuilder.setSequence(sequence);
    return this.benzCarBuilder.getCarModel();
  }



}
