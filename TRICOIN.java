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
            int n = sc.nextInt();
            int i = 1;
            while(i<=n){
                if(n<0)break;
                n-=i;
                i++;
                
            }
            System.out.println(i-1);
            
        }


    }
}