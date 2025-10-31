#include <iostream>
#include <string>
using namespace std;

int main()
{
    // your code goes here
    int t, s, count;
    string w;
    cin >> t;
    while (t--)
    {
        cin >> s >> w;
        count = 0;
        for (int i = 0; i < s; i++)
            {
                if (w[i] == 'a' || w[i] == 'e' || w[i] == 'i' || w[i] == 'o' || w[i] == 'u'){
                    count = 0;
                    continue;
                } else{
                   count++;
                   if(count == 4){
                        break;
                   }
                }
            }
        if(count >= 4){
            if(s<4){
                cout<<"YES"<<endl;
            } else{
                cout<<"NO"<<endl;
            }
        } else{
                cout<<"YES"<<endl;
            }
        
        
    }
    return 0;
}