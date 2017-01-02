package com.ongxiang.madassignment.cow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void feedback(View v) {
        Intent intent = null;
        switch(v.getId()) {
            case R.id.textView3: // R.id.textView1
                intent = new Intent(this, FeedbackActivity.class);
        }
        startActivity(intent);
    }
}
