package test;

/**
 * Created by hetianyun on 2018/9/13.
 */
public class main {
  public static void main(String[] args) {
    MyTask task = new MyTask();
    for (int i = 0; i < 5; i++) {
      new Thread(task, "窗口" + (i + 1)).start();
    }
  }
}
