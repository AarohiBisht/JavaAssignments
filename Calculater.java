package Calculater;

import java.util.Scanner;

public class Calculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//read input from user asking what operation should be perform.
		System.out.println("Which operation You need to perfom?");
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		System.out.println("Enter two numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		if(input.equalsIgnoreCase("addition"))
		{
			System.out.println(num1+num2);
			
		}
		if(input.equalsIgnoreCase("substraction"))
		{
			System.out.println(num1-num2);
		}
		if(input.equalsIgnoreCase("multiplication"))
		{
			System.out.println(num1*num2);
		}
		if(input.equalsIgnoreCase("division"))
		{
			System.out.println(num1%num2);
		}
		
		
		
		
		//compare input with addition,sub,mul,div
		

	}

}
;
