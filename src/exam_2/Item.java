package exam_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Item {
    private String dealPrice;
    private int buildYear;
    private int dealYear;
    private String dong;
    private String apartNm;
    private int dealMon;
    private int dealDay;
    private double square;
    private int zipCode;
    private int floor;


    public String getDealDate(int dealYear, int dealMon, int dealDay) {
        return String.format("%04d-%02d-%02d", dealYear, dealMon, dealDay);
    }

    public int getPyeong() {
        return (int)Math.round(square/3.3);
    }


    public String getDealPrice() {
        return dealPrice;
    }

    public void setDealPrice(String dealPrice) {
        this.dealPrice = dealPrice
                .replace(" ", "")
                .replace(",", "");
    }

    public int getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    public int getDealYear() {
        return dealYear;
    }

    public void setDealYear(int dealYear) {
        this.dealYear = dealYear;
    }

    public String getDong() {
        return dong;
    }

    public void setDong(String dong) {
        this.dong = dong;
    }

    public String getApartNm() {
        return apartNm;
    }

    public void setApartNm(String apartNm) {
        this.apartNm = apartNm;
    }

    public int getDealMon() {
        return dealMon;
    }

    public void setDealMon(int dealMon) {
        this.dealMon = dealMon;
    }

    public int getDealDay() {
        return dealDay;
    }

    public void setDealDay(int dealDay) {
        this.dealDay = dealDay;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
