import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Klient klient = new Klient("Ivan", "Hordieiev", "ul.Chopina 4");
        Operacje konto = new SwojeKontoBankowe("321321321", 5000.0, klient);

        konto.wyświetlInformacjeOKoncie();
        przetwarzajDziałanie(konto);
    }

    public static void przetwarzajDziałanie(Operacje konto) {
        Scanner sc = new Scanner(System.in);
        int wybór = 0;
        double kwota = 0.0;

        do {
            System.out.println("Wybierz działanie:");
            System.out.println("1. Wpłać");
            System.out.println("2. Wypłać");
            System.out.println("3. Wyświetl informacje o koncie");
            System.out.println("0. Wyjście");
            wybór = sc.nextInt();

            switch (wybór) {
                case 1:
                    System.out.println("Podaj kwotę do wpłaty:");
                    kwota = sc.nextDouble();
                    konto.wpłacić(kwota);
                    break;
                case 2:
                    System.out.println("Podaj kwotę do wypłaty:");
                    kwota = sc.nextDouble();
                    konto.wypłacić(kwota);
                    break;
                case 3:
                    konto.wyświetlInformacjeOKoncie();
                    break;
                case 0:
                    System.out.println("Program zakończony.");
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór. Spróbuj ponownie.");
                    break;
            }
        } while (wybór != 0);

        sc.close();
    }
}
