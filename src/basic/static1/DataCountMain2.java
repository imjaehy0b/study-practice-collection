package basic.static1;

public class DataCountMain2 {

  public static void main(String[] args) {
    Counter counter = new Counter();
    Data2 data2 = new Data2("A", counter);
    Data2 data3 = new Data2("B", counter);
    Data2 data4 = new Data2("C", counter);

    System.out.println(counter.count);
  }

}
