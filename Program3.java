import java.util.*;

public class Program3
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int n,num,sum=0;
	n=sc.nextInt();
	while(n!=0)
	{
		num=n%10;
		sum=sum*10+num;
		n/=10;
	}
	System.out.println(sum);
	}
}
		