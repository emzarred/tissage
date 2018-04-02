package com.example.pc.emer;

/**
 * Created by pc on 02/04/2018.
 */

public class Article {
    private String code;
    private int vts;

    public Article(String code, int vts) {
        this.code = code;
        this.vts = vts;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getVts() {
        return vts;
    }

    public void setVts(int vts) {
        this.vts = vts;
    }
}
