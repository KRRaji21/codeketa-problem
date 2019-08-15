import java.util.Scanner;
class posneg
{
    public static void main(String[] args) 
    {
        int num;
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the number which you want to check:");
        numr = scan.nextInt();
        s.close();
        if(num > 0)
        {
            System.out.println(num+" is Positive Number");
        }
        else if(num < 0)
        {
            System.out.println(num+" is Negative Number");
        }
        else
        {
            System.out.println(num+" is Zero");
        }
    }
}