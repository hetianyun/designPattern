package abstractFactory;

/**
 * Created by hetianyun on 2018/8/30.
 */
public interface HumanFactory {

  public Human createWhiteHuman();
  public Human createBlackHuman();
  public Human createYellowHuman();

}
