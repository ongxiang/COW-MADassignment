package com.ongxiang.madassignment.cow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NewGroupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_group);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
