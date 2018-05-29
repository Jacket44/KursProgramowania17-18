public class LiczbyPierwsze {
    public int[] tablica;

    public LiczbyPierwsze(int n) {
        int k = 0;
        tablica = new int[n+1];

        for(int i = 2; i <= n; i++){
            if(czyPierwsza(i)){
                tablica[k] = i;
                k++;
            }
        }
    }

    public int liczba(int m){
      return tablica[m];
    }

    public boolean czyPierwsza(int n){
        for(int i = 2; i*i <= n; i++){
            if(n % i == 0 )
                return false;
        }
        return true;
    }
}
