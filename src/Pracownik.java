public class Pracownik implements PracownikI {
    private String firma;
    public void setFirma (String value){
        this.firma = value;
    }
    @Override
    public String witam(){
        return "Witamy w firmie " + firma;
    }
    @Override
    public String żegnam(){
        return "Zapraszamy ponownie";
    }
    @Override
    public String ZrobRaport(){
        return "Robię raport";
    }
    @Override
    public String WezNadgodziny(){
        return "Biorę nadgodziny";
    }
    @Override
    public String ZrobPrzerwe(){
        return "Robię przerwę";
    }

}
