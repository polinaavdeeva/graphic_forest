package ru.vsu.cs.avdeeva_p_a;

import java.awt.*;

public class DrawUtils {

    public static void drawSun(Graphics2D g, int x, int y, int r, int l, int n, Color c) {
        g.setColor(c);
        g.fillOval(x - r, y - r, 2 * r, 2 * r);

        double da = 2 * Math.PI / n;
        for (int i = 0; i < n; i++) {
            double a = i * da;
            double x1 = r * Math.cos(a) + x;
            double y1 = r * Math.sin(a) + y;
            double x2 = (r + l) * Math.cos(a) + x;
            double y2 = (r + l) * Math.sin(a) + y;
            g.drawLine((int) x1, (int) y1, (int) x2, (int) y2);
        }

    }

    public static void drawCurlyTree(Graphics2D g, int x, int y, int w, int h, int r, Color c) {
        //tree trunk
        g.setColor(Color.decode("#967E76"));
        g.fillRect(x, y, w, h);

        //tree shape
        g.setColor(c);
        g.fillOval(x + 15, y + 10, r, r);
        g.fillOval(x - 45, y + 10, r, r);
        g.fillOval(x + 13, y - 30, r, r);
        g.fillOval(x - 42, y - 30, r, r);
        g.fillOval(x + 11, y - 75, r, r);
        g.fillOval(x - 42, y - 75, r, r);
        g.fillOval(x - 13, y - 110, r, r);
    }

    public static void drawFurTree(Graphics2D g, int x, int y, int w, int h, Color c) {
        //tree trunk
        g.setColor(Color.decode("#967E76"));
        g.fillRect(x, y, w, h);

        //tree shape
        g.setColor(c);
        g.fillPolygon(new int[]{x - 70, x + 16, x + 90}, new int[]{y + 84, y - 50, y + 84}, 3);
        g.fillPolygon(new int[]{x - 70, x + 16, x + 90}, new int[]{y + 30, y - 80, y + 30}, 3);
        g.fillPolygon(new int[]{x - 70, x + 16, x + 90}, new int[]{y - 15, y - 115, y - 15}, 3);
    }

    public static void drawMushroom(Graphics2D g, int x, int y, int w, int h, int r, Color c) {
        //tree trunk
        g.drawRect(x, y, w, h);
        g.setColor(Color.decode("#F5EDDC"));
        g.fillRect(x, y, w, h);


        //mushroom cap
        g.setColor(c);
        g.fillArc(x - 13, y - 10, r, r, 0, 180);
    }

    public static void drawCloud(Graphics2D g, int x, int y, int r, Color c) {
        g.setColor(c);
        g.fillOval(x, y, r, r);
        g.fillOval(x + 40, y, r, r);
        g.fillOval(x + 80, y, r, r);
    }

    public static void drawWarningSign(Graphics2D g, int x, int y, int w, int h, Color c) {
        g.setColor(c);
        g.drawRect(x, y, w, h);
        g.fillRect(x, y, w, h);

        g.setColor(new Color(135, 100, 69));
        g.drawRect(x-37,y-20,w+70,h-30);
        g.fillRect(x-37,y-20,w+70,h-30);

        g.setColor(new Color(238, 238, 238));
        g.fillRect(x-29,y-10,w+53,h-50);

        g.setColor(new Color(210, 0, 26));
        g.drawString("Берегите",x-25,y+2);
        g.drawString("природу!",x-25,y+17);
    }
}
