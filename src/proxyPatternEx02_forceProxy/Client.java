package proxyPatternEx02_forceProxy;

/**
 * 强制代理：
 *  强制代理的概念就是要从真实角色查找到代理角色，不允许直接访问真实角色。高层模块只要调用
 *  getProxy就可以访问真实角色的所有方法，他根本就不需要产生一个代理出来，代理的管理已经有真实角色自己完成。
 *
 *
 *  额外概念：虚拟代理。
 *   被代理对象延迟初始化，在需要的时候才初始化被代理对象，可以避免代理对象较多而引起的初始化缓慢的问题。
 *   缺点是需要在每个方法中判断主题对象是否被创建。
 *
 */
public class Client {
  public static void main(String[] args) {
    IGamePlayer gamePlayer = new GamePlayer("sum");
    IGamePlayer proxy = gamePlayer.getProxy();
    proxy.killBoss();
    proxy.upgrade();
    proxy.upgrade();
    proxy.upgrade();
    proxy.upgrade();
  }
}
