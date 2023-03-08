// https://www.codechef.com/problems/BULLET
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
		    int y = s.nextInt();
		    int z = s.nextInt();
		    int res = x/y;
		    int res1 = y/x;
		    if(x<=y){
		        if(res1>=z){
		            System.out.println(0);
		        }else{
		            System.out.println(z-res1);
		        }
		    }else{
		        System.out.println(z-res);
		    }
		}
	}
}
