class Brute_force{

  public static void main(String[] args) {
    int numbers[]={1,-2,6,-1,3};
    subarray(numbers);
    
  }
  public static void subarray(int numbers[])
{
    int max=Integer.MIN_VALUE;
    for(int i=0;i<numbers.length;i++)
    {  
       int start=i;
       for(int j=i;j<numbers.length;j++)
       {
        int end=j;
        int sum=0;
        for(int k=start;k<=end;k++)
        { 
          System.out.println(numbers[k]);
          sum=sum+numbers[k];

        }
        if(sum>max)
        {
          max=sum;
        }
        System.out.println();
        System.out.println("sum for subarray="+sum);
        
       }
       
    }
    System.out.println("max  sum value="+max);

  }
}