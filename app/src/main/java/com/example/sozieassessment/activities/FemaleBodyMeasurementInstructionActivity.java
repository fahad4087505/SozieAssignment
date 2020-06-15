package com.example.sozieassessment.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.sozieassessment.R;

public class FemaleBodyMeasurementInstructionActivity extends BaseActivity implements View.OnClickListener{
    ImageView mCloseImageView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_measure_instructions_female);
        mCloseImageView=findViewById(R.id.close_imageview);
        mCloseImageView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.close_imageview:
                finish();
                break;
        }
    }
}