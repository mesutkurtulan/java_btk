package InheritanceExample;

public class Main {
    public static void main(String[] args) {
        /*
        TarimKrediManager tarimKrediManager = new TarimKrediManager();
        tarimKrediManager.KrediHesapla();
        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        ogretmenKrediManager.KrediHesapla();
        AskerKrediManager askerKrediManager = new AskerKrediManager();
        askerKrediManager.KrediHesapla();

        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(tarimKrediManager);
        krediUI.KrediHesapla(ogretmenKrediManager);
        krediUI.KrediHesapla(askerKrediManager);
         */

        //////////////
        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(new TarimKrediManager());
        krediUI.KrediHesapla(new OgretmenKrediManager());
        krediUI.KrediHesapla(new BaseKrediManager());
    }
}
