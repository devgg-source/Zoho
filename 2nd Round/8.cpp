/*

Sliding Window Maximum (Maximum of all subarrays of size k)

Input: arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6}, K = 3 
Output: 3 3 4 5 5 5 6

*/

//code
#include <iostream>
using namespace std;
int main()
{
    int n, k;
    cin >> n;
    int a[n];
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }
    cin >> k;

    if (k == 1)
    {
        for (int i = 0; i < n; i++)
        {
            cout << a[i] << " ";
        }
    }

    int p = 0, q = k - 1, t = p, max = a[k - 1];

    while (q <= n - 1)
    {
        if (a[p] > max)
            max = a[p];
        p += 1;
        if (p == q && p != n)
        {
            cout << max << " ";
            q++;
            p = ++t;

            if (q < n)
                max = a[q];
        }
    }
    return 0;
}
