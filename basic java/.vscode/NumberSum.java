
public class NumberSum {
  public static void add(int num) {
    int sum = 0;
    int actual_no = num;
    
    while (num > 0) {
      int rem = num % 10;
      sum = sum + rem;
      num = num / 10;
    }

    System.out.println("Sum of number " + actual_no + " is " + sum);
  }

  public static void main(String[] args) {
    NumberSum.add(123);
  }
}
