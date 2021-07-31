package algorithmPractice;

public class DividendPairs {
  static int dividendPairs(int[] values) {
    int count = 0;
    for (int i = 0; i < values.length; i++) {
      for (int j = i + 1; j < values.length; j++) {
        if (((values[i] % values[j]) == 0) || ((values[j] % values[i]) == 0)) {
          count++;
        }
      }
    }
    return count;
  }
  public static void main(String[] args) {
    int[] values = {1, 2, 3, 5, 6};
    System.out.println(dividendPairs(values));
  }
}
