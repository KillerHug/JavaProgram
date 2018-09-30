import java.util.*;
import java.io.*;
public class Program7
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,sum=0,num;
		n=sc.nextInt();
		while(n!=0)
		{
			num=n%10;
			sum=sum+num*num;
			n/=10;
		}
		System.out.println(sum);
	}
}