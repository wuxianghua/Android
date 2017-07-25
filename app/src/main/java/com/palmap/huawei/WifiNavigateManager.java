package com.palmap.huawei;

import android.util.Log;

/**
 * Created by z00249906 on 2017/6/28.
 */

public class WifiNavigateManager {
    String thisString="who are you";
    String TAG="WifiNavigateManager";
    public WifiNavigateManager(){
        try{
            System.loadLibrary("WifiNavigateManager");
            //nGetRoute(thisString);
            Log.i(TAG,"load WifiNavigetMgr success");
        }
        catch (Exception e){
            Log.i(TAG, "WifiNavigateManager: "+e.getMessage());
        }
    }

    public String getRoute() {
        return nGetRoute(thisString);
    }

    private native String nGetRoute(String s);
}
