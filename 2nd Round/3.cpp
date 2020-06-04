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