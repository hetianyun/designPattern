package abstractFactory;

/**
 * Created by hetianyun on 2018/8/30.
 */
public class FemalHumanFactory implements HumanFactory {

  @Override
  public Human createWhiteHuman() {
    return new FemalWhiteHuman();
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
