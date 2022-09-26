package ru.vsu.cs.avdeeva_p_a;

import java.awt.*;

public class Cloud {
    private int x,y,r;
    private Color c;

    public Cloud(int x, int y, int r, Color c) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.c = c;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void setC(Color c) {
        this.c = c;
    }

    public void draw (Graphics2D g) {
        DrawUtils.drawCloud(g,x,y,r,c);
    }
}