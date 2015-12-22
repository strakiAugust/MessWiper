package com.tyzrpvx.messwiper.views.activitys.models;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;
import java.util.List;

public class GarbageItem {

    private Drawable appIcon;
    private String appName;
    private String garbageSize;
    private Boolean shouldDel;

    public GarbageItem(String appName) {
        this.appName = appName;
    }

    //todo del
    public static List<GarbageItem> createTstList() {
        ArrayList<GarbageItem> garbageList = new ArrayList<GarbageItem>();
        for (int i = 0; i < 20; i++) {
            garbageList.add(new GarbageItem("app " + i));
        }
        return garbageList;
    }

    public String getAppName() {
        return appName;
    }
}
