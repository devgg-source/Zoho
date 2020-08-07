/*
Input : 2, -3, -4, 5, 9, 7, 8   
 Output: 2 5 9
 You should solve this question in O(n) time.
 */

#include <iostream>
using namespace std;
int main()
{
    int n;
    cin >> n;
    int a[n];
    for (int i = 0; i < n; i++)
        cin >> a[i];
    int k = a[0];
    cout << k << " ";
    for (int i = 1; i < n; i++)
    {
        if (a[i] > k)
        {
            k = a[i];
            cout << k << "  ";
        }
    }
    return 0;
}
