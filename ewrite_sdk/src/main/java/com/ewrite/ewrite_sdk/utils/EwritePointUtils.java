package com.ewrite.ewrite_sdk.utils;

/*
 * Describtion :
 * Create by sunlp on 2019/5/7 16:48
 */public class EwritePointUtils {

    public static int getF(String numberlast) {
        return Integer.parseInt(numberlast.substring(0, 1), 16);//落笔书写抬笔标识
    }

    public static String getB(String numberlast) {
        return numberlast.substring(2, 4);//笔画号
    }

    //转换后的X坐标
    public static int getX(String numberlast, float SCALE_X) {
        return (int) (Integer.parseInt(numberlast.substring(7, 9) + numberlast.substring(5, 7), 16) / SCALE_X);//X坐标
    }

    //转换后的Y坐标
    public static int getY(String numberlast, float SCALE_Y) {
        return (int) (Integer.parseInt(numberlast.substring(12, 14) + numberlast.substring(10, 12), 16) / SCALE_Y);//Y坐标
    }

    public static int getBeforeX(String numberlast) {
        return (Integer.parseInt(numberlast.substring(7, 9) + numberlast.substring(5, 7), 16));//X坐标
    }

    public static int getBeforeY(String numberlast) {
        return (Integer.parseInt(numberlast.substring(12, 14) + numberlast.substring(10, 12), 16));//Y坐标
    }

    public static String getLastPage(String numberlast) {
        return numberlast.substring(9, 25);
    }

    public static Integer getPenPower(String str) {
        return Integer.parseInt(str.substring(9, 10));
    }

}
