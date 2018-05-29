public class Test {
    public static void main (String[] args) {
    int n = 0; // variable for parsing inputs

    for (String arg : args) {
      try {
        n = Integer.parseInt(arg);
        System.out.println(RzymArab.arab2rzym(n));//jeżeli argument = liczba arabska
      }
      catch (NumberFormatException e) {
        try {
          System.out.println(RzymArab.rzym2arab(arg));//jeżeli argument = liczba rzymska
        }
        catch (RzymArabException ex) {//jeżeli argument jest błędny
          System.out.println(ex);
        }
      }
      catch (RzymArabException e) {//jeżeli argument jest błędny, wpisuje E bo wyżej już zaznaczyłem w kodzie ten błąd
        System.out.println(e);
      }
    }
  }
}
