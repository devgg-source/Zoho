/*

Print the total number of odd and even digits in the given number.

  
Input  :  1234567
 
Output  :  ODD 4
           EVEN 3
           
 */
 
 
#include <iostream>
using namespace std;
int main()
{
    int n, odd = 0, even = 0;
    cin >> n;
    while (n > 0)
    {
        n % 2 == 0 ? even++ : odd++;
        n /= 10;
    }

    cout << "Odd : " << odd << endl;
    cout << "Even : " << even << endl;

    return 0;
}
