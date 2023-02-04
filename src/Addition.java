import java.util.Scanner;

public class Addition 
{
		public static void main(String args[])
		{
			int a=0,b=0,res;
			try {
					System.out.println("Enter value for A :");
					Scanner sc= new Scanner(System.in);
					
			
					if(sc.hasNextInt())
						{
							a=sc.nextInt();
							
						}
			
			
					System.out.println("Enter value for B :");
					Scanner sc1= new Scanner(System.in);
					
					if(sc1.hasNextInt())
						{
							b=sc1.nextInt();
							
						}
					sc.close();
					sc1.close();
					res=a+b;
					System.out.println("Res = "+res);
			}
			catch(Exception e)
			{
				System.out.println("Wrong input");
			}
		}
}
