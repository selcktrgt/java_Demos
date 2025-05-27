public class OgrenciKrediManager extends BaseKrediManager {
    public double hesapla(double tutar) {
        return tutar * 1.10;
        //Base'deki aynı metod ismini burada da kullandık buna overriding(üstüne uazma) denilir.
        //ama burada yazan metod miras veren class'daki metoda ağır basar ve bu çalışır.
    }
}
