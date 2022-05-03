/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lthdt.donglenh.chuong01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Administrator
 */
public class Bai06 {
   public static void main(String[] args) throws ParseException{ 
       SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
       String input = "11-03-2001";
       Date ngaysinh = df.parse(input);
       person person = new person("Nguyen B", 2, ngaysinh);
       
       System.out.println("Ho ten: " + person.getHoten() + "; gioi tinh; "
                + person.getGioitinh() + "; ngay sinh: " +  
                df.format(person.getNgaysinh()));
       
       student sinhvien = new student();
       sinhvien.setHoten("Nguyen A");
       sinhvien.setGioitinh(1);
       sinhvien.setNgaysinh(df.parse("12-02-2012"));
       sinhvien.setTruonghoc("Dai hoc Hue");
       System.out.println(sinhvien.getHoten() + "; gioi tinh: " + 
                sinhvien.getGioitinh() + "; ngay sinh: " + 
                df.format(sinhvien.getNgaysinh()) + "; " + 
                sinhvien.getTruonghoc());
       System.out.println(sinhvien.calcTax(1200));
       
       Worker congnhan = new Worker();
       congnhan.setHoten("Le van A");
       congnhan.setGioitinh(3);
       congnhan.setNgaysinh(df.parse("02-09-2003"));
       congnhan.setCongty("IBM");
       System.out.println(congnhan.getHoten() + "; gioi tinh: " +
               congnhan.getGioitinh() + "; ngay sinh: " + 
               df.format(congnhan.getNgaysinh()) + "; cong ty: " +
               congnhan.getCongty());
       System.out.println(congnhan.calcTax(2000));
   }
}
