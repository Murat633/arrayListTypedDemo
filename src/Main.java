import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("Ankara");
        sehirler.add("İstanbul");
        sehirler.add("Hatay");
        sehirler.add("Adıyaman");
        sehirler.add("Şanlıurfa");
        sehirler.add("İzmir");


        Collections.sort(sehirler);
        for(String sehir:sehirler){
            System.out.println(sehir);
        }
    }
}