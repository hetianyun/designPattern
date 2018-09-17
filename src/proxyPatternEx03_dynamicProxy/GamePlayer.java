package proxyPatternEx03_dynamicProxy;

/**
 * Created by hetianyun on 2018/9/9.
 */
public class GamePlayer implements IGamePlayer {
  private String name;

  public GamePlayer(String name) {
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
