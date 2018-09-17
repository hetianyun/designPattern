package proxyPattern;

/**
 * 代理模式：（委托模式）
 * Provide a surrogate or placeholder for another object to control access to it.
 * 为其他对象提供一种代理以控制对这个对象的访问。
 *
 * 优点：
 * 职责清晰：真是的角色就是实现实际的业务逻辑，不用关心其他飞奔职责的事务。
 * 高扩展性：具体主题角色是随时都会发生变化的，只要他实现了接口，不管他如何变化，
 *  代理类完全不用做任何修改也可以使用。
 * 智能化: todo
 *
 */
public class Client {
  public static void main(String[] args) {
    //直接自己进行游戏
   /* IGamePlaer gamePlaer = new GamePlaer("sum");
    gamePlaer.login("sum", "123");
    gamePlaer.killBoss();
    gamePlaer.upgrade();*/

    //代练
    IGamePlaer gamePlaer1 = new GamePlaer("spring");
    GamePlayerProxy proxy = new GamePlayerProxy(gamePlaer1);
    proxy.login("spr", "123");
    proxy.killBoss();
    proxy.upgrade();

  }

}
