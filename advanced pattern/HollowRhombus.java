public class HollowRhombus{
   public static void draw(int row,int col)
   {
    for(int i=1;i<=row;i++)
    {
      for(int j=1;j<=(row-i);j++)
      {
        System.out.print(" ");
      }
      for(int j=1;j<=row;j++)
      {
        if(i==1||i==row||j==1||j==col)
        {
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
        
      }
      System.out.println();
      
    }
    
   }

   public static void main(String[] args) {
    HollowRhombus.draw(5,5);
   }


}