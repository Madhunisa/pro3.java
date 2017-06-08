# pro3.java
import java.io.*;
import java.util.*;
public class digicount
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int count=0;
        while(n>0)
        {
            int s1=n%10;
            int c=s1;
            count++;
            n=n/10;
        }
        System.out.println(count);
    }
}
