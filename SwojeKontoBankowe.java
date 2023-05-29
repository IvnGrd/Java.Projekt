public class SwojeKontoBankowe implements Operacje {
    private String numerKonta;
    private double saldo;
    private Klient właściciel;

    public SwojeKontoBankowe(String numerKonta, double saldo, Klient właściciel) {
        this.numerKonta = numerKonta;
        this.saldo = saldo;
        this.właściciel = właściciel;
    }

    public String pobierzNumerKonta() {
        return numerKonta;
    }

    public double pobierzSaldo() {
        return saldo;
    }

    public Klient pobierzWłaściciela() {
        return właściciel;
    }

    public void wpłacić(double kwota) {
        saldo += kwota;
        System.out.println("Operacja udana! Na koncie masz: " + kwota);
    }
    public void wypłacić(double kwota) {
        if (kwota <= saldo) {
            saldo -= kwota;
        } else {
            System.out.println("Nie masz wystarczająco środków na końcie!!!");
        }

    }

    public void wyświetlInformacjeOKoncie() {
        System.out.println("Numer konta: " + numerKonta);
        System.out.println("Właściciel: " + właściciel.pobierzImię() + " " + właściciel.pobierzNazwisko());
        System.out.println("Adres: " + właściciel.pobierzAdres());
        System.out.println("Saldo: " + saldo);
    }
}
