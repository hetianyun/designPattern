package singleton;

/**
 * Created by hetianyun on 2018/8/27.
 * Ensure a class has only one instance, and provide a global point of access to it.
 *
 */
public class Singleton {
  private static final Singleton SINGLETON = new Singleton();
  private Singleton(){}
  public static Singleton getInstance(){
    return SINGLETON;
  }
  public static void doSomething(){
  }
}
