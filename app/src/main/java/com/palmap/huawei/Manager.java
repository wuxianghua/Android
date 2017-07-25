package com.palmap.huawei;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.palmap.huawei.wifimanager.R;

public class Manager extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifi_location_manager);
        Log.d("Manager","Enter wifiNavigateManager!");
        WifiNavigateManager wifiNavigateManager=new WifiNavigateManager();
        String route=wifiNavigateManager.getRoute();
        Log.d("Manager","route= "+route);
        Log.d("Manager","Leave wifiNavigateManager!");
        Log.d("Manager","Enter wifiLocationManager!");
        WifiLocationManager wifiLocationManager=new WifiLocationManager();
        String wifiData="this is wifi data";
        String sensorData="this is sensor data";
        wifiLocationManager.setWifiData(wifiData);
        wifiLocationManager.setSensorData(sensorData);
        String buildingName=wifiLocationManager.getBuildingName();
        int moveStatus=wifiLocationManager.getMoveStatus();
        String pos=wifiLocationManager.getPos();
        Log.d("Manager","buildingName= "+buildingName+",moveStatus="+String.valueOf(moveStatus)+",pos="+pos);
        Log.d("Manager","Leave wifiLocationManager!");
    }
}
