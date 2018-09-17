package proxyPatternEx03_dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by hetianyun on 2018/9/12.
 */
public class IGamePlayerProxy extends Proxy {

  protected IGamePlayerProxy(InvocationHandler h) {
    super(h);
  }

  public static <T> T newProxyInstance(T iGamePlayer) {
    ClassLoader classLoader = iGamePlayer.getClass().getClassLoader();
    Class<?>[] classes = iGamePlayer.getClass().getInterfaces();
    InvocationHandler handler = new GamePlayerIH(iGamePlayer);
    return (T)newProxyInstance(classLoader, classes, handler);
  }

}
