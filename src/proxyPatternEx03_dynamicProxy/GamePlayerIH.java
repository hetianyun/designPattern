package proxyPatternEx03_dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by hetianyun on 2018/9/11.
 */
public class GamePlayerIH implements InvocationHandler {
  // 被代理的实例
  Object obj = null;

  //我要代理谁
  public GamePlayerIH(Object obj) {
    this.obj = obj;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    Object result = method.invoke(this.obj, args);
    if (method.getName().equalsIgnoreCase("login")) {
      System.out.println("someone login!!!");
    }
    return result;
  }
}
