public class Klient {
    private String imię;
    private String nazwisko;
    private String adres;

    public Klient(String imię, String nazwisko, String adres) {
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.adres = adres;
    }

    public String pobierzImię() {
        return imię;
    }

    public String pobierzNazwisko() {
        return nazwisko;
    }

    public String pobierzAdres() {
        return adres;
    }
}