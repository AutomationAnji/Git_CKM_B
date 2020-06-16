package pack;

import java.util.HashMap;
import java.util.Scanner;

public class Learn_Swap {

	public void swap()
	{
		
	Scanner in=new Scanner(System.in);
	String s=in.nextLine();
	String reverse = "";
	
	for(int i=s.length()-1;i>=0;i--)
	{
	reverse=reverse+s.charAt(i);
	
	
	
	
	
	}
	if(s.equalsIgnoreCase(reverse))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("faul");
	}

	
	
		
	
	}
	public static void main(String args[])
	{
		Learn_Swap obj=new Learn_Swap();
		obj.swap();
		
	}
	
	
}
