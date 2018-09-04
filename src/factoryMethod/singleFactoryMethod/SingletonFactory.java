package factoryMethod.singleFactoryMethod;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.lang.reflect.Constructor;

/**
 * Created by hetianyun on 2018/8/27.
 */
public class SingletonFactory {
  private static Singleton singleton;

  static {
    try {
      Class cl = Class.forName(Singleton.class.getName());
      Constructor constructor = cl.getDeclaredConstructor();
      constructor.setAccessible(true);
      singleton = (Singleton) constructor.newInstance();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  public static Singleton getSingleton() {
    return singleton;
  }
}
