public class Numberpattern2 {

  
  
    public static void main(String[] args) {
      int n = 5;
      for (int row = 1; row <= n; row++) {
        int num = row;
        for (int col = 1; col <= n; col++) {
          if (row - col >= 0) {
            System.out.print(num +" ");
            num++;
          
          } else {
            System.out.print(" ");
          }
        }
        System.out.println();  // Move this outside the inner loop to print a newline only after each row
      }
    
  }
  
  


  
}
