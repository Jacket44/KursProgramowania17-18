public class Test {

    public static void main(String[] args) {

        try{

          int n = Integer.parseInt(args[0]);
          LiczbyPierwsze Orzeszek = new LiczbyPierwsze(Integer.parseInt(args[0]));

          for (int i = 1; i< args.length; i++){

            try{
                    n = Integer.parseInt(args[i]);
                    System.out.println(n + " - " + Orzeszek.liczba(n));
            }
            catch (NumberFormatException ex){
                    System.out.println(args[i] + " - nie jest liczba clakowita");
            }
            catch (ArrayIndexOutOfBoundsException ex){
                    System.out.println(args[i] + " - liczba spoza zakresu");
            }
          }
        }

        catch (NumberFormatException ex){
                    System.out.println(args[0] + " - nie jest liczba calkowita");
                    System.exit(1);
        }
        catch (IllegalArgumentException ex){
                    System.out.println(args[0] + " - nieprawidlowy zakres");
                    System.exit(1);
        }
        catch (NegativeArraySizeException ex){
          System.out.println(args[0] + " - nieprawidlowy zakres");
          System.exit(1);
        }
    }


}
