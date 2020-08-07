/*

1.	Print the word with odd letters as

P         M
 R      A
   O  R
     G
  O    R
 R       A
P          M 


*/

#include <iostream>
using namespace std;
int main()
{

    string s;
    cin >> s;
    for (int i = 0; i < s.length(); i++)
    {
        for (int j = 0; j < s.length(); j++)
        {
            if (i == j)
            {
                cout << s[i];
            }
            else if (j == s.length() - i - 1)
            {
                cout << s[j];
            }
            else
            {
                cout << " ";
            }
        }
        cout << endl;
    }
    return 0;
}
