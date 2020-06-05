/*
You’re given a number n. 
If write all the numbers from 1 to n in a paper, we have to find the number of characters written on the paper.
For example if n=13, the output should be 17
if n = 101, the output should be 195
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
