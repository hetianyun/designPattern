package proxyPatternEx02_forceProxy;


/**
 * Created by hetianyun on 2018/9/9.
 */
public class GamePlayer implements IGamePlayer {

  private String name;
  private IGamePlayer gameProxy ;

  public GamePlayer(String name) {
    this.name = name;
  }

  @Override
  public void login(String user, String password) {
    if (isProxy()) {
      System.out.println("user:" + user + " password:" + password + " login.");
    } else {
      System.out.println("please get access by proxy.");
    }
  }

  @Override
  public void killBoss() {
    if (isProxy()) {
      System.out.println(this.name + " killBoss.");
    } else {
      System.out.println("please get access by proxy.");
    }
  }

  @Override
  public void upgrade() {
    if (isProxy()) {
      System.out.println(this.name + " upgrade.");
    } else {
      System.out.println("please get access by proxy.");
    }
  }

  @Override
  public IGamePlayer getProxy() {
    this.gameProxy = new GamePlayerProxy(this);
    return this.gameProxy;
  }


  private boolean isProxy(){
    if (this.gameProxy != null) {
      return true;
    }
    return false;
  }

}
