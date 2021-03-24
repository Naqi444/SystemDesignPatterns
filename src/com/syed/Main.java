package com.syed;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Programming to an interface
//        TaxCalculator  taxCalculator = getCalculator();
//        System.out.println(taxCalculator.calculateTax());

//        var Mail = new MailService();
//        Mail.sendEmail();

//        var textBox = new TextBox();
//        textBox.enable();
        drawUIControl(new CheckBox());
    }

//    public static TaxCalculator getCalculator(){
//        return new TaxCalculator2019();
//    }
    public static  void drawUIControl(UIControl control){
        control.draw();
    }
}
