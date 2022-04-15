import io.cucumber.java.eo.Do;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class House {
    private String id;
    private Integer mlsId;
    private String mlsListingId;
    private String propertyType;
    private String formattedAddress;
    private String address;
    private String zip;
    private String city;
    private String state;

    //Location
    public List<Coordinates> Coordinates = new ArrayList<Coordinates>();

    private Integer bedrooms;
    private Integer bathrooms;
    private String listDate;
    private String mlsUpdateDate;
    private String priceDisplay;
    private Integer price;
    private Integer squareFeet;


    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public int getMls_id() {
        return mlsId;
    }
    public void setMlsId(int mlsId) {
        this.mlsId = mlsId;
    }
    public String getMlsListingId() {
        return mlsListingId;
    }
    public void setMlsListingId(String mlsListingId) {
        this.mlsListingId = mlsListingId;
    }
    public String getPropertyType() {
        return propertyType;
    }
    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }
    public String getFormattedAddress() {
        return formattedAddress;
    }
    public void setFormattedAddress(String formattedAddress) {
        this.formattedAddress = formattedAddress;
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

    public String getListDate() {
        return listDate;
    }
    public void setListDate(String listDate) {
        this.listDate = listDate;
    }

    public String getMlsUpdateDate() {
        return mlsUpdateDate;
    }
    public void setMlsUpdateDate(String mlsUpdateDate) {
        this.mlsUpdateDate = mlsUpdateDate;
    }

    public String getPriceDisplay() {
        return priceDisplay;
    }
    public void setPriceDisplay(String priceDisplay) {
        this.priceDisplay = priceDisplay;
    }

    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public Integer getSquareFeet() {
        return squareFeet;
    }
    public void setSquareFeet(Integer squareFeet) {
        this.squareFeet = squareFeet;
    }


    public  class Coordinates{
        private Double coordinates;

        public double getCoordinates() {
            return coordinates;
        }
        public void setCoordinates(Double coordinates) {
            this.coordinates = coordinates;
        }
    }
}


