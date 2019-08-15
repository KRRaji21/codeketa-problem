import java.util.Scanner;
class Hello
{

	public static void main(String[] args)
	{
		int n,num;
    		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n value to print:");
		num=s.nextInt();
		for(n = 0; n < num; n++)
		{
			System.out.println("\n Hello ");
		}	
	}
}