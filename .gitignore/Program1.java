import java.util.*;
import java.io.*;
public class Program1
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		String rev="";

		s=sc.nextLine();
		for(int j=s.length();j>0;--j)
	{
	rev=rev+(s.charAt(j-1)); 
	}
		System.out.println(rev);

	}
}