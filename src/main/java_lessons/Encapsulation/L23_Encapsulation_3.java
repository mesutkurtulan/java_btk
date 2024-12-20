package Encapsulation;

import Encapsulation.L23_Encapsulation_1;
import Encapsulation.L23_Encapsulation_2;

public class L23_Encapsulation_3 {

    public static void main(String[] args) {

        // Parametreli Constructor ile obj1 oluşturuldu.
        L23_Encapsulation_1 obj1 = new L23_Encapsulation_1(1, "Laptop", "Asus Laptop", 1000, 100);

        // Parametresiz Constructor ile obj2 oluşturuldu.
        L23_Encapsulation_1 obj2 = new L23_Encapsulation_1();
        obj2.setName("Laptop");
        obj2.setDescription("Asus Laptop");
        obj2.setPrice(1000);
        obj2.setId(1);

        L23_Encapsulation_2 obj3 = new L23_Encapsulation_2();
        obj3.Add1(obj1);
    }
}
