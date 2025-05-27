public class Main {

    public static void main(String[] args) {
      KrediUI krediUI=new KrediUI();
      krediUI.KrediHesapla(new OgretmenKrediManager());
      //KrediUI içinde BaseKrediManager'i verdiğimiz için extend edilen tüm sınıfları
        // bu şekilde kullanmamızı sağlıyor.
    }
}
