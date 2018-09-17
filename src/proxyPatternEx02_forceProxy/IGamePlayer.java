package proxyPatternEx02_forceProxy;


/**
 * Created by hetianyun on 2018/9/9.
 */
public interface IGamePlayer {
  public void login(String user, String password);

  public void killBoss();

  public void upgrade();

  public IGamePlayer getProxy();
}
