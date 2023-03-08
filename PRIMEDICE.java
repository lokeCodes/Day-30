// https://www.codechef.com/problems/PRIMEDICE
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
            int sum=x+y;
            if(sum==2 || sum==3 || sum==5 || sum==7 || sum==11 ){
                System.out.println("Alice");
            }else{
                System.out.println("Bob");
            }
        }  
	  
    }
}
