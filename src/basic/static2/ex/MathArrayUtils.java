package basic.static2.ex;

public class MathArrayUtils {

  private MathArrayUtils() {
  }

  public static int sum(int[] array) {
    int sum = 0;
    for (int i : array) {
      sum += i;
    }
    return sum;
  }

  public static double avg(int[] array) {
    double avg = 0;
    for (int i : array) {
      avg += i;
    }
    return avg / array.length;
  }

  public static int min(int[] array) {
    int min = Integer.MAX_VALUE;
    for (int i : array) {
      if (i < min) {
        min = i;
      }
    }
    return min;
  }

  public static int max(int[] array) {
    int max = Integer.MIN_VALUE;
    for (int i : array) {
      if (i > max) {
        max = i;
      }
    }
    return max;
  }
}
