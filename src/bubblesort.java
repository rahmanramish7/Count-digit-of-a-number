public class bubblesort {
public static void print(int arr[] )
            {
                for ( int i =0 ; i < arr.length ; i++)
                {
                    System.out.println(arr[i] + " ");
                }
            }




    public static void main(String[] args) {
        int arr[] = {3,4,6,8,9};
        for (int i = 0 ; i<arr.length-1;i++)
            for( int j = 0 ; j<arr.length-i-1; j++)
            {
                if (arr[i]>arr[i+1])
                {
                    int temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i]= temp;
                }
            }
      print(arr);
        }


    }
