package org.example;

public class Property {
    private String propertyId;
    private String address;
    private int constructionYear;
    private String propertyType;
    private String ownerVatNumber;


    public Property(String propertyId, String address, int constructionYear, String propertyType, String ownerVatNumber) {
        this.propertyId = propertyId;
        this.address = address;
        this.constructionYear = constructionYear;
        this.propertyType = propertyType;
        this.ownerVatNumber = ownerVatNumber;
    }


    public String getPropertyId() { return propertyId; }
    public void setPropertyId(String propertyId) { this.propertyId = propertyId; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public int getConstructionYear() { return constructionYear; }
    public void setConstructionYear(int constructionYear) { this.constructionYear = constructionYear; }

    public String getPropertyType() { return propertyType; }
    public void setPropertyType(String propertyType) { this.propertyType = propertyType; }

    public String getOwnerVatNumber() { return ownerVatNumber; }
    public void setOwnerVatNumber(String ownerVatNumber) { this.ownerVatNumber = ownerVatNumber; }

















}