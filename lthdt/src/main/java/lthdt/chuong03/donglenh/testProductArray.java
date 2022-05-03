/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lthdt.chuong03.donglenh;

import java.util.Arrays;
import lthdt.chuong03.coffelogic.Product;
import lthdt.chuong03.coffelogic.ProductCompByName;
import lthdt.chuong03.coffelogic.ProductCompByPrice;

/**
 *
 * @author Administrator
 */
public class testProductArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Tao mang cac san pham
        Product[] sp = new Product[]{new Product("Sunsik", 12),
                                     new Product("Lifebouy", 5),
                                     new Product("Espresso", 2),
                                     new Product("Thien long", 1)};
        System.out.println("Mang ban dau la ");
        System.out.println(Arrays.toString(sp));
//        Product temp;
//        for(int i = 0; i < sp.length - 1; i++){
//            for(int j = i + 1; j < sp.length; j++)
//                if(sp[i].getPrice() > sp[j].getPrice()){
//                    temp = sp[i];
//                    sp[i] = sp[j];
//                    sp[j] = temp;
//                }
            //sap xep mang theo gia ca tang dan
//            Arrays.sort(sp, new ProductCompByPrice());
//            System.out.println("Mang sap xep tang dan theo gia ca");
//            System.out.println(Arrays.toString(sp));
            System.out.println("Sap xep san pham theo ten san pham");
            Arrays.sort(sp, new ProductCompByName());
            System.out.println(Arrays.toString(sp));
        }
    }
    

