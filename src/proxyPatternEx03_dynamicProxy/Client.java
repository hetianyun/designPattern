package proxyPatternEx03_dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by hetianyun on 2018/9/11.
 */
public class Client {
  public static void main(String[] args) {
    //定义一个主题
    IGamePlayer gamePlayer = new GamePlayer("sum");

    //1、传统定义方式
//    //定义一个handler
//    InvocationHandler handler = new GamePlayerIH(gamePlayer);
//    //定义主题的代理
//    IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance
//        (gamePlayer.getClass().getClassLoader(),
//            gamePlayer.getClass().getInterfaces(), handler);

    //2、将Proxy进行包装
    IGamePlayer proxy = IGamePlayerProxy.newProxyInstance(gamePlayer);

    proxy.login("user", "password");
    proxy.killBoss();
    proxy.upgrade();

  }
}
