package ru.vsu.cs.avdeeva_p_a;

import java.awt.*;

public class WarningSigns {
    private int x,y,w,h;
    Color c;

    public WarningSigns(int x, int y, int w, int h, Color c) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.c = c;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setW(int w) {
        this.w = w;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void setC(Color c) {
        this.c = c;
    }

    public void draw (Graphics2D g) {
        DrawUtils.drawWarningSign(g,x,y,w,h,c);
    }
}
