import java.util.*;
class v
{
    public static void main(String args[])
    {
        int a[]={12,13,1,5,7};
        int s=0;
        for(int i=0;i<a.length;i++)
        {
            s+=a[i];
            int res=s/(i+1);
            a[i]=res;
        }
        System.out.println(Arrays.toString(a));
    }
}