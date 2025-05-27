import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList Sayilar=new ArrayList();
        Sayilar.add(10);
        Sayilar.add(3);
        Sayilar.add("Ankara");

        //0 indexli elemanı 200 olarak değiştir demek.
        //Sayilar.set(0,200);

        //0 indexli elemanı kaldır demek, bu şekilde 1 indexli eleman 0 indexli olmuş olur, sola kayar yani.
        //Sayilar.remove(0);

        //ArrayList'deki tüm elemanları temizler.
        //sayilar.clear();

        //ArrayList'deki elemanları sırayla ekrana yazdırma.
        for(Object i:Sayilar){
            System.out.println(i);
        }
    }
}
