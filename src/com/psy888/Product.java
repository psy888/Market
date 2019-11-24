package com.psy888;

public abstract class Product {

    protected static long id = 0;

    private String manufacturer;
    private String model;
//    private String title;
    private String description;
    private String[] pictureUrl;
    private double price;
    private int warrantyMonthCnt;

    protected long productId;

    private int quantity;

    {
        productId = id;
        id++;
    }

    //short
    public Product(String manufacturer, String model, double price, int quantity) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }

    //full
    public Product(String manufacturer, String model, String description, String[] pictureUrl, double price, int warrantyMonthCnt, int quantity) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.description = description;
        this.pictureUrl = pictureUrl;
        this.price = price;
        this.warrantyMonthCnt = warrantyMonthCnt;
        this.quantity = quantity;
    }

    public static long getId() {
        return id;
    }

    public static void setId(long id) {
        Product.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String[] pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = (price<0)?0:price;
    }

    public int getWarrantyMonthCnt() {
        return warrantyMonthCnt;
    }

    public void setWarrantyMonthCnt(int warrantyMonthCnt) {
        this.warrantyMonthCnt = (warrantyMonthCnt<0)?0:warrantyMonthCnt;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = (quantity<0)?0:quantity;
    }

    public String shortInfo (){
        String info = ((this.manufacturer!=null)?this.manufacturer:"") + " " +
                ((this.model!=null)?this.model:"") + " " +
                this.quantity + " шт " +
                this.price + " грн.";
        return info;
    }

    public abstract String fullInfo();
}
