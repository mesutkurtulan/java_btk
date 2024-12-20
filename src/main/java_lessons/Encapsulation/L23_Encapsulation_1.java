package Encapsulation;

public class L23_Encapsulation_1 {

    // Default Constructor
    public L23_Encapsulation_1() {
        // Constructor
        System.out.println("Encapsulation.L23_Encapsulation_1 Parametresiz Constructor Çalıştırıldı ve Product Attributes oluşturuldu");
    }


    // Parametreli Constructor
    // Bu Class'daki Tüm Attributes'lar Bu Constructor'ı çağıran class'da kullanılmalıdır.
    public L23_Encapsulation_1(int id, String name, String description, double price, int stockAmount) {
        // Constructor
        System.out.println("Encapsulation.L23_Encapsulation_1 Parametreli Constructor Çalıştırıldı ve Product Attributes oluşturuldu");
        _id = id;
        _name = name;
        _description = description;
        _price = price;
        _stockAmount = stockAmount;
    }

    // Attributes
    private int _id;
    private String _name;
    private String _description;
    private double _price;

    private int _stockAmount;

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        _id = id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;
    }

    public double getPrice() {
        return _price;
    }

    public void setPrice(double price) {
        _price = price;
    }

    public int getStockAmount() {
        return _stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        _stockAmount = stockAmount;
    }

}
