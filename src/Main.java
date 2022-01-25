public class Main {
    public static void main(String[] args) {
        /* zad.3
        a) w klasie Main stworzyć 2 objekty typu Dom deklarując pierwszy objekt Typem Dom,
        drugi objekt typem Budynek,
        b) wykorzystać wszystkie metody do implementacji pól
        c) wyświetlić w konsoli metodę toString (na obu obiektach) opisującą zachowanie klasy Dom
        */

        Dom dom1 = new Dom();
        Budynek dom2 = new Dom();

        dom1.powierzchnia(70.50);
        dom1.adresBudynku("Gdańsk, ul. Polna 130");
        dom1.kolorDomu(KolorEnum.CZERWONY);
        dom1.liczbaMieszkancow(4);
        dom1.sredniaWielkoscNaMieszkanca(70.50,4);
        System.out.println(dom1.toString());

        dom2.powierzchnia(120.35);
        dom2.adresBudynku("Gdynia, ul. Morska 15");
        dom2.kolorDomu(KolorEnum.BIALY);
        dom2.liczbaMieszkancow(5);
        dom2.sredniaWielkoscNaMieszkanca(120.35,5);
        System.out.println(dom2.toString());
    }
}