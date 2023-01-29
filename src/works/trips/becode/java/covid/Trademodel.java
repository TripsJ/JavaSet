package works.trips.becode.java.covid;

import java.time.LocalDate;

public class Trademodel {

     /*public Trademodel(String direction, int year, LocalDate date, String day, String country, String commodity, String transport, String measure, String value, String cumulative) {
        this.direction = direction;
        this.year = year;
        this.date = date;
        this.day = day;
        this.country = country;
        this.commodity = commodity;
        this.transport = transport;
        this.measure = measure;
        this.value = value;
        this.cumulative = cumulative;
        lines ++;

    }*/
//Constructor
    public Trademodel(){
        lines++;
    }


//Getters and Setters
    public static int getLines() {
        return lines;
    }

    public String getDirection() {
        return direction;
    }

    public int getYear() {
        return year;
    }

    public String getDate() {
        return date;
    }

    public String getDay() {
        return day;
    }

    public String getCountry() {
        return country;
    }

    public String getCommodity() {
        return commodity;
    }

    public String getTransport() {
        return transport;
    }

    public String getMeasure() {
        return measure;
    }

    public String getValue() {
        return value;
    }

    public String getCumulative() {
        return cumulative;
    }

    //Direction,Year,Date,Weekday,Country,Commodity,Transport_Mode,Measure,Value,Cumulative
    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setYear(int year) {this.year = year;}

    public void setDate(String date) {
        this.date = date;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCommodity(String commodity) {
        this.commodity = commodity;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setCumulative(String cumulative) {
        this.cumulative = cumulative;
    }



    //Attributes
    static int lines = 0;
    private String direction;
    private int year;
    private String date;
    private String day;
    private String country;
    private String commodity;
    private String transport;
    private String measure;
    private String value;
    private String cumulative;



}
