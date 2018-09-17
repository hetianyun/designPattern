package proxyPatternExt01_nomalProxy;

/**
 * 普通代理模式：
 *  在该模式下，调用者只知道代理而不用知道真实的角色是谁，屏蔽了真实角色的变更对高层模块的影响，
 *  真实的主题角色想怎么修改就怎么修改，对高层模块没有任何影响，只要实现了接口所对应的方法，
 *  该模块非常适合对扩展性要求高的场合。
 *
 *  亮点：在实际的项目中，一般都是通过约定来禁止new一个真实的角色。此处，由代理者创建被代理对象。
 */
public class Client {
  public static void main(String[] args) {
    IGamePlaer proxy = new GamePlayerProxy("sum");
    proxy.login("sum", "123");
    proxy.killBoss();
    proxy.upgrade();

  }
}
