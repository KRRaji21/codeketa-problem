import java.util.Scanner;
class oddeven
{
    public static void main(String[] args) 
    {
        int num;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number which you want to check:");
        num = scan.nextInt();
        s.close();
        if(num%2==0)
        {
            System.out.println(num+" is Even Number");
        }
        else
        {
            System.out.println(num+" is Odd Number");
        }
    }
}