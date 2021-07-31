package algorithmPractice;

public class CountEvenNumber {

  static int countEvenNumber(int value) {
    int count = 0;
    while (value != 0) {
      if ((value & 1) == 0) {
        count++;
      }
      value /= 10;
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(countEvenNumber(123456789));
  }
}
