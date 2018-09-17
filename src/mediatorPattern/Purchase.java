package mediatorPattern;

/**
 * 三个实现类具有共同点：
 * 只负责处理自己的活动，与自己无关的活动就丢给中介者处理。
 */
public class Purchase extends AbstractColleague {
  public Purchase(AbstractMediator abstractMediator) {
    super(abstractMediator);
  }

  void buy(int num) {
    super.abstractMediator.execute("purchase.buy", 100);
  }

  void refuseBuy() {
    System.out.println("停止购置!");
  }
}
