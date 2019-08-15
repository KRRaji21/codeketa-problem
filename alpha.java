import java.util.Scanner;

class alpha
{
    public static void main(String args[])
    {
        
        Scanner s = new Scanner(System.in);
		
        System.out.println("Enter a Character which u want to check: ");
        char cha = s.next().charAt(0);
		
        if((cha>='a' && cha<='z') || (cha>='A' && cha<='Z'))
        {
            System.out.println(cha + " is an Alphabet");
        }
        else
        {
            System.out.println(cha + " is not an Alphabet");
        }
    }
}