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