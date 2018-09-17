package mediatorPattern;

/**
 * Created by hetianyun on 2018/9/17.
 */
public class Mediator extends AbstractMediator {
  @Override
  public void execute(String method, Object... objects) {
    if ("purchase.buy".equalsIgnoreCase(method)) {
      this.buy((int) objects[0]);
    } else if ("sale.sell".equalsIgnoreCase(method)) {
      this.sell((int) objects[0]);
    } else if ("sale.offSale".equalsIgnoreCase(method)) {
      this.offSell();
    } else if ("stock.clear".equalsIgnoreCase(method)) {
      this.clearStock();
    }
  }
  //采购
  private void buy(int num) {
    int saleStatus = super.sale.getSaleStatus();
    if (saleStatus > 80) {
      System.out.println("销售状况良好，购买+++");
    } else {
      System.out.println("销售情况差，减少购进");
      num /= 2;
    }
    super.stock.increase(num);
  }

  //销售
  private void sell(int num) {
    if (super.stock.getStockNum() < num) {
      super.purchase.buy(num);
    }
    super.stock.decrease(num);
  }

  //打折销售
  private void offSell(){
    System.out.println("打折销售" + super.stock.getStockNum() + "个。");
  }
  //清库存
  private void clearStock(){
    super.sale.offSale();
    super.purchase.refuseBuy();
  }


}
