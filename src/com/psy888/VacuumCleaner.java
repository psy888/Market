package com.psy888;

public class VacuumCleaner extends Product
{
    public static final int TYPE_COMMERCIAL = 0;
    public static final int TYPE_CANISTER = 1;
    public static final int TYPE_ROBOT = 2;
    public static final int TYPE_WASHER = 3;



    private String color;
    private int wattPower;
    private int type;
    private boolean hasHepaFilter;

    public VacuumCleaner(String manufacturer, String model, double price, int quantity, String color, int wattPower, int type, boolean hasHepaFilter) {
        super(manufacturer, model, price, quantity);
        this.color = color;
        this.wattPower = wattPower;
        this.type = type;
        this.hasHepaFilter = hasHepaFilter;
        productId +=10000;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWattPower() {
        return wattPower;
    }

    public void setWattPower(int wattPower) {
        this.wattPower = wattPower;
    }

    public void setType(int type) {
        this.type = type;
    }

    public boolean isHasHepaFilter() {
        return hasHepaFilter;
    }

    public void setHasHepaFilter(boolean hasHepaFilter) {
        this.hasHepaFilter = hasHepaFilter;
    }

    @Override
    public String fullInfo() {
        String fullInfo = this.shortInfo() + "\n" +
                "Цвет : \t" + this.color + "\n" +
                "HEPA фильтр : \t" + ((this.hasHepaFilter) ? "есть" : "нет") + "\n" +
                "Тип : \t" + this.getType() + "\n" +
                "Мощность : \t" + this.wattPower + " Вт.\n";
        return fullInfo;
    }

    private String getType() {
        switch (this.type) {
            case TYPE_COMMERCIAL:
                return "строительный";
            case TYPE_CANISTER:
                return "без мешка";
            case TYPE_ROBOT:
                return "робот пылесос";
            case TYPE_WASHER:
                return "моющий";
            default:
                return "";
        }
    }
}
