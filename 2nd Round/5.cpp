/*
You’re given an even number n. 
If n=4, you have to print the following pattern :
4444
4334
4334
4444

If n=6, then the pattern should be like this :

666666
655556
654456
654456
655556
666666


*/
#include <iostream>
using namespace std;
int main()
{
    int n, limit = 0;
    cin >> n;
    int a[n][n];
    int s = n;
    int l = 0;
    int r = n - 1;
    while (limit < n)
    {
        for (int i = l; i <= r; i++)
        {
            for (int j = l; j <= r; j++)
                if (i == l || i == r || j == l || j == r)
                    a[i][j] = n;
        }
        l++;
        r--;
        n--;
        limit++;
    }

    for (int i = 0; i < s; i++)
    {
        for (int j = 0; j < s; j++)
            cout << a[i][j];

        cout << endl;
    }

    return 0;
}