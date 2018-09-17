package prototypePattern;

/**
 * 深克隆：deepClone.list = (ArrayList<String>) this.list.clone();
 *
 * 深克隆字段不允许加final关键字。
 * 原因：深克隆字段通常为引用类型，final关键字的引用类型不允许更改指向的地址，而深克隆就是
 * 要更改引用类型的指向地址，两者矛盾。
 *
 *
 *
 *
 */
public class DeepCloneClient {
  public static void main(String[] args) {
    DeepClone deepClone = new DeepClone();
    deepClone.list.add("123");
    DeepClone clone = deepClone.clone();
    clone.list.add("456");

    System.out.println(deepClone.list+"   ");
    System.out.println(clone.list + "   ");
    new StringBuilder().append("");
  }
}
