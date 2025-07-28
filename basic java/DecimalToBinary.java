public class DecimalToBinary {

  public static void DtoB(int num)
  {
    int pow=0;
    int binary=0;
    int mynum=num;

    while(num>0)
    {  int rem=num%2;
        binary= binary+(rem*(int)Math.pow(10,pow));
        pow++;
        num=num/2;

    }
    System.out.println("decimal number ="+ mynum +" To "+"binary number ="+ binary );

  }
  public static void main(String args[] )
  {
    DecimalToBinary.DtoB(9);
  }
  
}
