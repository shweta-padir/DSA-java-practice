import java.util.Scanner;
import java.util.*;

public class Linear_search
{
 public static void check(String Name,String sub[])

 { 
  Boolean found=false;
  
  for(int i=0;i<sub.length;i++)
  {
    if(Name.equals(sub[i]))
    {
      System.out.println("Present");
      found=true;
    break;
    }
  
  }
   if(found=false)
   {
    System.out.println("Name is not present");
   }
 }
 public static void main(String[] args) {
  String sub[]=new String[5];
  System.out.println("enter sub names in list");
  Scanner sc=new Scanner(System.in);
  for(int i=0;i<sub.length;i++)
  {
    sub[i]=sc.nextLine();

  }
  System.out.println("enter the search key");
  String Name=sc.nextLine();
  Linear_search.check(Name,sub);

 }

}