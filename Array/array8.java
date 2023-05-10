import java.util.*;

public class array8 {
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
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
          int count=0;
          int count1=0;
          int count2=0;
          int count3=0;
          int count4=0;
          for(int i=0;i<m;i++)
          {
              for(int j=0;j<n;j++)
              {
                    if(arr[i][j]>0)
                    {
                         count++; 
                    }
                   if(arr[i][j]<0)
                    {
                      count1++;
                    }
                    if(arr[i][j]%2!=0)
                    {
                      count2++;
                    }
                    if(arr[i][j]%2==0)
                    {
                      count3++;
                    }
                    if(arr[i][j]==0)
                    {
                      count4++;
                    }
              }
          } 
          System.out.println("Number of positive numbers: "+count);
          System.out.println("Number of negative numbers: "+count1);
          System.out.println("Number of odd numbers: "+count2);
          System.out.println("Number of even numbers: "+count3);
          System.out.println("Number of 0: "+count4);
        }
    }
}
