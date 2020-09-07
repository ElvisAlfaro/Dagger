package com.example.daggerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.daggerapp.component.DaggerAutoComponent;
import com.example.daggerapp.entity.Auto;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private TextView tvMessage;

    @Inject
    Auto auto;

    @Inject
    Auto auto_2;

    @Inject
    Auto auto_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerAutoComponent.create().inject(this);

        tvMessage = findViewById(R.id.tvMessage);

        tvMessage.setText(auto.toString() + "\n" + auto_2.toString() + "\n" + auto_3.toString());
    }
}
