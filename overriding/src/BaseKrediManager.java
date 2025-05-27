public class BaseKrediManager {
    public double hesapla(double tutar){
        return tutar * 1.18;
        //eğer miras veren class'daki metodun override edilmesini (miras verdiği başka classlar'da aynı
        //isimde metod açılması) istemiyorsak public sonrasında "final" yazarız.
    }
}
