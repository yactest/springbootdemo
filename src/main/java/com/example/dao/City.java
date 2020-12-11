package com.example.dao;

public class City {
    /***
     * "city":"内江", #城市名称
     *     "cityEn":"neijiang",
     *     "country":"中国",
     *     "countryEn":"China",
     *     "wea":"阴", #实时天气情况
     *     "wea_img":"yin",
     *     "tem":"25", #实时温度
     *     "tem1":"29", #高温
     *     "tem2":"23", #低温
     */
    private String city;
    private String wea;
    private String tem;
    private String tem1;
    private String tem2;
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getWea() {
        return wea;
    }

    public void setWea(String wea) {
        this.wea = wea;
    }

    public String getTem() {
        return tem;
    }

    public void setTem(String tem) {
        this.tem = tem;
    }

    public String getTem1() {
        return tem1;
    }

    public void setTem1(String tem1) {
        this.tem1 = tem1;
    }

    public String getTem2() {
        return tem2;
    }

    public void setTem2(String tem2) {
        this.tem2 = tem2;
    }

    @Override
    public String toString() {
        return "City{" +
                "city='" + city + '\'' +
                ", wea='" + wea + '\'' +
                ", tem='" + tem + '\'' +
                ", tem1='" + tem1 + '\'' +
                ", tem2='" + tem2 + '\'' +
                '}';
    }
}
