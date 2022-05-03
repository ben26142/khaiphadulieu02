/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong03.donglenh;

import lthdt.chuong03.coffelogic.Bill;
import lthdt.chuong03.coffelogic.Product;

/**
 *
 * @author Administrator
 */
public class testBill {
    public static void main(String[] args) throws CloneNotSupportedException{
        Bill a = new Bill(12, new Product[]{
                 new Product("Shampoo", 12),
                 new Product("Closeup", 21)});
        
        System.out.println("a =" + a);
        
        Bill temp = (Bill) a.clone();
        temp.setBillID(15);
        
        System.out.println("a =" + a);
        System.out.println("temp = " + temp);
        }
    }
    
