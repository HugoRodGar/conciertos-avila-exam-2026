package edu.iesam.features.concerts.domain;

public class Concert {

    private String id;
    private String artist;
    private String recint;
    private String date;
    private String maxCapacity;
    private String entrancePrice;

    public Concert(String id, String artist, String recint, String date, String maxCapacity, String entrancePrice) {
        this.id = id;
        this.artist = artist;
        this.recint = recint;
        this.date = date;
        this.maxCapacity = maxCapacity;
        this.entrancePrice = entrancePrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getRecint() {
        return recint;
    }

    public void setRecint(String recint) {
        this.recint = recint;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(String maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public String getEntrancePrice() {
        return entrancePrice;
    }

    public void setEntrancePrice(String entrancePrice) {
        this.entrancePrice = entrancePrice;
    }

    @Override
    public String toString() {
        return "Concert{" +
                "id='" + id + '\'' +
                ", artist='" + artist + '\'' +
                ", recint='" + recint + '\'' +
                ", date='" + date + '\'' +
                ", maxCapacity='" + maxCapacity + '\'' +
                ", entrancePrice='" + entrancePrice + '\'' +
                '}';
    }
}
