package userdifinedArrays;

import java.util.Scanner;

public class UserdefiniedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of elements");
int n=sc.nextInt();
//create an array of size n
int[] myarray=new int[n];
//read the array elements 
System.out.println("Enter the aray elements");
for(int i=0;i<n;i++)
{
	myarray[i]=sc.nextInt();
}
//printing the values back to console
System.out.println("Array values are");
int sum=0;
for(int i=0;i<n;i++)
{
	System.out.println(myarray[i]);
	sum=sum+myarray[i];
	
}
System.out.println();
System.out.println("Sum of the array is"+sum);
System.out.println("Avarage marks obtained by students are"+sum/n);
    }

}
