package mediatorPattern;

/**
 * Created by hetianyun on 2018/9/17.
 */
public abstract class AbstractMediator {
  protected Purchase purchase;
  protected Sale sale;
  protected Stock stock;

  public AbstractMediator() {
    this.purchase = new Purchase(this);
    this.sale = new Sale(this);
    this.stock = new Stock(this);
  }

  public abstract void execute(String method, Object... objects);




}
