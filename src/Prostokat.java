public class Prostokat extends Figura{

    int a;
    int b;

    Prostokat(int a, int b){
        this.a = a;
        this.b = b;
    }

    @Override
    int pole(){
        return a*b;
    }
    @Override
    int obwod(){
        return 2*a+2*b;
    }


}
