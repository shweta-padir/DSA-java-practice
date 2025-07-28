public class Topright {
  public static void main(String[] args) {
    int n = 5;
    for (int row = 1; row <= 5; row++) {
      for (int col = 1; col <= 5; col++) {
        if (row - col <= 0) {
          System.err.print("*");

        } else {
          System.out.print(" ");
        }

      }
      System.out.println();
    }
  }

}
