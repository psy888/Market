package com.psy888;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private static final String COMMAND_EXIT = "*";
    private static final String COMMAND_BACK = "-";
    private static final String COMMAND_SHOW_CART = "/";
    private static final String COMMAND_ADD_TO_CART = "+";
    private static final String COMMAND_CLEAR_CART = "#";
    private static final String COMMAND_CONFIRM_ORDER = "$";

    private ArrayList<Product> products;
    private ArrayList<Product> cart;
    private ArrayList<Order> orders;
    private Scanner scanner;
    private String userInput;
    private String userInputHistory;


    public Menu(ArrayList<Product> products) {
        this.products = products;
        //inner init
        this.cart = new ArrayList<>();
        this.orders = new ArrayList<>();
        this.scanner = new Scanner(System.in);
        this.userInput = "";
    }

    public void startMenu() {
//        String userChoice = "";
        do {
            if (userInput.matches("\\d+")) {
                userInputHistory = userInput; // save list index ( possibility add to cart )
                UIOut.printMsg(products.get(Integer.parseInt(userInput.trim())).fullInfo());
            } else {
                switch (userInput.trim()) {
                    case COMMAND_SHOW_CART:
                        showCart();
                        break;
                    case COMMAND_ADD_TO_CART:
                        if (userInputHistory != null) {
                            Product selectedProduct = products.get(Integer.parseInt(userInputHistory));
                            if (addToCart(selectedProduct)) {
                                UIOut.printMsg(selectedProduct.getManufacturer() + " " +
                                        selectedProduct.getModel() + " " +
                                                "добавлен в корзину.");
                            } else {
                                UIOut.printMsg("Невозможно добавить в корзину! Остаток на складе : "+
                                        selectedProduct.getQuantity());
                            }
                            setDefUserInput();
                            continue; // перезапуск цикл с default values
                        }
                        break;
                    case COMMAND_CLEAR_CART:
                        if(clearCart()){
                            UIOut.printMsg("Все товары удалены из корзины");
                        }else{
                            UIOut.printMsg("Корзина и так пуста");
                        }
                        setDefUserInput();
                        continue;
//                        break;
                    case COMMAND_CONFIRM_ORDER:
                        //todo create order and put to ordersList
                        Order confirmedOrder = new Order(cart);
                        if(orders.add(confirmedOrder)){
                            UIOut.printMsg("Заказ оформлен!");
                            UIOut.printMsg(confirmedOrder.orderInfo());
                            cart.clear();//clear Cart!!!!
                        }else {
                            UIOut.printMsg("Возникла ошибка");
                        }
                        setDefUserInput();
                        continue;
//                        break;
                    case COMMAND_EXIT:
                        scanner.close();
                        return;
                    case COMMAND_BACK:
                    default:
                        showList(products);
                        break;
                }
            }

            //нижнее меню
            showBottomMenu();

            userInput = scanner.nextLine();
        } while (!userInput.contentEquals(COMMAND_EXIT));
    }

    private void setDefUserInput(){
        userInputHistory = null;
        userInput = "";

    }

    private boolean clearCart() {
        if(cart.size()>0){
            for (Product product : cart) { //возврат товаров на склад
                product.setQuantity(product.getQuantity()+1);
            }
            return true;
        }else{
            return false;
        }
    }

    private void showCart() {
        UIOut.printHighlightedMsg("Корзина");
        if (cart.size() > 0) {
            for (int i = 0; i < cart.size(); i++) {
                UIOut.printMsg(i + ". " + cart.get(i));
            }
        } else {
            UIOut.printMsg("Корзина пуста.");
        }
    }

    private void showList(ArrayList<Product> products) {
        for (int i = 0; i < products.size(); i++) {
            UIOut.printMsg(i + ". " + products.get(i).shortInfo());
        }
    }

    private void showBottomMenu() {
        // todo fix bottom menu
        UIOut.printHighlightedMsg("\n|\t\"*\" - выход\t|\t\"0 - " + products.size() + "\" - выбор продукта\t|\t" + (userInput.matches("\\d+") ? "\"-\" - назад к общему списку\t|" : ""));
    }

    private boolean addToCart(Product product) {
        if (product.getQuantity() > 0) {
            product.setQuantity(product.getQuantity() - 1);
            return true;
        } else {
            return false;
        }
    }
}
