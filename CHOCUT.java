import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int cases=sc.nextInt();
        for(int i=0;i<cases;i++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int b=sc.nextInt();
            int total=n*m;
            if(b==0){
                System.out.println(total);
                continue;
            }
            int d1=n,d2=m;
            while(n<b){
                n+=d1;
            }
            while(m<b){
                m+=d2;
            }
            if(total-Math.min(n,m)<0){
                System.out.println("0");
            }else{
                System.out.println(total-Math.min(n,m));
            }
        }
	}
}