package basic.static2.ex;

import static basic.static2.ex.MathArrayUtils.*;

public class MathArrayUtilsMain {

  public static void main(String[] args) {
//    MathArrayUtils mau = new MathArrayUtils();
    int[] values = {1, 2, 3, 4, 5};
    System.out.println("sum=" + sum(values));
    System.out.println("avg=" + avg(values));
    System.out.println("min=" + min(values));
    System.out.println("max=" + max(values));
  }

}
