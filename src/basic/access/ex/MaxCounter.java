package basic.access.ex;

public class MaxCounter {

  private int count = 0;
  private int max;

  public MaxCounter(int max) {
    this.max = max;
  }

  public void increment() {
    if (isMaxCount(count)) {
      count++;
    } else {
      System.out.println("최대값 입니다.");
    }
  }

  ;

  public int getCount() {
    return count;
  }

  ;


  private boolean isMaxCount(int count) {
    if (count >= max) {
      return false;
    } else {
      return true;
    }
  }
}
