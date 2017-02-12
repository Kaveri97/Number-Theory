import java.io.*;
import java.util.*;

public class Solution44 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        long a, b, x, p,r,q,s;
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i=0;i<t;i++){
        a = scan.nextLong();
        b = scan.nextLong();
        x = scan.nextLong();
        p = (long)Math.pow(a,b);
        r = p%x;
        q = x-r;
            if((x-(p%x))>=(p%x)) 
                System.out.println(p-r);
            else
                System.out.println(p+q);
        }
    }
}