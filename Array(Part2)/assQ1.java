import java.util.*;
public class assQ1 {
  public static void main(String[] args) {
    int array[]={1,2,3,1};
    // int array[]={1,2,3,4};
    // int array[]={1,1,1,3,3,4,3,2,4,2};
    System.out.println(isfound(array));
  }
  public static boolean isfound(int array[])
  {  
    int count=0;
    for(int i=0;i<=array.length-1;i++)
    {
      for(int j=i+1;j<=array.length-1;j++)
      {
        if(array[i]==array[j])
        {
          count=count+1;
        }
      }
    }
    return count>0;
    
  }
  
}
