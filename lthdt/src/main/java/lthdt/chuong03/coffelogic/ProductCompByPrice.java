/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong03.coffelogic;

import java.util.Comparator;

/**
 *
 * @author Administrator
 */
public class ProductCompByPrice implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        double temp = o1.getPrice() - o2.getPrice();
        return (int)temp;
    }
    
}
