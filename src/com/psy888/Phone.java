package com.psy888;

public class Phone extends Product {

    private String color;
    private int simCardAmount;
    private double screenSizeInches;
    private int ramGb;
    private double cpuFreqGHz;
    private int cpuCoreCount;

    public Phone(String manufacturer, String model, double price, int quantity, String color, int simCardAmount, double screenSizeInches, int ramGb, double cpuFreqGHz, int cpuCoreCount) {
        super(manufacturer, model, price, quantity);
        this.color = color;
        this.simCardAmount = simCardAmount;
        this.screenSizeInches = screenSizeInches;
        this.ramGb = ramGb;
        this.cpuFreqGHz = cpuFreqGHz;
        this.cpuCoreCount = cpuCoreCount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSimCardAmount() {
        return simCardAmount;
    }

    public void setSimCardAmount(int simCardAmount) {
        this.simCardAmount = simCardAmount;
    }

    public double getScreenSizeInches() {
        return screenSizeInches;
    }

    public void setScreenSizeInches(double screenSizeInches) {
        this.screenSizeInches = screenSizeInches;
    }

    public int getRamGb() {
        return ramGb;
    }

    public void setRamGb(int ramGb) {
        this.ramGb = ramGb;
    }

    public double getCpuFreqGHz() {
        return cpuFreqGHz;
    }

    public void setCpuFreqGHz(double cpuFreqGHz) {
        this.cpuFreqGHz = cpuFreqGHz;
    }

    public int getCpuCoreCount() {
        return cpuCoreCount;
    }

    public void setCpuCoreCount(int cpuCoreCount) {
        this.cpuCoreCount = cpuCoreCount;
    }


    @Override
    public String fullInfo() {
        String fullInfo = this.shortInfo() + "\n" +
                "Цвет : \t" + this.color +"\n" +
                "Кол-во сим-карт : \t" + this.simCardAmount + "\n" +
                "Диогональ экрана : \t" + this.screenSizeInches + "\"\n" +
                "Частота процессора : \t" + this.cpuFreqGHz + " GHz\n" +
                "Кол-во ядер : \t" + this.cpuCoreCount + "\n" +
                "RAM : \t" + this.ramGb;
        return fullInfo;
    }
}
