// https://www.codechef.com/problems/BATH
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    int x = s.nextInt();
		    int y = 2*(s.nextInt());
		    int res = (x>=y) ? x/y : 0;
		    System.out.println(res);
		}
	}
}
