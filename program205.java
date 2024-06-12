import java.util.*;

class program205
{
    public static void main(StringArg[])
    {
        Sacnner sobj = new Scanner (System.in);
        int iValue = 0;
        int iCnt = 0,iSum = 0;

        Syastem .out.println("Enter a number");
        iValue = sobj.nextInt();

        for(iCnt =1;iCnt<=(iValue/2);iCnt ++)
        {
            if((iValue %iCnt)==0)
            {
                iSum = iSum+iCnt;

            }
        }
        System.out.println("sum of factor is:"+iSum);
    }
}