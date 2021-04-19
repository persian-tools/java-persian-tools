package dev.persiantools.commons;

public class Hometown {

    private final String city;
    private final String province;

    public Hometown(String city, String province) {
        this.city = city;
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }
}
