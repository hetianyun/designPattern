package proxyPatternExt01_nomalProxy;

/**
 * Created by hetianyun on 2018/9/9.
 */
public class GamePlayerProxy implements IGamePlaer {
  private IGamePlaer gamePlaer=null;

  public GamePlayerProxy(String name) {
    this.gamePlaer = new GamePlaer(this, name);
  }

  @Override
  public void login(String user, String password) {
    this.gamePlaer.login(user, password);
  }

  @Override
  public void killBoss() {
    this.gamePlaer.killBoss();
  }

  @Override
  public void upgrade() {
    this.gamePlaer.upgrade();
  }
}
