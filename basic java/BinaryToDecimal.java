import java.util.*;

public class BinaryToDecimal {

  public static void bTOd(int binNum)
{
  int pow=0;
  int dec=0;
  int myNum=binNum;

  while(binNum>0)
  {
    int lastdigit=binNum%10;
    dec=dec+(lastdigit*(int)Math.pow(2,pow));
    pow++;
    binNum=binNum/10;
  }
  System.out.println("decimal form of binary number = "+myNum+" is "+dec);

}
public static void main(String args[])
  {
    BinaryToDecimal.bTOd(1001);
  }
    

}

  
  

