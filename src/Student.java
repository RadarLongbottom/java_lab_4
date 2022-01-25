public class Student implements StudentI {
    private String indeks;




    @Override
    public void setIndeks(String value){
        this.indeks = value;
    }
    @Override
    public String witam() {
        return "Dzień dobry";
    }
    @Override
    public String żegnam() {
        return "Do widzenia";
    }
    @Override
    public String IdzNaZajecia() {
        return "Idę na zajęcia";
    }
    @Override
    public String NapiszDoWykladowcy(){
        return "Dzień dobry moj numer indeksu to: " + indeks;
    }
    @Override
    public String WrocDoDomu(){
        return "Wracam do domu";
    }
}
