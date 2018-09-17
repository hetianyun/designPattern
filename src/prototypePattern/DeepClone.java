package prototypePattern;

import java.util.ArrayList;

/**
 * Created by hetianyun on 2018/9/17.
 */
public class DeepClone implements Cloneable {
  final ArrayList<String> list = new ArrayList<>();

  public ArrayList<String> getList() {
    return list;
  }


  @Override
  protected DeepClone clone() {
    DeepClone deepClone = null;
    try {
      deepClone = (DeepClone) super.clone();
//      deepClone.list = (ArrayList<String>) this.list.clone();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return deepClone;

  }
}
