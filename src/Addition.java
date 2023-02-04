import java.util.Scanner;

public class Addition 
{
		public static void main(String args[])
		{
			int a=0,b=0,res;
			System.out.println("Eter value for A :");
			Scanner sc= new Scanner(System.in);
			
			a=sc.nextInt();
	
			System.out.println("Eter value for B :");
			sc= new Scanner(System.in);
			
			b=sc.nextInt();
			
			res=a+b;
			System.out.println("REs = "+res);
		}
}
