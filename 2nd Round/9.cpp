/*

 Find the maximum of three numbers?
 Input : 1 2 3
 output : 3 is greater.
 
 */
 
 

#include <iostream>
using namespace std;
int main()
{

    int a, b, c;
    cin >> a >> b >> c;
    if (a > b && a > c)
    {
        cout << a << " is greater" << endl;
    }
    else if (b > a && b > c)
    {
        cout << b << " is greater" << endl;
    }
    else if (c > a && c > b)
    {
        cout << c << " is greater" << endl;
    }
    else if (a > b && a == c)
    {
        cout << a << " and" << c << " is greater";
    }
    else if (b > a && b == c)
    {
        cout << b << " and" << c << " is greater";
    }
    else if (a > c && a == b)
    {
        cout << a << " and" << b << " is greater";
    }
    else
    {
        cout << "Three numbers are same" << endl;
    }

    return 0;
}
