package test;

/**
 * Created by hetianyun on 2018/9/13.
 */
public class MyTask extends Thread {

  private int ticket = 100;

  @Override
  public void run() {
    while (true) {
//      synchronized (this) {
      if (ticket > 0) {
        System.out.println(Thread.currentThread().getName() + "正在售卖第" + ticket + "张票");
        ticket--;
      } else {
        System.out.println(Thread.currentThread().getName() + "退出售票");
        break;
      }
    }
//    }
  }
}

