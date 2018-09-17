package mediatorPattern;

/**
 * Created by hetianyun on 2018/9/17.
 */
public class Client {
  public static void main(String[] args) {
    AbstractMediator mediator = new Mediator();
    //----请求购置100----
    System.out.println("----请求购置100----");
    Purchase purchase = new Purchase(mediator);
    purchase.buy(100);
    //----销售100----
    System.out.println("----销售100----");
    Sale sale = new Sale(mediator);
    sale.sell(100);
    //----清库存启动----
    System.out.println("----清库存启动----");
    Stock stock = new Stock(mediator);
    stock.clearStock();
  }
}
