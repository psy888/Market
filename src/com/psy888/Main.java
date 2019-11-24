package com.psy888;

import java.util.ArrayList;

public class Main {

    ArrayList<Product> products;
    public static void main(String[] args) {
	// dummy data
        ArrayList<Product> products = new ArrayList<>();
        products.add(new VacuumCleaner("Bosch", "XT60",4800,8,"синий", 2000, VacuumCleaner.TYPE_CANISTER,true));
        products.add(new VacuumCleaner("iBoot", "SC",10000,2,"белый", 800, VacuumCleaner.TYPE_ROBOT,false));
        products.add(new VacuumCleaner("Whirpool", "M685",3000,15,"черный", 1600, VacuumCleaner.TYPE_ROBOT,false));
        products.add(new Refrigerator("Samsung", "E295",18900,4,Refrigerator.TYPE_SIDE_BY_SIDE,"Серый",true,197,60,55,52));
        products.add(new Refrigerator("Samsung", "E135",12300,7,Refrigerator.TYPE_BOTTOM_FREEZER,"Белый",true,160,60,55,42));
        products.add(new Refrigerator("Siemens", "F48",19300,5,Refrigerator.TYPE_TOP_FREEZER,"Белый",false,180,60,55,49));
        products.add(new Refrigerator("Ardo", "5558",6100,9,Refrigerator.TYPE_MINI,"Белый",false,120,60,55,36));
        products.add(new Phone("Apple","iPhone 8",25000,2,"Золотой",1,6.7,4,1700,4));
        products.add(new Phone("Apple","iPhone 7",22000,3,"Белый",1,5.4,2,1400,2));
        products.add(new Phone("Xiaomi","MI 9",14000,8,"Синий",2,7.0,6,2200,4));


    }


}
