package com.exam.myarchitecture.utils;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;

import com.exam.myarchitecture.R;

/**
 */
public class ResourceUtil {

    public static int getThemeColor(@NonNull Context context) {
        return getThemeAttrColor(context, R.attr.colorPrimary);
    }

    public static int getThemeAttrColor(@NonNull Context context, @AttrRes int attr) {
        TypedArray a = context.obtainStyledAttributes(null, new int[]{attr});
        try {
            return a.getColor(0, 0);
        } finally {
            a.recycle();
        }
    }

    public static int getStatusBarHeight(Context mContext) {
        int result = 0;
        int resourceId = mContext.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            result = mContext.getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }

//  public static void setFabBtnColor(Activity activity, FloatingActionButton fab) {
//    // 更新FAB的颜色
//    fab.setColorNormal(getThemeColor(activity));
//    fab.setColorPressed(getThemeColor(activity));
//    fab.setColorRipple(getThemeColor(activity));
//  }
//
//  public static void setFabMenuColor(Activity activity, FloatingActionMenu fab) {
//    // 更新FAB的颜色
//    fab.setMenuButtonColorNormal(getThemeColor(activity));
//    fab.setMenuButtonColorPressed(getThemeColor(activity));
//    fab.setMenuButtonColorRipple(getThemeColor(activity));
//  }
}
