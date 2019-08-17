class sumofnatural
 {
    public static void main(String[] args) 
{
       int num,sum = 0;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number value of n:");
        num = s.nextInt();
        for(int i = 1; i <= num; ++i)
        {
             sum = sum + i;
            
        }
        System.out.println("Sum of Natural numbers = " + sum);
    }
}