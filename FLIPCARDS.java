// https://www.codechef.com/problems/FLIPCARDS
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
		    int n = s.nextInt();
		    int x = s.nextInt();
            int diff = n-x;
            if(diff > x){
                System.out.println(x);
            }else{
                System.out.println(diff);
            }
		}
	}
}
