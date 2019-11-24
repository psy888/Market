package com.psy888;

public class Refrigerator extends Product {

    public static final int TYPE_TOP_FREEZER = 0;
    public static final int TYPE_BOTTOM_FREEZER = 1;
    public static final int TYPE_SIDE_BY_SIDE = 2;
    public static final int TYPE_MINI = 3;


    private int type;
    private String color;
    private boolean isNoFrost;
    private double heightCm;
    private double widthCm;
    private double depthCm;
    private double weightKg;

    public Refrigerator(String manufacturer, String model, double price, int quantity, int type, String color, boolean isNoFrost, double heightCm, double widthCm, double depthCm, double weightKg) {
        super(manufacturer, model, price, quantity);
        this.type = type;
        this.color = color;
        this.isNoFrost = isNoFrost;
        this.heightCm = heightCm;
        this.widthCm = widthCm;
        this.depthCm = depthCm;
        this.weightKg = weightKg;
        productId += 30000;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isNoFrost() {
        return isNoFrost;
    }

    public void setNoFrost(boolean noFrost) {
        isNoFrost = noFrost;
    }

    public double getHeightCm() {
        return heightCm;
    }

    public void setHeightCm(double heightCm) {
        this.heightCm = heightCm;
    }

    public double getWidthCm() {
        return widthCm;
    }

    public void setWidthCm(double widthCm) {
        this.widthCm = widthCm;
    }

    public double getDepthCm() {
        return depthCm;
    }

    public void setDepthCm(double depthCm) {
        this.depthCm = depthCm;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String fullInfo() {
        String fullInfo = this.shortInfo() + "\n" +
                "Цвет : \t" + this.color + "\n" +
                "Технология No Frost : \t" + ((this.isNoFrost) ? "есть" : "нет") + "\n" +
                "Тип : \t" + this.getType() + "\n" +
                "Высота : \t" + this.heightCm + " см.\n" +
                "Ширина : \t" + this.widthCm + " см.\n" +
                "Глубина : \t" + this.depthCm + " см.\n" +
                "Вес : \t" + this.weightKg + " кг.";
        return fullInfo;
    }

    private String getType() {
        switch (this.type) {
            case TYPE_TOP_FREEZER:
                return "морозильная камера сверху";
            case TYPE_BOTTOM_FREEZER:
                return "морозильная камера снизу";
            case TYPE_SIDE_BY_SIDE:
                return "side by side";
            case TYPE_MINI:
                return "мини холодильник";
            default:
                return "";
        }
    }
}
