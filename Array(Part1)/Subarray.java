public class Subarray {
  public static void main(String[] args) {
    int numbers[] = { 2, 4, 6, 8, 10 };
    Printsubarray(numbers);
  }

  public static void Printsubarray(int numbers[]) {
    int max = Integer.MIN_VALUE;
    int min= Integer.MAX_VALUE;
    for (int i = 0; i < numbers.length; i++) {
      int start = i;
      for (int j = i; j < numbers.length; j++) {
        int end = j;
        int sum = 0;
        

        for (int k = start; k <= end; k++) {
          System.out.print(numbers[k] + " ");
          sum = sum + numbers[k];
          
        }

        System.out.println();
        System.out.println("sum for this subarray is " + sum);
        System.out.println();
        if (max < sum) {
          max = sum;
        }
        if(min>sum)
        {
          min=sum;
        }
      }

    }
    System.out.println("max value is"+max);
    System.out.println("min value is "+min);

  }

}