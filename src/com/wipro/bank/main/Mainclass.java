package com.wipro.bank.main;
import com.wipro.bank.service.*;
import java.util.Scanner;
public class Mainclass {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Tenure Period[Tenure can be either 5/10]:");
		int tenure=sc.nextInt();
		
		System.out.print("Principal Amount[minimum principal amount is 500]:");
		int principal=sc.nextInt();
		
		System.out.print("Enter Your Age:");
		int age=sc.nextInt();
		
		System.out.print("Enter Your Gender[male/female]:");
		String gender=sc.next();
		
		BankService bs=new BankService();
		bs.calculate(principal, tenure, age, gender);
		
		sc.close();
		
	}
}
