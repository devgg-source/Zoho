/*

  INPUT  :  
  
  Enter the array size  :  4
  Enter the elements  :  1 4 973 97
  Enter number of digits  :  3
  
  OUTPUT  :

  974 

  INPUT  :  
  
  Enter the array size  :  6
  Enter the elements  :  1 4 89 73 9 7
  Enter number of digits  :  5
  
  OUTPUT  :

  98973




*/

#include<iostream>
#include<algorithm>
using namespace std;
bool cmp(string str1,string str2){
string temp1=str1+str2;
string temp2=str2+str1;
return temp1>temp2;

}
int main() {
int t;
cin>>t;
while(t--){
int n;
cin>>n;
string str[n];
for(int i=0;i<n;i++) 
cin>>str[i];
sort(str,str+n,cmp);
for(int i=0;i<n;i++) 
cout<<str[i]; 
cout<<endl;
}
return 0;
}
