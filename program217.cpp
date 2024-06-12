#include<iostream>
using namespace std;

int main()
{
    int iLength = 0, i = 0;
    int *ptr = NULL;

    cout<<"Enter number of elements that you want to store : "<<endl;
    cin>>iLength;

    ptr = new int[iLength];

    cout<<"Enter the elements : "<<endl;
    for(i = 0; i < iLength; i++)        //loop runs from 0 to iLength -1 storing each  input in 
    {                                   // the array pointed to by ptr
        cin>>ptr[i];
    }

     cout<<"Entered elements are : "<<endl;    //loop runs from 0 to iLength -1 printing each elment stored in 
                                              // the array pointed to by ptr
    for(i = 0; i < iLength; i++)
    {
        cout<<ptr[i]<<endl;
    }
    
    delete []ptr;

    return 0;
}