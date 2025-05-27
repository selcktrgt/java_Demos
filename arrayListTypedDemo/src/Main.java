import java.util.ArrayList;
import java.util.Collections;


public class Main {

    public static void main(String[] args) {

        ArrayList<String> Sehirler= new ArrayList<String>();

        Sehirler.add("Ankara");
        Sehirler.add("Izmir");
        Sehirler.add("Istanbul");
        /* verileri alfabeye göre sıralar. */
        Collections.sort(Sehirler);

        for(String sehirler:Sehirler){
            System.out.println(sehirler);
        }
    }
}
