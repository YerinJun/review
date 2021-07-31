package algorithmPractice;

public class ChangeValuesPosition {
  static void changeValuePosition(int[] values) {
    int temp;
    for (int i = 0; i < values.length/2; i++ ) {
      temp = values[i];
      values[i] = values[i + values.length/2];
      values[i + values.length/2] = temp;
    }
  }
  public static void main(String[] args) {
    int[] values = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
    changeValuePosition(values);

    for(int a : values) {
      System.out.print(a + ",");
    }
  }
}