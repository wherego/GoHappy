package com.example.liujianhui.gohappy.util;

import android.content.Context;
import android.widget.Toast;


/**
   *Description:  防止用户多次点击后重复new Toast<br>
   * <br/>
   *Creator:jhliu <br>
   *Date:2017/3/2 0002 17:54
 */
public class ToastUtil {

    private static Toast toast;

    /**
     * 显示Toast
     * @param context 上下文
     * @param content 要显示的内容
     */
    public static void showToast(Context context, String content) {
        if (toast == null) {
            toast = Toast.makeText(context, content, Toast.LENGTH_SHORT);
        } else {
            toast.setText(content);
        }
        toast.show();
    }

    /**
     * 显示Toast
     * @param context 上下文
     * @param resId 要显示的资源id
     */
    public static void showToast(Context context, int resId) {
        showToast(context, (String) context.getResources().getText(resId));
    }
}