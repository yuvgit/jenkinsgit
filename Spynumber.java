package internallab;

import java.util.Scanner;

public class Spynumber {

	public static void main(String[] args) {
		int multi = 1, sum = 0, ld;
		int n;
		Scanner s =new Scanner(System.in);
		System.out.println("enter number");
	    n=s.nextInt();
        while (n > 0) 
        {
            ld = n % 10;
            sum = sum + ld;
            multi = multi * ld;
            n = n / 10;
        }
        if (sum == multi)
            System.out.println("enter number is spy number");
        else
        	  System.out.println("enter number is not spy number");
	}

}
