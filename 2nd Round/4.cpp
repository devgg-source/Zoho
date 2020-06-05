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
    while (n > 0)
    {
        int temp = n, m = 0, p = 1;
        while (temp)
        {
            int r = temp % 10;
            temp = temp / 10;
            if (r)
                m += p;

            p *= 10;
        }

        cout << m << " ";
        n = n - m;
    }
    return 0;
}
