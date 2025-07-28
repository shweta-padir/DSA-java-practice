import java.util.*;

public class buyAndsellstock{
  public static int buyandstock(int prices[]){
    int max_profit=0;
    int min_buyprice=Integer.MAX_VALUE;
    for(int i=0;i<=prices.length-1;i++)
    {
      if(min_buyprice<prices[i])
      {
        int profit=prices[i]-min_buyprice;
        max_profit=Math.max(max_profit,profit);
      }
      else{
        min_buyprice=prices[i];
      }
    }
    return max_profit;
  }
public static void main(String[] args) {
  int prices[]={7,1,5,3,6,4};
  System.out.println("max_profit is equal to "+buyandstock(prices));
}
}



