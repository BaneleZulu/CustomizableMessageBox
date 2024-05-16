/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nihil.Code;

/**
 *
 * @author LATITUDE 5410
 */
import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class RoundedPanel extends JPanel {

    int radius;
    Color backcolor;

    public RoundedPanel(int radius) {
        this.radius = radius;
    }

    public RoundedPanel(int radius, Color color) {
        this.radius = radius;
        this.backcolor = color;
    }

    public void paintComponent(Graphics g) {
        //super.paintComponent(g);

        Dimension arc = new Dimension(radius, radius);
        int width = this.getWidth();
        int height = this.getHeight();

        Graphics2D graphics = (Graphics2D) g;
        if (backcolor != null) {
            graphics.setColor(backcolor);
        } else {
            graphics.setColor(getBackground());
        }
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.fillRoundRect(0, 0, width - 1, height - 1, arc.width, arc.height);
        graphics.setColor(getForeground());
    }
}
