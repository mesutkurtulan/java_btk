package Overriding;

public class Main {
    public static void main(String[] args) {
        /*
        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        double ogretmenKredi = ogretmenKrediManager.hesapla(1000000);
        System.out.println(ogretmenKredi);
        */

        BaseKrediManager[] baseKrediManager = new BaseKrediManager[]{new OgretmenKrediManager(), new TarımKrediManager(), new OgrenciKrediManager()};

        for (BaseKrediManager krediManager : baseKrediManager){
            System.out.println(krediManager.hesapla(1000));
        }
    }
}
