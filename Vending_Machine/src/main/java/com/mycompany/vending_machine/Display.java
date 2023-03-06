package com.mycompany.vending_machine;

public class Display {
    
    private String message = "";


    public Display() {

        this.message = "Select Drink";

    }

    public Display(String value) {

        message = value;

    }

    public Display(int credit){

        message = "Credit:     ";

        String formatCredit = String.valueOf((float) credit/100);

        if (formatCredit.length() < 4) {
            formatCredit += "0";
        }

        this.message += "£" + formatCredit;

    }

    public Display(String index, int stock, int price, int credit) {

        message = index + "     ";
        
        if  (stock > 0){

            String formatPrice = String.valueOf((float) (price - credit)/100);

            if (formatPrice.length() < 4) {
                formatPrice += "0";
            }

            this.message += "£" + formatPrice;
        }
        else {
            message += "out of stock";
        }

    }

    public String getMessage() {
        return message;
    }

}
