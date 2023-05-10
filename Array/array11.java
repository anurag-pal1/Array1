import java.util.*;
public class array11 {
    public static void main(String args[])
    {
       try (Scanner sc=new Scanner(System.in))
       {
          int m,n;
          System.out.println("Enter value of m: ");
          m=sc.nextInt();
          System.out.println("Enter value of n: ");
          n=sc.nextInt();
          int arr[][]=new int[m][n];
          System.out.println("Enter elements of array: ");
          for(int i=0;i<m;i++)
          {
              for(int j=0;j<n;j++)
               {
                    arr[i][j]=sc.nextInt();
               }
          }
          int max=arr[0][0];
          for(int i=0;i<m;i++)
          {
            for(int j=0;j<n;j++)
            {
                   if(max<arr[i][j])
                   {
                    max=arr[i][j];
                   }
            }
          }
          System.out.println("Maximum is: "+max);
        }
    }
    
}
