import java.util.*;

class program205
{
    public int SumFactors (int iNo)
    {
        int iCnt = 0,iSum = 0;
        for(iCnt =1;iCnt<=(iValue/2);iCnt ++)
        {
            if((iValue %iCnt)==0)
            {
                iSum = iSum+iCnt;

            }
        }
        return iSum;
    }
    public static void main(StringArg[])
    {
        Sacnner sobj = new Scanner (System.in);
        int iValue = 0;
        int iRet = 0;

        Syastem .out.println("Enter a number");
        iValue = sobj.nextInt();
        
        iRet = SumFactors(iValue);

        
        System.out.println("sum of factor is:"+iSum);
    }
}