package prototypePattern;

/**
 * 原型模式：
 * 用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 * Specify the kinds of objects to create using a prototypical
 * instance, and create new objects by copying this prototype.
 *
 * 优点：
 * 1、性能优良，原型模式是在内存二进制流的拷贝，要比直接new一个对象性能好很多，特别
 * 是要在一个循环体内产生大量的对象时，原型模式可以更好的体现其优点。
 * 2、逃避构造函数的约束（同时也是缺点）
 *
 * 使用场景：
 * 1、资源优化场景，类初始化需要消耗非常多的资源，这个资源包括数据、硬件资源等。
 * 2、性能和安全要求的场景。通过new产生一个对象需要非常繁琐的数据准备或访问权限，
 * 则可以使用原型模式。
 * 3、一个对象多个修改者的场景。一个对象需要提供给其他的对象访问，而且各个调用者
 * 可能都需要修改其值时，可以考虑使用圆形模式拷贝多个对象供调用者使用。
 *
 * 注意事项：
 * 1、构造函数不会被执行
 * 2、浅拷贝和深拷贝
 *  object类提供的方法clone只是拷贝对象，其对象内部的数组，引用对象等是不拷贝的，
 *  还是指向原声对象的内部元素地址，这种拷贝叫做浅拷贝。
 *  特殊类型：String，没有clone方法，处理机制比较特殊，通过字符串池（stringpool）
 *  在需要的时候才在内存中创建新的字符串。（其拷贝机制可以当作是基本类型）
 *
 *
 *
 */
public class Client {
  private static int MAX_COUNT = 6;

  public static void main(String[] args) {

    int i = 0;
    Mail mail = new Mail(new AdvTemplate());


    while (i < MAX_COUNT) {
      Mail cloneMail = mail.clone();
      cloneMail.setAppellation(i + "先生");
      cloneMail.setReceiver(i + " " + i);

      sendMail(mail);
      i++;
    }

  }

  private static void sendMail(Mail mail) {
    System.out.println(mail.toString());
  }


}
