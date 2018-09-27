import java.util.*;

public class Program2
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int n,fact=1;
	n=sc.nextInt();
	if(n<=20)
	{
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		System.out.println(fact);
	}
}
}
		