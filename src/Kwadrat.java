public class Kwadrat extends Figura{
int a;
Kwadrat(int a) {
    this.a = a;
}
@Override
    int pole(){
    return a*a;
}
@Override
    int obwod(){
    return 4*a;
}
}
