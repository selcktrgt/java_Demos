public class Main {

    public static void main(String[] args) {


        String ogrenciler[]=new String[4];
        ogrenciler[0]="Selo";
        ogrenciler[1]="Faho";
        ogrenciler[2]="Samo";
        ogrenciler[3]="Apo";
        for(int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }

        System.out.println("----------------");
       //bu yöntem daha çok kullanılır.
        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
    }
}
