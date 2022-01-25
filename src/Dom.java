public class Dom implements Budynek{

    /* zad.2
a) napisać klasę Dom implementującą interfejs Budynek,
b) zaimplementować wszystkie metody,
c) stworzyć brakujące pola(prywatne), gettery i settery, napisać metodę toString
(gettery i settery najlepiej wygenerować: Code/Prawy myszy --> Generate --> getters/setters/toString)
d) stworzyć jedną dowolną metodę przez siebie
*/

    private double powierzchnia;
    private String adres;
    private int liczbaOkien;
    private int liczbaMieszkancow;
    private KolorEnum kolor;

    @Override
    public double powierzchnia(double pow) {
        this.powierzchnia = pow;
        return this.powierzchnia;
    }

    @Override
    public String adresBudynku(String adres) {
        this.adres = adres;
        return this.adres;
    }

    @Override
    public int liczbaOkien(int value) {
        this.liczbaOkien = value;
        return this.liczbaOkien;
    }

    @Override
    public void liczbaMieszkancow(int value) {
        this.liczbaMieszkancow = value;
    }

    @Override
    public void kolorDomu(KolorEnum kolor) {
        this.kolor = kolor;
    }

    //przypisuje nowe wartosci do powierchni i liczby mieszkancow. zwaraca  srednia Wielkosc Na Mieszkanca
    @Override
    public double sredniaWielkoscNaMieszkanca(double pow, int liczbaMieszkancow) {
        this.powierzchnia = pow;
        this.liczbaMieszkancow = liczbaMieszkancow;
        return pow/liczbaMieszkancow;
    }

    @Override
    public String toString() {
        return "Dom:\n" +
                "Powierzchnia wynosi " + powierzchnia +
                "\nAdres: " + adres  +
                "\nLiczba okien wynosi " + liczbaOkien +
                "\nLiczba mieszancow wynosi " + liczbaMieszkancow +
                "\nKolor to " + kolor;
    }





}