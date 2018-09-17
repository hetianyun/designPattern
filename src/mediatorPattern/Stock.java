package mediatorPattern;

import java.util.Collection;

/**
 * Created by hetianyun on 2018/9/17.
 */
public class Stock extends AbstractColleague {
  public Stock(AbstractMediator abstractMediator) {
    super(abstractMediator);
  }

  static int COUNT = 100;

  void increase(int num) {
    COUNT += num;
    System.out.println("库存增加" + num + "个。");
  }

  void decrease(int num) {
    COUNT -= num;
    System.out.println("库存减少" + num + "个。");
  }

  int getStockNum() {
    return COUNT;
  }

  void clearStock() {
    super.abstractMediator.execute("stock.clear");

  }
}
