package mediatorPattern;

/**
 * Created by hetianyun on 2018/9/17.
 */
public abstract class AbstractColleague {

  public AbstractMediator abstractMediator;

  public AbstractColleague(AbstractMediator abstractMediator) {
    this.abstractMediator = abstractMediator;
  }
}
