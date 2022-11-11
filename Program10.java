package javaChallenge10;

import java.util.Scanner;

//Java Problem (10/20)
//
//You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
//
//Letters are case sensitive, so "a" is considered a different type of stone from "A".
//
//Example 1:
//
//Input: jewels = "aA", stones = "aAAbbbb"
//Output: 3
//Example 2:
//
//Input: jewels = "z", stones = "ZZ"
//Output: 0


public class Program10 {
	
	
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the jewels");
		String jewels = sc.nextLine();
		System.out.println("==========================");
		System.out.println("Enter the stone");
		String stones = sc.nextLine();
		sc.close();
		
		char[] jewelsArray = jewels.toCharArray();
		char[] stonesArray = stones.toCharArray();
		int count =0;
		
		for(int i=0;i<=jewelsArray.length-1;i++)
		{
			for(int j=0;j<=stonesArray.length-1;j++)
			{
				if(jewelsArray[i]==stonesArray[j])
				{
					count++;
				}
			}
		}
			
		System.out.println("The number of stones "+count);
		
		
		
	}

}
