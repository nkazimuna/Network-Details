package com.example.detailed;

import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView info_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //info_text = (TextView)findViewById(R.id.info_text).setT;

        NetInfo netInfo = new NetInfo(this);

        String ipAddress = netInfo.getIPAddress();
        String mac = netInfo.getWifiMACAddress();
        String wfSSID = netInfo.getWiFiSSID();
        int nettype = netInfo.getCurrentNetworkType();
        String wifiType = netInfo.getWifiIpAddress();

        ((TextView)findViewById(R.id.info_text)).setText("IP address: " + ipAddress + "\n"+
                "MAC address: " + mac + "\n" +
                "WIFI SSID: "+ wfSSID + "\n" +
                "Current network: " + nettype + "\n" +
                "WiFi IP Address: " + wifiType);

    }
}
