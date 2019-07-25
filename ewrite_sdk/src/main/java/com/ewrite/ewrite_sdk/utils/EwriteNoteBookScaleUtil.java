package com.ewrite.ewrite_sdk.utils;

import android.content.Context;


/*
 * Describtion :
 * Create by sunlp on 2019/7/12 13:20
 */
public class EwriteNoteBookScaleUtil {
    /**
     * 参考笔记本的宽度
     */
    private static float BASE_NOTEBOOK_WIDTH = 4000;
    /**
     * 参考笔记本的高度
     */
    private static float BASE_NOTEBOOK_HEIGHT = 6800;

    public static void setBaseNotebookWidth(float baseNotebookWidth) {
        BASE_NOTEBOOK_WIDTH = baseNotebookWidth;
    }

    public static void setBaseNotebookHeight(float baseNotebookHeight) {
        BASE_NOTEBOOK_HEIGHT = baseNotebookHeight;
    }

    /**
     * 得到宽度的缩放比例
     *
     * @return
     */
    public static float getWidthScale(Context context) {
        return BASE_NOTEBOOK_WIDTH / EwriteScreenUtil.getScreenWidth(context);
    }

    /**
     * 得到高度的缩放比例
     *
     * @return
     */
    public static float getHeightScale(Context context) {
        return BASE_NOTEBOOK_HEIGHT / EwriteScreenUtil.getScreenHeight(context);
    }
}
