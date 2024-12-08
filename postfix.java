import java.util.*;
class p{
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5,6};
        int post[]=new int[a.length];
        post[0]=a[5];
        for(int i=1;i<a.length;i++)
        post[i]=a[a.length-1-i]+post[i-1];
        System.out.println(Arrays.toString(post));   
    }
}