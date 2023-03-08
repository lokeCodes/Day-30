// https://www.codechef.com/problems/TRANSFORM
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
            if(x%3==0){
                System.out.println("NORMAL");
            }else if(x%3==1){
                System.out.println("HUGE");
            }else{
                System.out.println("SMALL");
            }
		}
	}
}
