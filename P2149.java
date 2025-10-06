import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc= new Scanner (System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int l=sc.nextInt();
		    int b=sc.nextInt();
		    int s=sc.nextInt();
		    if(l*b<=s*s){
		        System.out.println(0);
		    }
		    else{
		        if(l<=s*s || b<=s*s){
		            System.out.println(1);
		        }
		        else{
		            System.out.println(2);
		        }
		    }
		}
	}
}