public class Reverse_array
{
  public static void main(String[] args) {
    int numbers[]={2,6,8,10,12};
    System.out.println("original array");
    for(int i=0;i<numbers.length;i++)
    {
      System.out.print(" "+numbers[i]+" \n");
    }

    swap(numbers);
    System.out.println("Reverse array");
    for(int i=0;i<numbers.length;i++)
    {
      System.out.print(" "+numbers[i]+" ");
    }

    
  }
  public static void swap(int numbers[])
  {
    int first_no=0,last_no=numbers.length-1;
    while(first_no<last_no)
    {
      int temp=numbers[last_no];
      numbers[last_no]=numbers[first_no];
      numbers[first_no]=temp;
      first_no++;
      last_no--;
    }
    


  }
}