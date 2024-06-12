import java.util.*;

class program205
{
    public static int Diffreance(int iNo)

    {
        int iCnt = 0;
        while (iNo>0)
        {
            iCnt++
            iNo = iNo/10;
        }
    }  return iCnt;
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