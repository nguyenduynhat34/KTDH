/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KTDH_Form.View;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author nguye
 */
public class ViewPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.MAGENTA);
        g.drawLine(320, 0, 320, 480);
        g.drawLine(0, 240, 680, 240);
        
    }
    
    public void putPixel(int x, int y, Graphics g) {
        g.setColor(Color.BLACK);
        g.drawLine(x,y,x,y);
        
    }
    
    public void putColorPixel(int x, int y, Color c, Graphics g) {
        g.setColor(c);
        g.drawLine(x, y, x, y);
    }
    
    public void line_DDA(int x1, int y1, int x2, int y2, Graphics g) {
        int x = x1;
    }
}
