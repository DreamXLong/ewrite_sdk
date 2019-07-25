package com.ewrite.ewrite_sdk.bean;

/*
 * Describtion :
 * Create by sunlp on 2019/5/5 10:54
 */public class EwritePoint {
    private String color;
    private String pointsStr;

    public EwritePoint(String color, String pointsStr) {
        this.color = color;
        this.pointsStr = pointsStr;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPointsStr() {
        return pointsStr;
    }

    public void setPointsStr(String pointsStr) {
        this.pointsStr = pointsStr;
    }

    @Override
    public boolean equals(Object obj) {
        EwritePoint point = (EwritePoint) obj;
        if (point.getColor().equals(getColor()) && point.getPointsStr().equals(getPointsStr())) {
            return true;
        } else {
            return false;
        }
    }
}
