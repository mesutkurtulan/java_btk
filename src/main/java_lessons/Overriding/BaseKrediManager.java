package Overriding;

public class BaseKrediManager {

    // Final içeren bir Base Class'ın methodu child class tarafından override edilemez.
    // Static içeren bir Base Class'ın methodu child class tarafından override edilemez ancak aynı isimle bir method oluşturulabilir (Method Hiding)
    public double hesapla(double tutar) {
        return (tutar*1.18);
    }
}
