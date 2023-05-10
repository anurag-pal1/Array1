public class array7 {
    public static void main(String args[])
    {
        int arr[]={1,4,7,3,2,6,5};
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[i-1]&&arr[i]>arr[i+1])
            {
                System.out.println(arr[i]);
                break;
            }
        }
    }
    
}
