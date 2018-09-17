package mediatorPattern;

import java.util.Random;

/**
 * Created by hetianyun on 2018/9/17.
 */
public class Sale extends AbstractColleague{

  public Sale(AbstractMediator abstractMediator) {
    super(abstractMediator);
  }

  void sell(int num) {
    super.abstractMediator.execute("sale.sell", 100);
  }

  int getSaleStatus(){
    Random random = new Random();
    int status = random.nextInt(100);
    System.out.println("saleStatus is :" + status);
    return status;
  }

  void offSale(){
    super.abstractMediator.execute("sale.offSale");

  }
}
