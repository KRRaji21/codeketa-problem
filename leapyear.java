import java.util.Scanner;
class leapyear
 {
   public static void main(String[] args)
{
       
      System.out.println("Enter an Year which u want to check: ");
      Scanner s = new Scanner(System.in);
      int year = s.nextInt();

      if ((year % 4 == 0) && (year % 100!= 0))
{

         System.out.println(year+" is a leap year");
}
      else
{
         System.out.println(year+" is not a leap year");
   }
}