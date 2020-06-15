package com.example.sozieassessment.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.sozieassessment.R;

public class OptionsActivity extends BaseActivity {
    TextView mFemaleTextView, mMaleTextView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);
        init();
    }
    private void init() {
        mFemaleTextView = findViewById(R.id.female_textview);
        mMaleTextView = findViewById(R.id.male_textview);
        mFemaleTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OptionsActivity.this, MeasurementActivity.class).putExtra("type", "Female"));
            }
        });
        mMaleTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OptionsActivity.this, MeasurementActivity.class).putExtra("type", "Male"));
                finish();
            }
        });
    }
}