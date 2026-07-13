package pckg1;

import pckg2.Test;

public class Public {


    public static void main(String[] args) {

        Test var = new Test();
        System.out.println(var.publicVariable);          //Accessible outside the class and package (e.g. pckg2)
//        System.out.println(var.privateVariable);   --> NOT Accessible outside the class and package (e.g. pckg2)
//        System.out.println(var.protectedVariable); --> NOT Accessible outside the class and package (e.g. pckg2)
//        System.out.println(var.defaultVariable);   --> NOT Accessible outside the class and package (e.g. pckg2)




    }



}
