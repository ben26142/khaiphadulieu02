/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lthdt.chuong02.shapelogic;

import java.awt.Graphics2D;

/**
 *
 * @author Administrator
 */
public class DrawLine {
    private Graphics2D gr;
    private Line line;

    public DrawLine() {
    }

    public DrawLine(Graphics2D gr, Line line) {
        this.gr = gr;
        this.line = line;
    }

    public DrawLine(Graphics2D gr, Line line) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Graphics2D getGr() {
        return gr;
    }

    public void setGr(Graphics2D gr) {
        this.gr = gr;
    }

    public Line getLine() {
        return line;
    }

    public void setLine(Line line) {
        this.line = line;
    }
    
    public void veduongthang(){
        gr.drawLine(line.getBegin_x(), line.getBegin_y(), 
                    line.getEnd_x(), line.getEnd_y());
    }
}
