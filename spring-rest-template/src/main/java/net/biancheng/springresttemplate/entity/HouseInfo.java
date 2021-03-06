package net.biancheng.springresttemplate.entity;

public class HouseInfo {

    private Long id;

    private String city;

    private String region;

    private String name;

    public HouseInfo(){

    }

    public HouseInfo(Long id, String city, String region, String name) {
        this.id = id;
        this.city = city;
        this.region = region;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
