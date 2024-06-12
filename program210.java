import java.util.*;

class program209
{
    public static int SumDigit(int iNo)

    {
        int iSum = 0,iDigit = 0;
        while (iNo>0)
        {
            iDigit = iNo%2;
            {
                if ((iDigit % 2 )==0)
                {
                    iSum = iSum+idigit
                }
            }
            iNo = iNo/10;
        }
    }  
};
    public static void main(StringArg[])
    {
        Sacnner sobj = new Scanner (System.in);
        int iValue = 0;
        int iRet = 0;

        Syastem .out.println("Enter a number");
        iValue = sobj.nextInt();
        
        iRet = CounyDigit(iValue);
        System.out.println("Diffreance of factor is:"+iSum);
    }
}