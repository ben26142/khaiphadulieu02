/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lthdt.chuong03.donglenh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import lthdt.chuong03.coffelogic.CoffeeShop;
import lthdt.chuong03.coffelogic.Manager;

/**
 *
 * @author Administrator
 */
public class testCoffee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        CoffeeShop[] a = new CoffeeShop[]{new CoffeeShop("Kha Coffee", "2 Nguyen Hue"),
                                           new CoffeeShop("while garden", "27 Nguyen Hue"),
                                          new CoffeeShop("Hoang Truc Vien", "1 Nguyen Hue")};
        Manager[] managers = new Manager[]{
                               new Manager(a, 1000, "Tran Van B", 0, df.parse("12-12-1999")),
                               new Manager(new CoffeeShop[]{
                                            new CoffeeShop("Hoang Hac", "12 Nguyen Hue")
                         },
                    2000, "Nguyen B" , 1, df.parse("09-12-2000")) 
                       };
        System.out.println(Arrays.toString(managers));
    }
    
}
