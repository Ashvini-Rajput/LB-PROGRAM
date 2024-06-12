import java.util.*;

class program199
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner (System.in);

        int iValue1 = 10, iValue2 = 11;
        int iAns = 0;

        System.out.println("enter first number");
        iValue1 = sobj.nextInt();

        System.out.println("enter second number");
        iValue2 = sobj.nextInt();

        iAns = iValue1+iValue2;

        System .out.println("Addition is :"+iAns);  
    }
}
//int       nextInt()
//float     nextFloat()
//dounle   nextDouble()
//string   nextLine()