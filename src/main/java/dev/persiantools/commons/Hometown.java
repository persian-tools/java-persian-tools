package dev.persiantools.commons;

public class Hometown {

    private final String code;
    private final String city;
    private final String province;

    public Hometown(String code, String city, String province) {
        this.code = code;
        this.city = city;
        this.province = province;
    }

    public String getCode() {
        return code;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }
}
