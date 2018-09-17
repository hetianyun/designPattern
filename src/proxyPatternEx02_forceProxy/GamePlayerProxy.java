package proxyPatternEx02_forceProxy;

/**
 * @author hty
 *
 * Created by hetianyun on 2018/9/9.
 */
public class GamePlayerProxy implements IGamePlayer,IProxy {
  private IGamePlayer gamePlayer;
  private long count=0L;

  public GamePlayerProxy(IGamePlayer gamePlayer) {
    this.gamePlayer = gamePlayer;
  }

  @Override
  public IGamePlayer getProxy() {
    return this;
  }

  @Override
  public void login(String user, String password) {
    this.gamePlayer.login(user, password);
  }

  @Override
  public void killBoss() {
    this.gamePlayer.killBoss();
  }

  @Override
  public void upgrade() {
    this.gamePlayer.upgrade();
    this.count();
  }

  @Override
  public void count() {
      count+=10;
    System.out.println("总费用:"+count);
  }
}
