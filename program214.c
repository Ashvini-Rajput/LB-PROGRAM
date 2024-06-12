#include<stdio.h>
 int Power(int iNO1, int iNO2)

 {
    int iCnt = 0;
    int iMult = 1;
    for(iCnt = 1;iCnt < iNO2 ; iCnt++)
    {
        iMult = iMult * iNO1;
    }
    return iMult;

 }
int main()
{
    int iValue1  = 0 ,iValue2 = 0,iRet = 0 ;
    
    printf("enter first number:\n");
    scanf("%d",&iValue1);

    printf("enter second number:\n");
    scanf("%d",&iValue2);

    iRet = (power(iValue1,iValue2));
    
    printf("Answer iS %d\n",iRet);
    return 0;
}