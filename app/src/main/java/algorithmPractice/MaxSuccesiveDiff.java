package algorithmPractice;

public class MaxSuccesiveDiff {

  static int maxSuccesiveDiff(int[] values) {
    int result = 0;
    for (int i = 0; i < values.length - 1; i++) {
      if  (Math.abs(values[i + 1] - values[i]) > result) {
        result = Math.abs(values[i + 1] - values[i]);
      }
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(maxSuccesiveDiff(new int[] {2, 5, 8, 7, 3}));
  }
}