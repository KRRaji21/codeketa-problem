import java.util.Scanner;
class vowelcon
{
    public static void main(String[] args) 
    {
        
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the alphabet which you want to check:");
        String alphabet = s.nextString();
        if(alphabet=="a"||alphabet=="e"||alphabet=="i"||alphabet=="o"||alphabet=="u")
        {
            
            System.out.println("The given alphabet "+alphabet+"is Vowel");
        }
        else
        {
            System.out.println("The given alphabet "+alphabet+"is Consonant");
        }
    }
}