#include <iostream>
using namespace std;
int main()
{
    int k, n, c = 0;
    string s = "", m = "";
    char l;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        cin >> l;
        s += l;
    }
    cin >> k;
    for (int i = 0; i < n; i++)
    {
        if (s[i] == '1')
        {
            c++;
            m += s[i];
            if (c == k)
            {
                m += '0';
                c = 0;
            }
        }
        else
        {
            m += s[i];
            c = 0;
        }
    }
    cout << m;
}