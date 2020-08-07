/*

input:
N=4

output:
1 5 8 10 
2 6 9 
3 7 
4 

*/

#include <iostream>
using namespace std;
int main()
{
    int n;
    cin >> n;

    int row, cols, col;
    cin > n;
    int printVal;
    for (row = 1; row <= N; row++)
    {
        cols = N - row + 1;
        printVal = row;
        for (col = 1; col <= cols; col++)
        {
            cout << printVal;
            printVal = printVal + (N - col + 1);
        }
        cout << endl;
    }

    return 0;
}
