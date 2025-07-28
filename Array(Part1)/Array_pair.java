public class Array_pair {
  public static void main(String[] args) {
    int numbers[]={2,4,6,8,10};
    System.out.println("Possible pairs in array of array  {2,4,6,8,10} ");
    pairs(numbers);
    //possible pairs
    //(2,4),(2,6),(2,8),(2,10)
    //(4,6) (4,8) (4,10)
    //(6,8) (6,10)
    //(8,10)
  }
  public static void pairs(int numbers[])
  {
    for(int i=0;i<numbers.length;i++)
    {
      for(int j=i+1;j<numbers.length;j++)
      {
        System.out.print("["+numbers[i]+","+numbers[j]+"]");
      }
      System.out.println();
       
      
    }
  }
  
}
