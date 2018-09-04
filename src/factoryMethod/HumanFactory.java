package factoryMethod;

/**
 * Created by hetianyun on 2018/8/27.
 */
public class HumanFactory extends AbstractHumanFactory {
  @Override
  public <T extends Human> T createHuman(Class<T> tClass) {
    Human human = null;
    try {
      human = (Human) Class.forName(tClass.getName()).newInstance();
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
    return (T) human;
  }

}
