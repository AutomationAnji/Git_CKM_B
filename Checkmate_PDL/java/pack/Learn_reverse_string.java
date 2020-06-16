package pack;

public class Learn_reverse_string {

	
	
	public void reverse()
	{
		String s="Automation";

		char[] c=s.toCharArray();
		
		/*for(char d:c)
		{
			System.out.print(d);
		}*/
			
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(c[i]);
		}
		
		
	}
	
	public static void main(String args[])
	{
		Learn_reverse_string obj=new Learn_reverse_string();
		obj.reverse();
	}
	
	
	
}
