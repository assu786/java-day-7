import java.util.*;
class v{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("even");
        for(int j=0;j<arr.length;j+=2)
        {
            System.out.println(arr[j]);
           
        }
        System.out.println("odd");
        for(int j=1;j<arr.length;j+=2)
        {
            System.out.println(arr[j]);
        }
    }
}