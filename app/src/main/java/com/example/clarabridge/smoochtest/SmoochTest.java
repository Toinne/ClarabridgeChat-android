package com.example.clarabridge.smoochtest;

import android.app.Application;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.clarabridge.core.InitializationStatus;
import com.clarabridge.core.Settings;
import com.clarabridge.core.ClarabridgeChat;
import com.clarabridge.core.ClarabridgeChatCallback;
import com.clarabridge.core.User;

public class SmoochTest extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ClarabridgeChat.init(this, new Settings("604780f3daa05e000c05930e"), new ClarabridgeChatCallback<InitializationStatus>() {
            @Override
            public void run(ClarabridgeChatCallback.Response<InitializationStatus> response) {
                 // Handle init result
            }
        });
    }

}
