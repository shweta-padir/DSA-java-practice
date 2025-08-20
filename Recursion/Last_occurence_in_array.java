public class Last_occurence_in_array{
  public static int lastoccurence(int arr[],int key,int i)
  {
    if(i<0)
    {
      return -1;
    }
    if(arr[i]==key)
    {
      return i;
    }
    return lastoccurence(arr,key,i-1);

  }
  public static void main(String args[])
  {
    int arr[]={8,3,6,9,5,10,2,5,3,5,7,8,9};
    System.out.println(lastoccurence(arr,5,arr.length-1));

  }
}