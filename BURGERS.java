import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int p=sc.nextInt();
		    int b=sc.nextInt();
		    if(p>=b)
		    {
		        System.out.println(b);
		    }
		    else{
		        System.out.println(p);
		    }
		}

	}
}
