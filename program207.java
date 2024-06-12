import java.util.*;

class program207
{
    public static int Diffreance(int iNo)

    {
        int iCnt = 0,iSumF = 0,iSumN = 0;
        for(iCnt =1; iCnt<=iNo; iCnt ++)
        {
            if((iNo % iCnt)==0)      //factor
            {
                iSumF = iSumF+iCnt;
            }
            else 
            {
                iSumN = iSumN + iCnt;
            }       
        }
        return iSumN-iSumF;
    }
    public static void main(StringArg[])
    {
        Sacnner sobj = new Scanner (System.in);
        int iValue = 0;
        int iRet = 0;

        Syastem .out.println("Enter a number");
        iValue = sobj.nextInt();
        
        iRet = Diffrence(iValue);

        
        System.out.println("Diffreance of factor is:"+iSum);
    }
}