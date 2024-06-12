#include<iostream>
using namespace std;
int SumDifferance(int iNo)
{
    int iDigit = 0, iSumE = 0, iSumO = 0;
    int iDiff = 0;
    while(iNo!= 0)
    {
        iDigit = iNo % 10;
        if((iDigit % 2)==0)
        {
            iSumE = iSumE + iDigit;
        }
        else
        {
            iSumO = iSumO + iDigit;
        }
        iNo = iNo/10;
    }
    iDiff = iSumO ; 
}
int main()
{
    int iValue,iRet = 0;

    cout<<"enter a number:"<<endl;
    cin>>iValue;
    iRet = SumDifferance (iValue);
    cout<<"Differance is:"<<iRet<<endl;
    return 0;
}