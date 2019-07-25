package com.ewrite.ewrite_sdk.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.ble.api.DataUtil;
import com.ewrite.ewrite_sdk.EwriteLeProxy;
import com.ewrite.ewrite_sdk.listener.EwritePenDataListener;
import com.ewrite.ewrite_sdk.utils.EwritePenConstant;

/*
 * Describtion :
 * Create by sunlp on 2019/7/16 14:13
 */public class EwritePenDataBroadCastReceiver extends BroadcastReceiver {
    private EwritePenDataListener penDataListener;

    @Override
    public void onReceive(Context context, Intent intent) {
        String address = intent.getStringExtra(EwriteLeProxy.EXTRA_ADDRESS);
        switch (intent.getAction()) {
            case EwriteLeProxy.ACTION_GATT_CONNECTED://连接上笔
                EwritePenConstant.PEN_ADDRESS = address;
                penDataListener.connect();
                break;
            case EwriteLeProxy.ACTION_GATT_DISCONNECTED://断开连接
                penDataListener.disConnect();
                break;
            case EwriteLeProxy.ACTION_CONNECT_ERROR://连接错误
                penDataListener.connectError();
                break;
            case EwriteLeProxy.ACTION_CONNECT_TIMEOUT://连接超时
                penDataListener.connectTimeout();
                break;
            case EwriteLeProxy.ACTION_DATA_AVAILABLE:// 接收到从机数据
                byte[] data = intent.getByteArrayExtra(EwriteLeProxy.EXTRA_DATA);
                String dataStr = DataUtil.byteArrayToHex(data).replace(" ", "");
                penDataListener.receiveData(dataStr);
                break;
        }
    }

    public void setPenDataListener(EwritePenDataListener penDataListener) {
        this.penDataListener = penDataListener;
    }
}
