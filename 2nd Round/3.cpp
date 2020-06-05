/*
A number is called as binary-decimal if all the digits in the number should be either ‘1’ or ‘0’. 
Any number can be written as a sum of binary-decimals. 
Our task is to find the minimum number of binary-decimals to represent a number.
Input : 32
Output : 10 11 11

Input : 120
Output : 10 110
*/
#include <iostream>
using namespace std;
int main()
{
    int n;
    cin >> n;
    int k = 0;
    for (int i = 1; i <= n; i *= 10)
    {
        k += (n - i + 1);
    }
    cout << k;
    return 0;
}
