package ru.vsu.cs.avdeeva_p_a;

import java.awt.*;

public class CurlyTree {
    private int x, y, r, w, h;
    private Color c;

    public CurlyTree(int x, int y, int r, int w, int h, Color c) {
        this.x = x;
        this.y = y;
        this.r = r;
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

    public void setR(int r) {
        this.r = r;
    }

    public void setH(int h) {
        this.w = h;
    }

    public void setW(int w) {
        this.h = w;
    }

    public void setC(Color c) {
        this.c = c;
    }

    public void draw(Graphics2D g) {
        DrawUtils.drawCurlyTree(g, x, y, w, h, r, c);
    }
}

