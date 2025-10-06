import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int N = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int hor = 2 * (N-1);
            int sum = 0;
		    sum += Math.min(Math.abs(X-1),Math.abs(Y-1));
		    sum += Math.min(Math.abs(X-1),Math.abs(Y-N));
		    sum += Math.min(Math.abs(X-N),Math.abs(Y-1));
		    sum += Math.min(Math.abs(X-N),Math.abs(Y-N));
		    System.out.println(hor+sum);
            
        }


    }
}