package AbstractClass;

public class Main {
    public static void main(String[] args) {
        ManGameCalculator manGameCalculator = new ManGameCalculator();
        manGameCalculator.hesapla();
        manGameCalculator.oyunuBitir();

        WomanGameCalculator workerGameCalculator = new WomanGameCalculator();
        workerGameCalculator.hesapla();
        workerGameCalculator.oyunuBitir();

        KidsGameCalculator kidsGameCalculator = new KidsGameCalculator();
        kidsGameCalculator.hesapla();
        kidsGameCalculator.oyunuBitir();
    }
}
