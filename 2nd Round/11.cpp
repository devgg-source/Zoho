/*

 Find the second maximum among the given numbers.

INPUT  :  
    
 Size of Array    :  8
 Enter the elements  :  2 5 1 6 2 6 7 10
    
 OUTPUT  :
  7

  INPUT  :

    Size of Array    :  4
    Enter the elements  :  4 1 2 2
    
    OUTPUT  :

    2

  INPUT  :

    Size of Array    :  1
    Enter the elements  :  1
    
  OUTPUT  :

    No second maximum
    
    */
    
    
    

#include <iostream>
#include <limits.h>
using namespace std;

void print2ndlargest(int arr[], int arr_size)
{
    int i, first, second;

    // There should be atleast two elements
    if (arr_size < 2)
    {
        cout << " Invalid Input ";
        return;
    }

    first = second = INT_MIN;
    for (i = 0; i < arr_size; i++)
    {

        // If current element is greater
        // than first then update both
        // first and second
        if (arr[i] > first)
        {
            second = first;
            first = arr[i];
        }

        // If arr[i] is in between first
        // and second then update second
        else if (arr[i] > second &&
                 arr[i] != first)
        {
            second = arr[i];
        }
    }
    if (second == INT_MIN)
        cout << "There is no second largest"
                "element\n";
    else
        cout << "The second largest element is "
             << second;
}


int main()
{
    int n;
    cin >> n;
    int a[n];
    for (int i = 0; i < n; i++)
        cin >> a[i];

    print2ndlargest(a, n);
    return 0;
}
