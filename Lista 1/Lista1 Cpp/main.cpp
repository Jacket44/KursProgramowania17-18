#include <iostream>
#include <cstdlib>

using namespace std;

class LiczbyPierwsze
{
    public:

        int tab_prime[1000];

        LiczbyPierwsze(int n){
            int k = 0;
            for(int i = 2; i <= n; i++){
                if(if_prime(i)){
                    tab_prime[k] = i;
                    k++;
                }
            }

        }



        bool if_prime(int n)
        {
            if(n<2)
                return false;

            for(int i=2;i*i<=n;i++)
                if(n%i==0)
                    return false;
            return true;
        }
        int liczba(int m){
            return tab_prime[m];
        }
};


int main(int argc, char* argv[])
{

    int x = atoi(argv[1]);
    LiczbyPierwsze kasztanek(x);
    for(int i = 2 ; i < x; i++){
      int x = atoi(argv[i-2]);
      cout << argv[i] << " - " << kasztanek.liczba(x) << "\n";

    }
    return 0;
}
