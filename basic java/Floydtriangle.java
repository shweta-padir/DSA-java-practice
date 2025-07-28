public class Floydtriangle {
  
    public static void main(String[] args) {
      int n = 5;
      int val=1;
      for (int row = 1; row <= n; row++) {
        for (int col = 1; col <= n; col++) {
          if (row - col >= 0) {
            System.out.print(val+" ");
            val++;
          } else {
            System.out.print(" ");
          }
        }
        System.out.println();  // Move this outside the inner loop to print a newline only after each row
      }
    
  }
  
  
}
