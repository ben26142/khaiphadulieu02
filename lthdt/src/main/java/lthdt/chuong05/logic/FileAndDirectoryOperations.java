/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong05.logic;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class FileAndDirectoryOperations {

    public FileAndDirectoryOperations() {
    }
    
    //Thao tac 1: liet ke tat ca cac thu muc va tap tin trong thu muc hien tai
    public File[] getDirectoryContent(String Folder){
        File directory = new File(Folder);
        if(directory.isFile())
            return null;
        File[] result = directory.listFiles();
        return result;
    }
    
    //Thao tac 2: xuat ket qua
    public String displayContent(File[] content){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < content.length; i++){
            sb.append(content[i].getPath()).append(File.separator).append(content[i].getName());
            sb.append("\n");
        }
        return sb.toString();
    }
    
    //Thao tac 3: loc ra cac thu muc
    public File[] getsubDirectories(File[] content){
        ArrayList<File> result = new ArrayList<>();
        for(int i = 0; i < content.length; i++){
            if(content[i].isDirectory()){
                result.add(content[i]);
            }
        }
        File[] ketqua = new File[result.size()];
        return result.toArray(ketqua);
    }
    
    //Thao tac 4: loc ra tat ca ca tap tin
    public File[] getFiles(File[] content){
         ArrayList<File> result = new ArrayList<>();
        for(int i = 0; i < content.length; i++){
            if(content[i].isFile()){
                result.add(content[i]);
            }
        }
        File[] ketqua = new File[result.size()];
        return result.toArray(ketqua);
    }
    
    //Thao tac 5: duyet de quy va xuat tat ca cac tap tin
    public void getContentRecursively(String folder){
        File content = new File(folder);
        //dieu kien dung
        if(content.isFile()){
            System.out.println(content.getPath() + File.separator + content.getName());
            return;
        }
        //Cau goi de quy trong stack
        System.out.println("Thumuc: " + folder);
        File[] sub = content.listFiles();
        for(int i = 0; i < sub.length; i++){
            getContentRecursively(folder + File.separator + sub[i].getName());
        }
    }
}
