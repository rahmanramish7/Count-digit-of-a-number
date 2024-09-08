public class binarysearch {

    int binary(int arr[] , int x)
{
    int low = 0 ; int high = arr.length-1;

    while (low<=high)

    {
        int mid = low + (high - low)/2;
        if (arr[mid]==x)
        {
            return arr[mid];
        }
   if (arr[mid]<x)
   {
       low = mid+1;
   }
   else
       high =mid+1;


    }
return -1;







}

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,};
        binarysearch ob = new binarysearch();
        int x =8;
        int result = ob.binary(arr , x);
        if (result==-1)
        {
            System.out.println("element not there");
        }
        else
        {
            
        }

    }
}
