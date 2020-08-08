/*

 INPUT  :  
  
  Enter the array size  :  4
  Enter the elements  :  1 1 2 4
  
  OUTPUT  :

  1 2 4 


*/


//NAIVE APPROACH - O(N^2)

void printDistinct(int arr[], int n) 
{ 
    // Pick all elements one by one 
    for (int i=0; i<n; i++) 
    { 
        // Check if the picked element is already printed 
        int j; 
        for (j=0; j<i; j++) 
           if (arr[i] == arr[j]) 
               break; 
  
        // If not printed earlier, then print it 
        if (i == j) 
          cout << arr[i] << " "; 
    } 
} 

//USING SORTING - O(nLogn)
void printDistinct(int arr[], int n) 
{ 
    // First sort the array so that all occurrences become consecutive 
    sort(arr, arr + n); 
  
    // Traverse the sorted array 
    for (int i=0; i<n; i++) 
    { 
       // Move the index ahead while there are duplicates 
       while (i < n-1 && arr[i] == arr[i+1]) 
          i++; 
  
       // print last occurrence of the current element 
       cout << arr[i] << " "; 
    } 
}

//USING HASHING - O(N)

void printDistinct(int arr[],int n) 
{ 
    // Creates an empty hashset 
    unordered_set<int> s; 
  
    // Traverse the input array 
    for (int i=0; i<n; i++) 
    { 
        // If not present, then put it in 
        // hashtable and print it 
        if (s.find(arr[i])==s.end()) 
        { 
            s.insert(arr[i]); 
            cout << arr[i] << " "; 
        } 
    } 
} 


