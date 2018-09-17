package proxyPatternExt01_nomalProxy;

/**
 * Created by hetianyun on 2018/9/9.
 */
public class GamePlaer implements IGamePlaer {
  private String name;

  public GamePlaer(IGamePlaer iGamePlaer, String name) {

    if (!(iGamePlaer instanceof GamePlayerProxy)) {
      throw new RuntimeException("you have no access to create GamePlayer");
    }
    this.name = name;
  }

  @Override
  public void login(String user, String password) {
    System.out.println("user:" + user + ",password:" + password + "  login.");
  }

  @Override
  public void killBoss() {
    System.out.println(this.name + " killBoss.");
  }

  @Override
  public void upgrade() {
    System.out.println(this.name + " upgrade.");
  }
}
