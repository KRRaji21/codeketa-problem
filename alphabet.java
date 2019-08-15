import java.util.Scanner;

class alphabet
{
    public static void main(String args[])
    {
        
        Scanner s = new Scanner(System.in);
		
        System.out.print("Enter a Character which u want to check: ");
        char cha = s.next().charAt(0);
		
        if((cha>='a' && cha<='z') || (cha>='A' && cha<='Z'))
        {
            System.out.print(cha + " is an Alphabet");
        }
        else
        {
            System.out.print(cha + " is not an Alphabet");
        }
    }
}