package com.driver;

public class Pizza {

    private int price;
    private int baseprice;
    private Boolean isVeg;
    private String bill;

    private boolean toppings;
    private boolean cheese;
    private boolean paperBag;

    private boolean billCreated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price=300;
        }
        else{
            this.price=400;
        }
        this.baseprice = price;

        this.bill = "Base Price Of The Pizza: " + this.baseprice + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!cheese) {
            this.price += 80;
            this.cheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!toppings) {
            if (this.isVeg) {
                price += 70;
            } else {
                price += 120;
            }

            this.toppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        this.paperBag = true;
        this.price+=20;
    }

    public String getBill(){
        // your code goes here
        if(!billCreated) {




            if (cheese) {
                this.bill += "Extra Cheese Added: 80" + "\n";
            }

            if (toppings) {
                if (isVeg) {
                    this.bill += "Extra Toppings Added: 70" + "\n";
                } else {
                    this.bill += "Extra Toppings Added: 70" + "\n";
                }
            }

            if (paperBag) {
                this.bill += "Paperbag Added: 20" + "\n";
            }
            this.bill += "Total Price: " + this.price + "\n";
            billCreated = true;


        }
        return this.bill;
    }
}
