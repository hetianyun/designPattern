package abstractFactory;


/**
 * Created by hetianyun on 2018/8/30.
 */
public class MalHumanFactory implements HumanFactory{

  @Override
  public Human createWhiteHuman() {
    return new MalWhiteHuman();
  }

  @Override
  public Human createBlackHuman() {
    return null;
  }

  @Override
  public Human createYellowHuman() {
    return null;
  }
}
