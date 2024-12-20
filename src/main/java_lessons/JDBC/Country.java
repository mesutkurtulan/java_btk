package JDBC;

public class Country {
    private String code;
    private String name;
    private String continent;
    private String region;

    public Country(String code, String name, String continent, String region) {
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.region = region;
    }

    /*
    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", continent='" + continent + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
     */

    @Override
    public String toString() {
        return code + " - " + name + " - " + continent + " - " + region;
    }
}
