/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lthdt.chuong05.donglenh;

import java.io.File;
import lthdt.chuong05.logic.FileAndDirectoryOperations;

/**
 *
 * @author Administrator
 */
public class testFileAndDirectory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileAndDirectoryOperations fo = new FileAndDirectoryOperations();
//        File[] content = fo.getDirectoryContent("D:\\mon hoc\\khai pha du lieu\\LTHDT\\CODE");
//        System.out.println(fo.displayContent(content));
//        File[] thumuc = fo.getsubDirectories(content);
//        System.out.println("Danh sach cac thu muc con la");
//        System.out.println(fo.displayContent(thumuc));
//        File[] taptin = fo.getFiles(content);
//        System.out.println("Danh sach cac tap tin la");
//        System.out.println(fo.displayContent(taptin));
         fo.getContentRecursively("D:\\mon hoc");
    }
    
}
