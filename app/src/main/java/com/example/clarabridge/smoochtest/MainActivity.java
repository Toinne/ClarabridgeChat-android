package com.example.clarabridge.smoochtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.clarabridge.ui.ConversationActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversation);
    }

    public void initiateConversation(View view) {
        ConversationActivity.builder().show(this);
    }
}