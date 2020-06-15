package com.example.sozieassessment.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import com.example.sozieassessment.R;

public class MeasurementSecondStepActivity extends BaseActivity {
    TextView mNextTextView, mSkipTextView;
    EditText mBraSizeEditText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_measurement_second_step);
        init();
    }

    private void init() {
        mNextTextView = findViewById(R.id.next_textview);
        mSkipTextView = findViewById(R.id.skip_textview);
        mBraSizeEditText = findViewById(R.id.bra_size_edittext);
        if (getIntent().hasExtra("type")) {
            if (getIntent().getStringExtra("type").equals("Male")) {
                mBraSizeEditText.setHint("Chest");
                mSkipTextView.setBackgroundColor(ContextCompat.getColor(this, R.color.blue_color));
            }
        }
        mNextTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNavigation(false);
            }
        });
        mSkipTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNavigation(true);
            }
        });
    }

    private void setNavigation(Boolean finishFlag) {
        if (getIntent().getStringExtra("type").equals("Male")) {
            startActivity(new Intent(MeasurementSecondStepActivity.this, MaleBodyMeasurementInstructionActivity.class));
        } else {
            startActivity(new Intent(MeasurementSecondStepActivity.this, FemaleBodyMeasurementInstructionActivity.class));
        }
        if (finishFlag) {
            finish();
        }
    }
}