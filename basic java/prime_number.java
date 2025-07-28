import java.util.Scanner;
//but in this code it taking running time much we can convert it more effective way by taking the square instead of checking the number prime or not one by one....
public class prime_number {
  public static void main(String[] args) {
   //taking how much number we have to insert
   System.out.println("taking how much number we have to insert");
   Scanner sc=new Scanner(System.in);
   int take=sc.nextInt();
   System.out.println("enter number one by one");
   for(int i=0;i<take;i++)
   {
    int no=sc.nextInt();
    int count=0;
    for(int div=1;div<=no;div++)
    {
      if(no%div==0){
        count++;
      }
    }

   if(count==2)
   {
    System.out.println("it is a prime number");
   }
   else{
    System.out.println("it is  not a prime number");
   }
  }

  }
}

