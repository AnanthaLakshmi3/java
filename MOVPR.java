import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int a = 2*z + y;
		int b = 2*x + 3*y;
		if(a<b){
		    System.out.print(a);
		}
		else{
		    System.out.print(b);
		}


	}
}
