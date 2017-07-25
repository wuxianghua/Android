package com.palmap.huawei;

import android.util.Log;

import static android.content.ContentValues.TAG;

/**
 * Created by z00249906 on 2017/6/28.
 */

public class WifiLocationManager{

        String TAG="WifiLocationManager";
        public WifiLocationManager(){
                try{
                        System.loadLibrary("WifiLocationManager");
                        Log.i(TAG,"load WifiLoationMgr success");
                }
                catch(Exception e){
                        Log.i(TAG, "WifiLocationManager: "+e.getMessage());
                }
        }

        void setWifiData(String wifidata)
        {
                nAddWifiData(wifidata);
        }

        void setSensorData(String sensordata)
        {
                nAddSensorData(sensordata);
        }

        String getBuildingName(){
                return nGetBuildingName();
        }

        int getMoveStatus(){
                return nGetMoveStatus();
        }
        String getPos(){
                return nGetPos();
        }

        private native void nAddWifiData(String s);
        private native void nAddSensorData(String s);
        private native String nGetBuildingName();
        private native int nGetMoveStatus();
        private native String nGetPos();
}
