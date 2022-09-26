package ru.vsu.cs.avdeeva_p_a;

import java.awt.*;

public class Mushroom {
    public final int x, y,r,w,h;
    public final Color c;

    public Mushroom(int x, int y, int r, int w, int h, Color c) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.w = w;
        this.h = h;
        this.c = c;
    }

    public void draw (Graphics2D g) {
        DrawUtils.drawMushroom(g,x,y,w,h,r,c);
    }
}
