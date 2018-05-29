public class RzymArab {

   private static final String[] liczbyrzym = {
      "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };

   private static final int[] liczbyarab = {
      1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };

   private static final int wielkosctablic = 12;

//RZYM2ARAB
   public static int rzym2arab (String rzym) throws RzymArabException{
      int wynik = 0; // inicjuję pustą zmienną wynik
      String rzymkopia = rzym; // kopiuje input dla testu

      for (int i=wielkosctablic; i>=0;) {//zaczynamy od końca czyli wartości 12
        if (rzym.startsWith(liczbyrzym[i])) {//jeśli początek liczby zgadza się liczbyrzym
          wynik += liczbyarab[i];//dodaje wartość liczby rzymskiej
          rzym = rzym.substring(liczbyrzym[i].length());//usuwa początek inputu
        }
        else {
          i--;//sprawdza następną
        }
      }

      try {
        if (!rzym.isEmpty() || !rzymkopia.equals(arab2rzym(wynik))) {//jeżeli nie jest pusty po wykonaniu pętli lub nie równa się początkowej wartości
          throw new RzymArabException("niepoprawny format");
        }
      }
      catch (RzymArabException e) {
        throw new RzymArabException("niepoprawny format");
      }

      return wynik;
    }

//ARAB2RZYM
    public static String arab2rzym (int arab) throws RzymArabException{

      if (arab > 3999 || arab <= 0) {//warunek podany w treści zadania
        throw new RzymArabException("liczba nie moze zostac przekonwertowana");
      }

      String wynik = "";//inicjuję pusty string

      for (int i=wielkosctablic; i>=0;) {//zaczynamy od końca czyli 12
        if (arab >= liczbyarab[i]) {//jezeli input jest większy bądź równy dla liczbyarab
          wynik += liczbyrzym[i];//dodaje do stringu wynik rzymski odpowiednik arabskiej liczby
          arab -= liczbyarab[i];//i odejmuje ją od wartości arab
        }
        else {
          i--;//dekrementuję gdy liczba arabska jest mniejsza niż liczba arabska
        }
      }
      return wynik;
    }
}
