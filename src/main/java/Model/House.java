package Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class House {
    private String id;
    private int mls_id;
    private String mls_listing_id;
    private String property_type;
    private String formatted_address;
    private String address;
    private String zip;
    private String city;
    private String state;
    public Double[] location;
    private Integer bedrooms;
    private Integer bathrooms;
    private String list_date;
    private String mls_update_date;
    private String price_display;
    private Integer price;
    private Integer square_feet;

    private Hero hero;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getMls_id() {
        return mls_id;
    }

    public void setMls_id(int mls_id) {
        this.mls_id = mls_id;
    }

    public String getMls_listing_id() {
        return mls_listing_id;
    }

    public void setMls_listing_id(String mls_listing_id) {
        this.mls_listing_id = mls_listing_id;
    }

    public String getProperty_type() {
        return property_type;
    }

    public void setProperty_type(String property_type) {
        this.property_type = property_type;
    }

    public String getFormatted_address() {
        return formatted_address;
    }

    public void setFormatted_address(String formatted_address) {
        this.formatted_address = formatted_address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Double[] getLocation() {
        return location;
    }

    public void setLocation(Double[] location) {
        this.location = location;
    }

    public Integer getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(Integer bedrooms) {
        this.bedrooms = bedrooms;
    }

    public Integer getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(Integer bathrooms) {
        this.bathrooms = bathrooms;
    }

    public String getList_date() {
        return list_date;
    }

    public void setList_date(String list_date) {
        this.list_date = list_date;
    }

    public String getMls_update_date() {
        return mls_update_date;
    }

    public void setMls_update_date(String mls_update_date) {
        this.mls_update_date = mls_update_date;
    }

    public String getPrice_display() {
        return price_display;
    }

    public void setPrice_display(String price_display) {
        this.price_display = price_display;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getSquare_feet() {
        return square_feet;
    }

    public void setSquare_feet(Integer square_feet) {
        this.square_feet = square_feet;
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }
}





