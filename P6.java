//Program to find the factor of a given number

import java.io.*;
public class P6{
   public static void main(String[] args){
	int i,n=10;
	for(i=1;i<=n;i++){
		if(n%i==0){
		System.out.println("Factor of "+n+" = "+i);
		}
	}
}
}
