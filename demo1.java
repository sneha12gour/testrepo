import java.util.*;
class primeseries
{
		public static void main(String ar[])
	{

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int c=0;
			for(int j=2;j<i;j++)
			{
			if(i%j==0)
			{
				c++;
		}}
		if(c==0)
		{
		System.out.println(i+" ");
}}}}