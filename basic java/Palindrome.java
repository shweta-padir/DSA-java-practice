import java.util.*;

public class Palindrome {
  public static void check(int num) {
    int Palindrome_No = 0;
    int actual_No = num;
    while (num > 0) {
      int rem = num % 10;
      Palindrome_No = (Palindrome_No * 10) + rem;
      num = num / 10;

    }
    if (actual_No == Palindrome_No) {
      System.out.println(actual_No + " is a palindrome number");
    } else {
      System.out.println(actual_No + " is not a palindrome number");
    }

  }

  public static void main(String args[]) {
    Palindrome.check(222);
  }

}
