import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String,String> sozluk= new HashMap<String,String>();
        sozluk.put("Computer","Bilgisayar");
        sozluk.put("Table","Masa");
        sozluk.put("Door","Kapı");
        System.out.println(sozluk.size());
        for(String item:sozluk.keySet()){
            System.out.println("Elema-"+item+" Değer="+sozluk.get(item));

            sozluk.remove("Table");
            sozluk.clear();
        }
    }
}
