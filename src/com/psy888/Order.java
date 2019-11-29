package com.psy888;

import java.util.ArrayList;
import java.util.Calendar;

public class Order {
    private static long orderId = 0;
    private ArrayList<Product> orderList;
    private long date;
    private long curOrderId;


    public Order(ArrayList<Product> orderList) {
        this.orderList = (ArrayList<Product>) orderList.clone();
        date = Calendar.getInstance().getTimeInMillis();
        curOrderId = orderId++;
    }

    public String orderInfo(){
        String order =  "Заказ №" + curOrderId + " от " + getDate() +"\n";
        double total = 0;
        for (int i = 0; i < orderList.size(); i++) {
             order+=i + ". " + orderList.get(i).getManufacturer() + " " +
                     orderList.get(i).getModel() + " " +
                     orderList.get(i).getPrice() + "\n";
             total+=orderList.get(i).getPrice();
        }
        order+="Общая сумма заказа : \t\t" + total + " грн.";

        return order;
    }

    private String getDate(){
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(date);

        return calendar.get(Calendar.DAY_OF_MONTH) + "/" +
                (calendar.get(Calendar.MONTH) + 1) + "/" +
                calendar.get(Calendar.YEAR);
    }
}
